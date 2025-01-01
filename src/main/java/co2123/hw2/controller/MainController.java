package co2123.hw2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    //Handles the root URL ("/") of the application.
    @RequestMapping("/")
    public String start() {
        return "start"; // Render the "start" view
    }
}
