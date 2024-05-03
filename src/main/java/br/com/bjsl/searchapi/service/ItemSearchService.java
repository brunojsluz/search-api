package br.com.bjsl.searchapi.service;

import br.com.bjsl.searchapi.dto.ItemSearchDTO;
import br.com.bjsl.searchapi.entity.ItemSearch;
import br.com.bjsl.searchapi.repository.ItemSearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemSearchService {

    private final ItemSearchRepository itemSearchRepository;

    public void save(ItemSearchDTO itemSearchDTO) {
        var itemSearch = ItemSearch.builder()
                .category(itemSearchDTO.getCategory())
                .description(itemSearchDTO.getDescription())
                .name(itemSearchDTO.getName())
                .build();
        itemSearchRepository.save(itemSearch);
    }
}
