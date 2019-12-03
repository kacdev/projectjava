package pl.example.spring.punkty;


import io.vavr.collection.List;
import org.springframework.stereotype.Service;
import pl.example.spring.punkty.db.StudentRepozytory;
import pl.example.spring.punkty.db.StudentRow;

import java.util.function.Function;

@Service
public class StudentService {
    private final StudentRepozytory repository;
    private List<Student> students = List.empty();

    public StudentService(StudentRepozytory repository) {
        this.repository = repository;
    }



    List<Student> getStudents() {
        return List.ofAll(this.repository.findAll())
                .map(StudentRow::toStudent);
    }



    public Student addStudent(final NewStudent newStudent) {
        return this.repository.save(new StudentRow(
                newStudent.name,
                newStudent.number,
                newStudent.grupa)).toStudent();
    }
}

