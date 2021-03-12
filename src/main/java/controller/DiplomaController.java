package controller;

import dto.StudentDTO;
import dto.DiplomaDTO;

import dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import services.IDiplomaService;

import java.util.List;


@RestController
public class DiplomaController {

    @Autowired
    private IDiplomaService diplomaService;

    //method for get certification of a student
    //retreive a StundentDTO with: name and list of courses  (name and grades)
    @PostMapping("/diploma")
    @ResponseBody
    public DiplomaDTO getDiploma(@RequestBody StudentDTO student){
        return diplomaService.getDiploma(student);
    }

}
