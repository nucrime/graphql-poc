package com.graphql.poc.service;

import com.graphql.poc.dto.AuthorRecord;
import com.graphql.poc.mapping.AuthorMapper;
import com.graphql.poc.model.Author;
import com.graphql.poc.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository repository;
    private final AuthorMapper mapper;

    public Optional<Author> author(final Long author) {
        return repository.findById(author);
    }

    public AuthorRecord save(final Author author) {
        Author saved = repository.save(author);
        return mapper.record(saved);
    }
}
