package com.graphql.poc.resolver;

import com.graphql.poc.dto.AuthorRecord;
import com.graphql.poc.dto.PostRecord;
import com.graphql.poc.model.Author;
import com.graphql.poc.model.Post;
import com.graphql.poc.service.AuthorService;
import com.graphql.poc.service.PostService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MutationResolver implements GraphQLMutationResolver {
    private final PostService postService;
    private final AuthorService authorService;

    public PostRecord writePost(final Post post) {
        return postService.save(post);
    }

    public AuthorRecord createAuthor(final Author author) {
        return authorService.save(author);
    }
}
