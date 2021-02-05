package com.graphql.poc.dto;

public record PostDto(Long id,
                      String title,
                      String description,
                      String category,
                      String authorId) {}
