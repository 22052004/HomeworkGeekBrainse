package ru.gb.java.lisson2;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private String phoneNamber;
    private float salary;
    private int age;
    public Employee(String FIO, String position, String email, String phoneNamber, float salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNamber = phoneNamber;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("Ф.И.О: " + FIO);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Номер телефона: " + phoneNamber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    public int getAge(){
        return age;
    }
}
