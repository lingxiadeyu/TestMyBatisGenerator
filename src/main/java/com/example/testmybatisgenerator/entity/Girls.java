package com.example.testmybatisgenerator.entity;


public class Girls {
    private Integer id;

    private Integer age;

    private String cupsize;

    public Girls(Integer id, Integer age, String cupsize) {
        this.id = id;
        this.age = age;
        this.cupsize = cupsize;
    }

    public Girls() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize == null ? null : cupsize.trim();
    }

    @Override
    public String toString() {
        return "Girls{" +
                "id=" + id +
                ", age=" + age +
                ", cupsize='" + cupsize + '\'' +
                '}';
    }
}