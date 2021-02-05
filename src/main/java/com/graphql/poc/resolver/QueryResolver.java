package com.graphql.poc.resolver;

import com.graphql.poc.dto.PostRecord;
import com.graphql.poc.service.PostService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
    private final PostService service;

    public List<PostRecord> recentPosts(final Integer size) {
        return service.recent(size);
    }
}
