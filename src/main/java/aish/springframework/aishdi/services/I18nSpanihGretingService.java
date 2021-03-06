package aish.springframework.aishdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanihGretingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Spanish Greeting Service";
    }
}
