package com.telusko.joblisting.Repository;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.telusko.joblisting.models.Post;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class searchrepimp implements SearchRepository{
    @Autowired
    MongoClient client ;
    @Autowired
    MongoConverter converter ;
    @Override
    public List<Post> findbytext(String text) {
        final List<Post> posts =  new ArrayList<>();

        MongoDatabase database = client.getDatabase("telusko");
        MongoCollection<Document> collection = database.getCollection("JobPost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", "skills"))),
                new Document("$sort",
                        new Document("salary", -1L)),
                new Document("$limit", 5L)));

        result.forEach(doc -> posts.add(converter.read(Post.class,doc)));
        return posts;
    }
}
