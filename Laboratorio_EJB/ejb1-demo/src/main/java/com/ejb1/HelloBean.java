package com.ejb1;

import jakarta.ejb.Stateless;

@Stateless
public class HelloBean {
    public String sayHello(String name) {
        return "Olá " + name + ", este é um EJB!";
    }
}
