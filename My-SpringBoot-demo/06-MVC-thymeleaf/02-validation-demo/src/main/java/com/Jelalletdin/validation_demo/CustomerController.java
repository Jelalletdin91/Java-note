package com.Jelalletdin.validation_demo;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){

        StringTrimmerEditor stringTrimerEditor= new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimerEditor);
    }

    @GetMapping("/")
    public String showForm(Model model){

        model.addAttribute("customer", new Customer());

        return "customerForm";


    }

   @PostMapping("/processCostumer")
    public String processCostumer(
                    @Valid @ModelAttribute("customer") Customer theCustomer,
                            BindingResult bindingResult) {

       if (bindingResult.hasErrors()) {
           return "customerForm";
       }

       return "processCostumer";
   }
            }

