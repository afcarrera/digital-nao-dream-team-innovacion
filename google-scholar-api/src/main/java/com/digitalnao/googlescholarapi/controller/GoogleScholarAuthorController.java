package com.digitalnao.googlescholarapi.controller;

import com.digitalnao.googlescholarapi.dto.AuthorDTO;
import com.digitalnao.googlescholarapi.dto.SearchResultDTO;
import com.digitalnao.googlescholarapi.service.IGoogleScholarAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/v1/authors")
public class GoogleScholarAuthorController {

    @Autowired
    private IGoogleScholarAuthorService googleScholarAuthorService;

    @GetMapping
    public SearchResultDTO findById(@RequestParam("api_key") String apiKey,
                                   @RequestParam("author_id") String authorId,
                                   @RequestParam("engine") String engine){
        String [] params = {apiKey, authorId, engine};
        SearchResultDTO searchResultDTO = this.googleScholarAuthorService.findById(params);
        AuthorDTO authorDTO = this.googleScholarAuthorService.findAuthorById(authorId);
        if (Objects.isNull(authorDTO) && Objects.nonNull(searchResultDTO.getAuthor())){
            searchResultDTO.getAuthor().setGoogleScholarAuthorId(authorId);
            this.googleScholarAuthorService.create(searchResultDTO.getAuthor());
        }
        return searchResultDTO;
    }
}
