package com.modernjava.functionalproramming;

import java.util.List;

public class Instructor {
    private String name;
    private String title;
    private String gender;
    private int age;
    private List<String> courses;
    private int yearsOfExperience;
    private boolean isOnlineCourses;

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                ", yearsOfExperience=" + yearsOfExperience +
                ", isOnlineCourses=" + isOnlineCourses +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isOnlineCourses() {
        return isOnlineCourses;
    }

    public void setOnlineCourses(boolean onlineCourses) {
        isOnlineCourses = onlineCourses;
    }

}
