package com.bigjava.springmvc.model;

import java.util.List;

/**
 * @Author zgp
 * @Since 2021 -03 -05 13 :41
 * @Description
 */
public class Author {

    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
