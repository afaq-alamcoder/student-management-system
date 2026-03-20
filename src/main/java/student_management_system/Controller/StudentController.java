package student_management_system.Controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import student_management_system.Service.StudentService;
import student_management_system.entity.Student;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;


    public StudentController(StudentService service) {
        this.service = service;
    }
        @GetMapping
        public List<Student> getAll(){
            return service.getAll();
        }

    @PostMapping("/batch")  // new endpoint
    public List<Student> addMultipleStudents(@RequestBody List<Student> students){
        return service.saveAll(students);
    }

        @GetMapping("/{id}")
    public Student getBYId(@PathVariable Long id){
        return service.getById(id);

    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "Student Sucessfully deleted";
    }

    }

