package com.kidcools.cn.converter;



import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
