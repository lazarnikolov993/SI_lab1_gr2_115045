/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si.lab.pkg1;

import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author lazar
 */
public class Faculty {
    
    String facultyName;
    List<Student> students;

    public Faculty(String facultyName, List<Student> students) {
        this.facultyName = facultyName;
        this.students = students;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public boolean addStudent(Student student)
    {
        return students.add(student);
    }
    
    public int getNumberOfStudent()
    {
        return students.size();
    }
    
    public double studentsAverageGrade()
    {
        double studentsAverageGradeSum = 0;
        
        for(Student student : students)
        {
            studentsAverageGradeSum += student.getAverage();
        }
        
        return studentsAverageGradeSum/students.size();
    }
    
}
