package com.graphql.poc.resolver;

import com.graphql.poc.dto.AuthorRecord;
import com.graphql.poc.mapping.AuthorMapper;
import com.graphql.poc.model.Author;
import com.graphql.poc.model.Post;
import com.graphql.poc.service.AuthorService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {

    private final AuthorService service;
    private final AuthorMapper mapper;

    public AuthorRecord authorByPost(final Post post) {
        Author author = service.author(post.getAuthor().getId()).orElseThrow();
        return mapper.record(author);
    }
}
