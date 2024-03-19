package com.example.demo.testwithsowmiya.Repository;

import com.example.demo.testwithsowmiya.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepsoitory extends JpaRepository<Item,Integer> {
}
