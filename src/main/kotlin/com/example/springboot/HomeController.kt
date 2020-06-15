package com.example.springboot

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class HomeController {

    @GetMapping("/")
    fun homeForm(model : Model) : String{
        model.addAttribute("user" , User())
        return "home"
    }

    @PostMapping("/user")
    fun homeSubmit(@ModelAttribute user : User) : String{
        if (user.firstName.isNullOrEmpty() or user.lastName.isNullOrEmpty()) return "error"
        return "user"
    }
}