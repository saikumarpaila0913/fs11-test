import com.university.branch.Controller.Valid;
import com.university.branch.Model.Department;
import com.university.branch.Model.Student;
import com.university.branch.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
//import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
//@RequestMapping("/students")

public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping
    public String  addStudent(@Valid @RequestBody Student student) {

        return studentService.addStudent(student);
    }



    @PatchMapping("/{studentId}/update-department")
    public String updateStudentDepartment(
            @PathVariable Long studentId,
            @RequestParam Department department
    ) {

        return studentService.updateStudentDepartment(studentId, department);
    }

    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable Long studentId) {

        return  studentService.deleteStudent(studentId);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return students;
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Long studentId) {
         studentService.getStudentById(studentId);
        return  studentService.getStudentById(studentId);
    }
}
