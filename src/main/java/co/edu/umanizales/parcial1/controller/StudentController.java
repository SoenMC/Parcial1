package co.edu.umanizales.parcial1.controller;


import co.edu.umanizales.parcial1.model.CityCount;
import co.edu.umanizales.parcial1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/student")
public class StudentController {
    @Autowired
    private StudentService studentService ;

    @GetMapping(path = "/studentswork")
    public List<CityCount> getCantStudentsJob()
    {
        return studentService.getCantStudentsJob();
    }

}
