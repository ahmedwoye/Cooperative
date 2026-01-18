package com.example.Cooperative.Controller;


import com.example.Cooperative.Entity.Calculation;
import com.example.Cooperative.Service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdditionController {



 private final CalculationService service;

    public AdditionController(CalculationService service) {
        this.service = service;
    }


    @GetMapping("/")
    public String showForm() {
        return "add";
    }

    @PostMapping("/add")
    public String addNumbers(@RequestParam int number1,
                             @RequestParam int number2,
                             Model model) {

        Calculation result = service.addNumbers(number1, number2);
        model.addAttribute("result", result.getResult());
        return "add";
    }
}
