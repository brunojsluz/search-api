package br.com.bjsl.searchapi.repository;

import br.com.bjsl.searchapi.entity.ItemSearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ItemSearchRepository extends ElasticsearchRepository<ItemSearch, String>{
}
