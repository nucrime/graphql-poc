package com.graphql.poc.mapping;

import com.graphql.poc.dto.AuthorDto;
import com.graphql.poc.model.Author;
import org.mapstruct.Mapper;

@Mapper
public interface AuthorMapper {
    Author model(AuthorDto authorDto);
    AuthorDto dto(Author author);
}
