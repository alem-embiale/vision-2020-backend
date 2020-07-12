package com.alem.vision2020.repository;

import com.alem.vision2020.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
