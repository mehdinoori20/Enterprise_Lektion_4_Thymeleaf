package com.mehdi.Enterprise_Lektion_4_Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController --> returns a body as response

@Controller    // --> Returns documents
public class StudentController {

    @GetMapping("/student")
    public String studentPage(Model studentModel) {

        Student student = new Student("Benny", "Benny123@hotmail.com");

        studentModel.addAttribute("myStudent", student);


        return "student"; // Thymeleaf, does not require .html
    }
}
