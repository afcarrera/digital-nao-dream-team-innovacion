package com.digitalnao.googlescholarapi.service.impl;

import com.digitalnao.googlescholarapi.dto.AuthorDTO;
import com.digitalnao.googlescholarapi.dto.SearchResultDTO;
import com.digitalnao.googlescholarapi.model.AuthorEntity;
import com.digitalnao.googlescholarapi.repository.IAuthorRepository;
import com.digitalnao.googlescholarapi.service.IGoogleScholarAuthorService;
import com.digitalnao.googlescholarapi.util.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.digitalnao.googlescholarapi.connector.IGoogleScholarAuthorConnector;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GoogleScholarAuthorService implements IGoogleScholarAuthorService {
    @Autowired
    IGoogleScholarAuthorConnector googleScholarAuthorsConnector;

    @Autowired
    private IAuthorRepository authorRepository;

    @Autowired
    private Mapping mapper;

    /**
     * @param params
     * @return SearchResult
     */
    @Override
    public SearchResultDTO findById(String[] params) {
        return this.googleScholarAuthorsConnector.findById(params);
    }

    /**
     * @param authorDTO
     * @return newAuthor
     */
    @Override
    public AuthorDTO create(AuthorDTO authorDTO) {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity = (AuthorEntity) mapper.convertToEntity(authorDTO, authorEntity);
        AuthorDTO newAuthorDTO = new AuthorDTO();
        newAuthorDTO = (AuthorDTO) mapper.convertToDto(
                this.authorRepository.save(authorEntity), newAuthorDTO);
        return newAuthorDTO;
    }
    /**
     * @param id
     * @return employeeById
     */
    @Override
    public AuthorDTO findAuthorById(String id) {
        AuthorEntity employeeById = findEmployeeByGoogleScholarId(id);
        if (employeeById == null){
            return null;
        }
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO = (AuthorDTO) mapper.convertToDto(
                employeeById, authorDTO);
        return authorDTO;
    }

    private AuthorEntity findEmployeeByGoogleScholarId(String googleScholarAuthorId){
        Optional<AuthorEntity> employeeOptional =
                Optional.ofNullable(this.authorRepository.findByGoogleScholarAuthorId(googleScholarAuthorId));
        AuthorEntity employeeById = employeeOptional.orElse(null);
        return employeeById;
    }
}
