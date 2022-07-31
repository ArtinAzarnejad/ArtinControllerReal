package api;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Students/")
public class StudentController {
    @GetMapping("{nationalCode}")
    @ResponseStatus(HttpStatus.OK)
    public Student getStudent(String nationalCode)
    {
return new Student("11111111111");
    }
}
