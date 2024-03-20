//package com.example.demo.testwithsowmiya;
//
//import com.example.demo.testwithsowmiya.Service.ItemService;
//import com.example.demo.testwithsowmiya.controller.ItemController;
//import com.example.demo.testwithsowmiya.model.Item;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.skyscreamer.jsonassert.JSONAssert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(ItemController.class)
//public class ItemControllerTest {
//    @Autowired
//    MockMvc mockMvc;
//
//    @MockBean
//    ItemService itemService;
//
//    @Test
//    public void ItemController() throws Exception {
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/item").accept(MediaType.APPLICATION_JSON);
//        MvcResult result = mockMvc.perform(requestBuilder)
//                .andExpect(status().isOk())
//                //.andExpect(content().json("{\"id\":1,\"name\":\"maggi\",\"price\":12.0,\"quantity\":2}"))
//                .andReturn();
//        JSONAssert.assertEquals("{id:1,name:maggi,price:12.0,quantity:2}", result.getResponse().getContentAsString(), false);
//    }
//
////    @Test
////    public void ItemServiceTest() throws Exception {
////        when(itemService.retrieveHardCodeData()).thenReturn(new Item(2, "Item2", 100, 10));
////        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/dummy-item-from-service").accept(MediaType.APPLICATION_JSON);
////        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk())
//////                .andExpect(content().json("{\"id\":1,\"name\":\"ball\",\"price\":10,\"quantity\":2}"))
////                .andReturn();
////        JSONAssert.assertEquals("[{id:2,name:Item2,price:100,quantity:10}]", result.getResponse().getContentAsString(), false);
////
////    }
//
//    @Test
//    public void ItemRepsoitory() throws Exception {
//        when(itemService.retrieveAllData()).thenReturn(Arrays.asList(new Item(1, "abc", 100, 10),
//                (new Item(2, "abc", 100, 10)),
//                (new Item(3, "abc", 100, 10))));
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/all-data").accept(MediaType.APPLICATION_JSON);
//        MvcResult result = mockMvc.perform(requestBuilder)
//                .andExpect(status().isOk())
//                .andExpect(content().json("[{id:1,name:abc,price:100,quantity:10},{id:2,name:abc,price:100,quantity:10},{id:3,name:abc,price:100,quantity:10}]"))
//                .andReturn();
////        JSONAssert.assertEquals("{id:1,name:maggi,price:12.0,quantity:2}", result.getResponse().getContentAsString(), false);
//    }
//
//
//}
