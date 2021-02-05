package com.graphql.poc.dto;

import java.util.List;

public record AuthorRecord(Long id,
                           String name,
                           List<PostRecord> posts) {}
