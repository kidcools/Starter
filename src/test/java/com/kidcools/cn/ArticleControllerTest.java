package com.kidcools.cn;

import com.kidcools.cn.controller.UserController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
public class ArticleControllerTest {
    private static MockMvc mockMvc;
    @BeforeAll
    static void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(UserController.class).build();
    }
    /**
     *测试添加Article
     * @throws Exception
     */
    @Test
    public void tesUpdateArticle() throws  Exception{
        //初始化数据
        String article = "{\n" +
                "    \"id\": 1,\n" +
                "    \"author\": \"zimug\",\n" +
                "    \"title\": \"手摸手教你开发spring boot\",\n" +
                "    \"content\": \"c\",\n" +
                //"    \"createTime\": \"2017-07-16 05:23:34\",\n" +
                //"    \"reader\":[{\"name\":\"zimug\",\"age\":18},{\"name\":\"kobe\",\"age\":37}]\n" +
                "}";

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.request(HttpMethod.PUT, "/articles/101")
                .contentType("application/json;charset=utf-8")
                .content(article))
                .andDo(print())
                .andReturn();
        result.getResponse().setCharacterEncoding("utf-8");
        log.info("Testresult:"+result.getResponse().getContentAsString());
    }
}
