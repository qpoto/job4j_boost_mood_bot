package ru.job4j.bmb.services;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;
import ru.job4j.bmb.content.Content;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BotCommandHandler implements BeanNameAware {
    void receive(Content content) {
        System.out.println(content);
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through @PostConstruct init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will be destroyed via @PreDestroy.");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }
}