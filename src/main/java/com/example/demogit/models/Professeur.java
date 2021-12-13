package com.example.demogit.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Professeur {

     public  String name;

     List<Student> studentList;

}
