package com.lyf.pojo;

public class User {
    private String name;
    private Integer age;
    private String set;

    public User(String name, Integer age, String set) {
        this.name = name;
        this.age = age;
        this.set = set;
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

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", set='" + set + '\'' +
                '}';
    }
}
