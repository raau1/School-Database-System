package co2123.hw2.controller;

import co2123.hw2.repo.GradeRepository;
import co2123.hw2.repo.PupilRepository;
import co2123.hw2.repo.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {

    // Repository for managing schools
    @Autowired
    private SchoolRepository schoolRepository;

    // Repository for managing pupils
    @Autowired
    private PupilRepository pupilRepository;

    // Repository for managing grades
    @Autowired
    private GradeRepository gradeRepository;

    //Fetches the list of all schools and adds it to the model.
    @GetMapping("/listSchool")
    public String listSchool(Model model) {
        model.addAttribute("data", schoolRepository.findAll()); // Add all schools to the model
        return "list"; // Render the "list" view
    }

    // Fetches the list of all pupils and adds it to the model.
    @GetMapping("/listPupil")
    public String listPupil(Model model) {
        model.addAttribute("data", pupilRepository.findAll()); // Add all pupils to the model
        return "list"; // Render the "list" view
    }

    //Fetches the list of all grades and adds it to the model.
    @GetMapping("/listGrade")
    public String listGrade(Model model) {
        model.addAttribute("data", gradeRepository.findAll()); // Add all grades to the model
        return "list"; // Render the "list" view
    }
}
