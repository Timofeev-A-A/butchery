package ru.timofeev.butchery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.timofeev.butchery.entities.Request;
import ru.timofeev.butchery.repositories.RequestRepository;

@Controller
@RequestMapping("/request")
public class RequestController {

    private final RequestRepository requestRepository;

    @Autowired
    public RequestController(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @GetMapping
    public String request(Model model) {
        model.addAttribute("rqForm", new Request());
        return "request";
    }

    @PostMapping
    public String addRequest(@ModelAttribute("rqForm") Request rForm, BindingResult bindingResult) {
        requestRepository.saveAndFlush(rForm);
        return "redirect:/";
    }
}
