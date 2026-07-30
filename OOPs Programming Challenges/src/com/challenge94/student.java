package com.challenge94;

public class student {
    private final String name ;
    private final char grade ;

    public student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + ": "+grade;
    }
}
