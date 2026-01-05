package com.tcs.pms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.tcs.pms.bean.Employee;
import com.tcs.pms.service.EmployeeService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class JSPController {

    @Autowired
    private EmployeeService service;

    

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error,
                        Model model) {

        if (error != null) {
            model.addAttribute("msg", 
              "New employee? Please register first.");
        }
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("emp", new Employee());
        return "register";
    }

    @PostMapping("/register")
    public String saveEmployee(@ModelAttribute Employee emp,Model model) {

        PasswordEncoder encoder = new BCryptPasswordEncoder();
        emp.setPassword(encoder.encode(emp.getPassword()));

        service.saveEmp(emp);

        return "redirect:/login";
    }

    @GetMapping("/home")
    public String home(Model model) {

        Employee emp = service.getLoggedInEmployee();
        model.addAttribute("emp", emp);

        return "home";
    }
  }
