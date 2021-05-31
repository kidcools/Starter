package com.kidcools.cn.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AjaxResponse {
    private boolean isok;
    private int code;//200 400 500
    private String desc;
    private Object data;

    /**
     * 返回成功數據
     * @param data
     * @return
     */
    public static AjaxResponse success(Object data){
        AjaxResponse response = AjaxResponse.builder().isok(true).code(200).desc("success").data(data).build();
        return response;
    }

    /**
     * 普通操作成功
     * @return
     */
    public static AjaxResponse success(){
        AjaxResponse response = AjaxResponse.builder().isok(true).code(200).desc("操作成功").data(null).build();
        return response;
    }
}
