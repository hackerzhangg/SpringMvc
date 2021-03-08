package com.bigjava.springmvc.model;

import java.util.Map;

/**
 * @Author zgp
 * @Since 2021 -03 -08 14 :17
 * @Description
 */
public class Teacher {

    private Map<String, Object> info;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "info=" + info +
                '}';
    }
}
