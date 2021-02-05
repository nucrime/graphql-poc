package com.graphql.poc.mapping;

import com.graphql.poc.dto.PostDto;
import com.graphql.poc.model.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    Post model(PostDto postDto);
    PostDto dto(Post post);
}
