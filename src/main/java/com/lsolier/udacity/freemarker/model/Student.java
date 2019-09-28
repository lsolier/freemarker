package com.lsolier.udacity.freemarker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student {

  private Integer Id;
  private String studentName;
  private Double grade;

}
