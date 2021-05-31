package com.kidcools.cn.service;

import com.kidcools.cn.Entity.AjaxResponse;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Json2XmlConverter extends AbstractHttpMessageConverter<AjaxResponse> {

    @Override
    protected boolean supports(Class aClass) {

        return (AjaxResponse.class==aClass);
    }


    @Override
    protected AjaxResponse readInternal(Class<? extends AjaxResponse> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(AjaxResponse ajaxResponse, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        httpOutputMessage.getBody().write("kidcools1".getBytes(StandardCharsets.UTF_8));
    }
}
