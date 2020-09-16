package com.mybatis;

import lombok.Data;

@Data
public class Student {
    public String  sid;
    public String  sname;
    public Teacher teacher;
}
