package br.com.bjsl.searchapi.controller;

import br.com.bjsl.searchapi.dto.ItemSearchDTO;
import br.com.bjsl.searchapi.service.ItemSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/item-search")
@RequiredArgsConstructor
public class ItemSearchController {

    private final ItemSearchService itemSearchService;

    @PostMapping()
    public ResponseEntity<Void> saveSearchItem(@RequestBody ItemSearchDTO itemSearchDTO) {
        itemSearchService.save(itemSearchDTO);
        return ResponseEntity.ok().build();
    }
}

