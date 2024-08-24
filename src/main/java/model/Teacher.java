package model;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table
public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUId = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String salary;
    private String TeacherName;

    // @OneToOne(cascade = CascadeType.ALL)
    // private Address address;

    @ManyToMany(targetEntity = Cohort.class)
    private Set<Cohort> cohort;

    public void setCohort(Set<Cohort> cohort) {
        this.cohort = cohort;
    }

    // public Address getAddress() {
//        return address;
//    }

    // public void setAddress(Address address) {
//        this.address = address;
//    }

    public Teacher(String salary, String teacherName, Set<Cohort> cohort) {
        this.salary = salary;
        TeacherName = teacherName;
    }

    public  Teacher(String salary, String teacherName){
        super();
        this.salary = salary;
        this.TeacherName = teacherName;
    }

    public Teacher() {
    }

    public Teacher(String salary, String teacherName, Department deptartment){
        this.salary =salary;
        this.TeacherName = teacherName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

}
