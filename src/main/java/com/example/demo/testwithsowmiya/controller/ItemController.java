package com.example.demo.testwithsowmiya.controller;

import com.example.demo.testwithsowmiya.Service.ItemService;
import com.example.demo.testwithsowmiya.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;



    @GetMapping("/item")
    public Item dummyItem(){

        return new Item(1,"maggi",12.00,2);    }

    @GetMapping("/dummy-item-from-service")
    public List<Item> dummyItemFromService(){
       return  itemService.retrieveAllData();
    }

    @GetMapping("/all-data")
    public List<Item> dummyItemfromeRespository(){
        return itemService.retrieveAllData();

    }
}
