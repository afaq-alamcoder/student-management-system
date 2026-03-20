package student_management_system.Service;


import org.springframework.stereotype.Service;
import student_management_system.Repository.StudentRepository;
import student_management_system.entity.Student;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }
    //Create
        public List<Student> getAll(){
            return repo.findAll();
        }
        //GetAll

    public Student getById(Long id){
        return repo.findById(id)
                .orElseThrow(()-> new RuntimeException("Student not found"));

    }
    public void delete(Long id){
        repo.deleteById(id);
    }

    public List<Student> saveAll(List<Student> students) {
    return repo.saveAll(students);
    }
}



