package com.graphql.poc.mapping;

import com.graphql.poc.dto.AuthorRecord;
import com.graphql.poc.model.Author;
import org.mapstruct.Mapper;

@Mapper
public interface AuthorMapper {
    Author model(AuthorRecord authorRecord);
    AuthorRecord record(Author author);
}
