package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(Model model, @RequestParam(value="name", defaultValue = "John Smith") String name, @RequestParam(value="number", defaultValue = "0") Integer number) {

        model.addAttribute("doctor", new Doctor(number, name));
        return "/doctor.html";
    }
}
