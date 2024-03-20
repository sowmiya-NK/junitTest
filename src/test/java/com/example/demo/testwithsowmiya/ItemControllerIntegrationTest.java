//package com.example.demo.testwithsowmiya;
//
//import org.json.JSONException;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.skyscreamer.jsonassert.JSONAssert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class ItemControllerIntegrationTest {
//
//    @Autowired
//    TestRestTemplate testRestTemplate;
//    @Test
//    public void ItemControllerTest() throws JSONException {
//        String response=testRestTemplate.getForObject("/all-data",String.class);
//        JSONAssert.assertEquals("[{id:1},{id:2},{id:3}]",response,false);
//
//
//    }
//}
