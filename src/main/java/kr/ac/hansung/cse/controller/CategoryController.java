package kr.ac.hansung.cse.controller;

import kr.ac.hansung.cse.model.CategoryForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public String list(Model model) {
        return "categoryList";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("categoryForm", new CategoryForm());
        return "categoryForm";
    }
}