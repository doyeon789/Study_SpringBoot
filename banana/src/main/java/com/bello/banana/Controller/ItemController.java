package com.bello.banana.Controller;

import com.bello.banana.Service.ItemService;
import com.bello.banana.domain.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    // 전체 조회
    @GetMapping
    public List<Item> findAll(){
        return itemService.findAll();
    }

    // 생성
    @PostMapping
    public Item create(@RequestBody Item item) {
        return itemService.save(item);
    }

    // 수정
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Item item) {
        itemService.update(id, item);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        itemService.delete(id);
    }
}
