package com.graphql.poc.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
@Data
public class Post {
    @Id
    private Long id;
    private String title;
    private String description;
    private String category;
    private Long authorId;
    @CreationTimestamp
    private ZonedDateTime created;
}
