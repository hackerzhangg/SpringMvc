package com.bigjava.springmvc.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Author zgp
 * @Since 2021 -03 -05 13 :45
 * @Description
 */
@Component
public class MyDateConverter implements Converter<String, Date> {

    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

    public Date convert(String s) {
        try {
            return simpleDateFormat.parse(s);
        }catch (ParseException p){
            p.printStackTrace();
        }
        return null;
    }
}
