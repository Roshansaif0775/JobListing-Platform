package com.telusko.joblisting.Repository;

import com.telusko.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {
     List<Post> findbytext (String text) ;
}
