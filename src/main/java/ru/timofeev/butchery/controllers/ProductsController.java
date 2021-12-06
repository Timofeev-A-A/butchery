package ru.timofeev.butchery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.timofeev.butchery.entities.Product;
import ru.timofeev.butchery.repositories.ProductRepository;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public String products(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);
        return "products";
    }
}
