package com.example.sindhu;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    Map<Integer,Student> db = new HashMap<>();

        public Student getStudent(int id){

            return db.get(id);
        }
        public String addStudent(Student student) {
            int id = student.getAdmnNo();
            db.put(id, student);
            return "Added succesfully";
        }
        public String deleteStudent(int id){
            if(!db.containsKey(id)){
                return "Invalid id";
            }
            db.remove(id);
            return "Student succesfully removed";
        }
        public String updateStudent(int id,int age){
            if(!db.containsKey(id)){
                return null;
            }
            db.get(id).setAge(20);
            return "Age updated succesfully";
        }

}
