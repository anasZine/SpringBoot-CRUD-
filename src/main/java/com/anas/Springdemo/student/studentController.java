package com.anas.Springdemo.student;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {
    //@Autowired i want to inject this bean studentservice into this controller this name filed injection
    private  studentService studentService;

    // with constructor he check the param to now its bean injection
    public studentController( @Qualifier("db") studentService  studentService) {

        this.studentService = studentService;
    }//constructor injection
    @PostMapping
  public student save(
         @RequestBody
         student student
  ){
        return studentService.save(student);
  }
  @GetMapping("/{email}")
  public  student findByEmail(@PathVariable("email") String email){
        return  studentService.findByEmail(email);
  }

    @GetMapping
    public List<student> findAllStudents() {
        return studentService.findAllStudents();

    }
@PutMapping
    public student updateStudent(@RequestBody student student){
  return  studentService.update(student);
    }
@DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
        studentService.delete(email);

    }

}
