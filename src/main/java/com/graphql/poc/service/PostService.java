package com.graphql.poc.service;

import com.graphql.poc.model.Post;
import com.graphql.poc.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;

    public List<Post> byAuthor(final Long author) {
        return repository.findByAuthorId(author);
    }

    public List<Post> recent(final Integer size) {
        return repository
                .findAll(PageRequest.of(0, size, Sort.by(Sort.Direction.DESC, "created")))
                .getContent();
    }
}
