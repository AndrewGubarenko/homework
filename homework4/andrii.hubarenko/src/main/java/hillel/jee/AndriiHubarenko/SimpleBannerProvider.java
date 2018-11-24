package hillel.jee.AndriiHubarenko;

import org.jline.utils.AttributedString;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleBannerProvider implements PromptProvider {

    private String getBannre() {
        return "                          )      )   (                                                         \n" +
                "   (              (    ( /(   ( /(   )\\ )     (          (             (           )           \n" +
                "   )\\             )\\   )\\())  )\\()) (()/(     )\\      )  )\\        (   )\\    )  ( /(      (    \n" +
                " (((_)   (    (  ((_) ((_)\\  ((_)\\   /(_))  (((_)  ( /( ((_) (    ))\\ ((_)( /(  )\\()) (   )(   \n" +
                " )\\___   )\\   )\\  _     ((_)   ((_) (_))    )\\___  )(_)) _   )\\  /((_) _  )(_))(_))/  )\\ (()\\  \n" +
                "((/ __| ((_) ((_)| |   / _ \\  / _ \\ | _ \\  ((/ __|((_)_ | | ((_)(_))( | |((_)_ | |_  ((_) ((_) \n" +
                " | (__ / _ \\/ _ \\| |  | (_) || (_) ||  _/   | (__ / _` || |/ _| | || || |/ _` ||  _|/ _ \\| '_| \n" +
                "  \\___|\\___/\\___/|_|   \\___/  \\___/ |_|      \\___|\\__,_||_|\\__|  \\_,_||_|\\__,_| \\__|\\___/|_|   \n" +
                "                                                                                              type here -> ";
    }

    @Override
    public AttributedString getPrompt() {
        return AttributedString.fromAnsi(getBannre());
    }
}
