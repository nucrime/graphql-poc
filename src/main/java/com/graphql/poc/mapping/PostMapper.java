package com.graphql.poc.mapping;

import com.graphql.poc.dto.PostRecord;
import com.graphql.poc.model.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    Post model(PostRecord postRecord);
    PostRecord record(Post post);
}
