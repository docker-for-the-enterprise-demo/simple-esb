import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

public class Main {
    public static void main(String... args) throws MuleException {
        MuleContext context = new DefaultMuleContextFactory().createMuleContext(new SpringXmlConfigurationBuilder("mule-config.xml"));
        context.start();
    }
}
