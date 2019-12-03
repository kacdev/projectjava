package pl.example.spring.punkty;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PunktyController {

    private final StudentService service;
    public PunktyController(StudentService _service) {
        service = _service;
    }

    //private StudentService service = new StudentService(repository);


    @RequestMapping(value = "/students", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getUsers(){

        return this.service.getStudents().asJava();
    }

    @RequestMapping(value = "/students", method = POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Student addUser(@RequestBody NewStudent student){
        return this.service.addStudent(student);
    }
}
