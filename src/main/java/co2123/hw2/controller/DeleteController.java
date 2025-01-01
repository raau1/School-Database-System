package co2123.hw2.controller;

import co2123.hw2.repo.GradeRepository;
import co2123.hw2.repo.PupilRepository;
import co2123.hw2.repo.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {

    // Handles operations related to schools
    @Autowired
    private SchoolRepository schoolRepository;

    // Handles operations related to pupils
    @Autowired
    private PupilRepository pupilRepository;

    // Handles operations related to grades
    @Autowired
    private GradeRepository gradeRepository;

    // Deletes a school by its ID.
    @GetMapping("/deleteSchool")
    public String deleteSchool(@RequestParam("id") int id) {
        schoolRepository.deleteById(id); // Remove the school from the database
        return "redirect:/"; // Redirect back to the home page
    }

    //Deletes a pupil by their address.
    @GetMapping("/deletePupil")
    public String deletePupil(@RequestParam("address") String address) {
        pupilRepository.deleteById(address); // Remove the pupil from the database
        return "redirect:/"; // Redirect back to the home page
    }

    //Deletes a grade by its unique identifier.
    @GetMapping("/deleteGrade")
    public String deleteGrade(@RequestParam("identifier") int identifier) {
        gradeRepository.deleteById(identifier); // Remove the grade from the database
        return "redirect:/"; // Redirect back to the home page
    }
}
