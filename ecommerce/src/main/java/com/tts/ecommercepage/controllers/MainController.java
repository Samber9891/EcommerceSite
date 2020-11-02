package com.tts.ecommercepage.controllers;

@Controller
@ControllerAdvice 

public class MainController {

    // @Autowired
    // ProductService productService; 

    @GetMapping("/")
   public String main() {
       return "main";
   }
        
    }
