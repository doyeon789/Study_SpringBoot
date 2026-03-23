package com.bello.banana.Service;

import com.bello.banana.domain.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private Map<Long, Item> store = new HashMap<>();
    private  Long ID = 0L;

    public List<Item> findAll(){
        return new ArrayList<>(store.values());
    }

    public Item save(Item item){
        item.setId(++ID);
        store.put(item.getId(), item);
        return item;
    }

    public void update(Long id, Item item) {
        Item find_item = store.get(id);
        find_item.setTitle(item.getTitle());
        find_item.setContent(item.getContent());
    }

    public void delete(Long id) {
        store.remove(id);
    }
}
