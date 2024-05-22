package com.akshay.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    
    private final MyFirstClass myFirstClass;

    @Autowired
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory() {
        return "The dependency is saying:  " + myFirstClass.sayHello();
    }
}
