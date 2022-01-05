package com.yzzg.biz.stream_00;

import java.util.Objects;

public class Employee {
    private String name;
    private Integer age;
    private Double salay;

    public Employee(String name, Integer age, Double salay){
        this.name = name;
        this.age = age;
        this.salay = salay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalay() {
        return salay;
    }

    public void setSalay(Double salay) {
        this.salay = salay;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salay=" + salay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(salay, employee.salay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salay);
    }
}


