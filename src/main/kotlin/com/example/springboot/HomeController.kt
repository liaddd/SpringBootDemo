package com.example.springboot

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class HomeController {

    @RequestMapping("/")
    fun home(@RequestParam num : Int , model : Model) : String{

        var user = ""
        when(num){
            1 -> user = "user 1"
            2 -> user = "user 2"
            3 -> user = "user 3"
            4 -> user = "user 4"
        }
        model.addAttribute("user" , user)
        return "home"
    }
}