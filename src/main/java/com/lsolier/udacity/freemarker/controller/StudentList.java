package com.lsolier.udacity.freemarker.controller;

import com.lsolier.udacity.freemarker.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentList {

  @RequestMapping("/list")
  public String list(Model model) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student(1,"Luis Solier",new Double(20)));
    studentList.add(new Student(1,"Ragnar",new Double(15)));
    studentList.add(new Student(1,"Vegito",new Double(12)));
    model.addAttribute("list", studentList);
    return "list";
  }
}
