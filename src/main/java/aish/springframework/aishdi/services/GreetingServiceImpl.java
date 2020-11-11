package aish.springframework.aishdi.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World - inside sayGreeting";
    }
}
