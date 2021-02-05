## HOW TO RUN
$ docker-compose up

gradlew bootRun

To create a mutation

````
mutation {
    writePost(post: {
        title: "title",
        description: "description",
        category: "category",
        author: {
            id: 10,
            name: "name"
        }
}) {
        id
    }
}
````

https://graphql.org/graphql-js/mutations-and-input-types/

##GraphQL course
https://www.howtographql.com/


### other links

https://www.baeldung.com/jpa-limit-query-results
https://stackoverflow.com/questions/30217552/spring-data-pageable-and-limit-offset

https://github.com/tcaselli/spring-data-graphql-jpa-demo
https://medium.com/@md.ali.azam/graphql-api-server-using-spring-boot-jpa-41ac1f6ad1c
https://habr.com/ru/post/513170/

https://www.apollographql.com/docs/react/data/queries/
https://www.apollographql.com/docs/react/

https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/
https://github.com/graphql-java-kickstart/graphql-spring-boot

https://www.baeldung.com/spring-graphql
