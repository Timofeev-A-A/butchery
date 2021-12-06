package ru.timofeev.butchery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.timofeev.butchery.entities.Admin;
import ru.timofeev.butchery.entities.Request;
import ru.timofeev.butchery.repositories.RequestRepository;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    RequestRepository requestRepository;
    private final Admin admin = new Admin("admin", "pass");

    @GetMapping
    public String login(Model model) {
        model.addAttribute("adminForm", new Admin());
        return "login";
    }

    @PostMapping
    public String loggedIn(@ModelAttribute("adminForm") Admin aForm, BindingResult bindingResult, Model model) {
        if (aForm.getLogin().equals(admin.getLogin()) && aForm.getPassword().equals(admin.getPassword())) {
            List<Request> requestList = requestRepository.findAll();
            model.addAttribute("requests", requestList);
            return "requests";
        }
        else {
            return "redirect:/";
        }
    }
}
