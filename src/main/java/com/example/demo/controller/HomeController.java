package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping("/")
    public String sayHello(Model model) {

        ArrayList<Person> lijstje = new ArrayList<>();
        lijstje.add(new Person("Klaas",64));
        lijstje.add(new Person("Duncan", 28));
        lijstje.add(new Person("Victor",49));

        Person p = new Person("Piet",30);

        model.addAttribute("lijstje", lijstje);

        model.addAttribute("message","Hello World");
        model.addAttribute("person", p);

        model.addAttribute("title","Dit is mijn title");

        return "welcome";
    }

}
