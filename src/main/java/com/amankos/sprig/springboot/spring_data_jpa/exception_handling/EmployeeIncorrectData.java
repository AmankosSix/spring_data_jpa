package com.amankos.sprig.springboot.spring_data_jpa.exception_handling;

public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData() {
    }

    public EmployeeIncorrectData(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
