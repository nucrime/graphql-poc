package com.graphql.poc.resolver;

import com.graphql.poc.model.Post;
import com.graphql.poc.service.PostService;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
    private final PostService service;
}
