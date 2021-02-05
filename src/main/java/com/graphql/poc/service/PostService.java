package com.graphql.poc.service;

import com.graphql.poc.dto.PostRecord;
import com.graphql.poc.mapping.PostMapper;
import com.graphql.poc.model.Post;
import com.graphql.poc.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;
    private final PostMapper mapper;

    public List<PostRecord> byAuthor(final Long author) {
        List<Post> posts = repository.findByAuthorId(author);
        return posts
                .stream()
                .map(mapper::record)
                .collect(Collectors.toList());
    }

    public List<PostRecord> recent(final Integer size) {
        return repository
                .findAll(PageRequest.of(0, size, Sort.by(Sort.Direction.DESC, "created")))
                .getContent()
                .stream().map(mapper::record)
                .collect(Collectors.toList());
    }

    public PostRecord save(final Post post) {
        Post saved = repository.save(post);
        return mapper.record(saved);
    }
}
