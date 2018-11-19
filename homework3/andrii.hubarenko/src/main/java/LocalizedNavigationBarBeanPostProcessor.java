import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.ResourceBundle;

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

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Field field : bean.getClass().getDeclaredFields()) {
            if (isStringField(field) && isAnnotatedWithLocalized(field)) {
                setLocalizedValue(bean, field);
            }
        }
        return bean;
    }
    private boolean isStringField(Field field) {
        return field.getType().equals(String.class);
    }
    private boolean isAnnotatedWithLocalized(Field field) {
        return field.isAnnotationPresent(LocalizedString.class);
    }
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