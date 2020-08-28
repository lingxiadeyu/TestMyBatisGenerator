package com.example.testmybatisgenerator.entity;

public class AddUserCase {
    private Integer id;

    private Integer age;

    private String expected;

    private Integer isDelete;

    private String password;

    private Integer permission;

    private Integer sex;

    private String userName;

    public AddUserCase(Integer id, Integer age, String expected, Integer isDelete, String password, Integer permission, Integer sex, String userName) {
        this.id = id;
        this.age = age;
        this.expected = expected;
        this.isDelete = isDelete;
        this.password = password;
        this.permission = permission;
        this.sex = sex;
        this.userName = userName;
    }

    public AddUserCase() {
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

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected == null ? null : expected.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}