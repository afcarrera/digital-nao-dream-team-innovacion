package com.digitalnao.googlescholarapi.service;

import com.digitalnao.googlescholarapi.dto.AuthorDTO;
import com.digitalnao.googlescholarapi.dto.SearchResultDTO;

public interface IGoogleScholarAuthorService {
    SearchResultDTO findById(String [] params);
    AuthorDTO create(AuthorDTO authorDTO);
    AuthorDTO findAuthorById(String googleScholarAuthorId);
}
