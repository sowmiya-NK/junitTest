package com.example.demo.testwithsowmiya;

import com.example.demo.testwithsowmiya.controller.HelloWorldController;;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)//spring run
@WebMvcTest(HelloWorldController.class)//which controller test
public class HelloWorldControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void helloWorldTest() throws Exception {
        //call url return application json
        RequestBuilder requestBuilder= MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON);
        MvcResult result=mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World")).andReturn();

        assertEquals("Hello World",result.getResponse().getContentAsString());


    }


    @Test
    public void justChecking(){
        assertTrue(true);
    }
}
