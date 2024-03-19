package com.example.demo.testwithsowmiya.Service;

import com.example.demo.testwithsowmiya.Repository.ItemRepsoitory;
import com.example.demo.testwithsowmiya.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Parser;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepsoitory itemRepsoitory;

    public Item retrieveHardCodeData() {
        return new Item(1, "ball", 10, 2);
    }

    public List <Item> retrieveAllData() {
        List<Item> items = itemRepsoitory.findAll();
        items.add(new Item(1, "abc", 100, 10));
        items.add(new Item(2, "abc", 100, 10));
        items.add(new Item(3, "abc", 100, 10));
        System.out.println("items"+ items);

        for(Item value:items){
            value.setValue(value.getPrice()*value.getQuantity());
        }
        return items;
    }


}
