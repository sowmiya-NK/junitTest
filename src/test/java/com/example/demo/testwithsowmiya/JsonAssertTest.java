package com.example.demo.testwithsowmiya;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(JsonAssertTest.class)
public class JsonAssertTest {
    String actualJson=
           "{\"id\":1,\"name\":\"maggi\",\"price\":12.0,\"quantity\":2}";
    @Test
    public void JsonAssert() throws JSONException {
        String exceptedResult=  "{\"id\":1,\"name\":\"maggi\",\"price\":12.0}";
        JSONAssert.assertEquals(exceptedResult,actualJson,false);

    }

}
