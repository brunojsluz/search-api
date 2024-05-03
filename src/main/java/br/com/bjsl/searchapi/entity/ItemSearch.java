package br.com.bjsl.searchapi.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@Document(indexName = "search-item")
public class ItemSearch {

    @Id
    private String id;
    private String name;
    private String description;
    private String category;
}
