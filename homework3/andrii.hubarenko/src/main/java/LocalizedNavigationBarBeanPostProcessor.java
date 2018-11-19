import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Bean Post Processor uses for localizing String fields
 * using annotation @LocalizedString
 */
public class LocalizedNavigationBarBeanPostProcessor implements BeanPostProcessor {
    private Locale locale;
    private ResourceBundle label;

    public LocalizedNavigationBarBeanPostProcessor() {
        locale = Locale.getDefault();
        label = ResourceBundle.getBundle("locale/navigationBar", locale);
    }

    public LocalizedNavigationBarBeanPostProcessor(String language) {
        locale = new Locale(language);
        label = ResourceBundle.getBundle("locale/navigationBar", locale);
    }

    /**
     * Method process the bean and localizes all String fields
     * annotated by @LocalizedString annotation
     * @param bean
     * @param beanName
     * @return bean
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Field field : bean.getClass().getDeclaredFields()) {
            if (isStringField(field) && isAnnotatedWithLocalized(field)) {
                setLocalizedValue(bean, field);
            }
        }
        return bean;
    }

    /**
     * Checking for correct type of annotated field
     * @param field
     * @return
     */
    private boolean isStringField(Field field) {
        return field.getType().equals(String.class);
    }

    /**
     * Checkin is field annotated with LocalizedString annotation
     * @param field
     * @return true or false
     */
    private boolean isAnnotatedWithLocalized(Field field) {
        return field.isAnnotationPresent(LocalizedString.class);
    }

    /**
     * Method sets the localized value of field
     * @param bean
     * @param field
     */
    private void setLocalizedValue(Object bean, Field field) {
        String key = field.getAnnotation(LocalizedString.class).key();
        String localizedValue = label.getString(key);
        field.setAccessible(true);
        try {
            field.set(bean, localizedValue);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}