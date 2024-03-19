package com.example.demo.testwithsowmiya;

import com.example.demo.testwithsowmiya.Repository.ItemRepsoitory;
import com.example.demo.testwithsowmiya.model.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {
    @Autowired
    private ItemRepsoitory itemRepsoitory;

    @Test
    public void retreieveItemSize(){
       List<Item> items= itemRepsoitory.findAll();
       assertEquals(3,items.size());

    }
}
