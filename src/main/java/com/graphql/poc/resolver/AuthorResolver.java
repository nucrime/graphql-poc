package com.graphql.poc.resolver;

import com.graphql.poc.model.Author;
import com.graphql.poc.repository.AuthorRepository;
import com.graphql.poc.service.AuthorService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
    private final AuthorService service;


}
