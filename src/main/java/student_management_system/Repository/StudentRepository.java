package student_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student_management_system.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
