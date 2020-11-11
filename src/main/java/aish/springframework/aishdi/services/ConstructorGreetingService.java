package aish.springframework.aishdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService  implements  GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World - Constuctor";
    }
}
