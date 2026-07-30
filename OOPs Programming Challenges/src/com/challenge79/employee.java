package com.challenge79;

    class employee {
    private String name ;
    private int age  ;
    private double salary ;

    employee(String name , int age , double salary){
        this.name = name ;
        this.age = age ;
        this.salary = salary ;
    }

    String getEmployeeDetails(){
        return "Employee Name : "+name+" Employee Age : "+age+" Employee Salary : "+salary ;
    }

    public String getName(){
        return name ;
    }

    public int getAge(){
        return age ;
    }

    public double getSalary(){
        return salary ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public void setAge(int age){
        this.age = age ;
    }

    public void setSalary(double salary){
        this.salary = salary ;
    }
}
