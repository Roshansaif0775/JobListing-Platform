package com.telusko.joblisting;

import com.telusko.joblisting.Repository.PostRepository;
import com.telusko.joblisting.Repository.SearchRepository;
import com.telusko.joblisting.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController

public class PostController {
    @Autowired
    PostRepository repo ;
    @Autowired
    SearchRepository srepo ;
    @ApiIgnore

    @RequestMapping(value = "/")
   public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
   }

   @PostMapping(value = "/post")
   public Post addPost(@RequestBody Post post){
        return repo.save(post);
   }
   @GetMapping(value="/posts")
   public List<Post> getAllPosts(){
        return repo.findAll();
   }
   @GetMapping(value = "/post/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findbytext(text);
   }
}
