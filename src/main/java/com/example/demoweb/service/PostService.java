package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public PostService() {
//        posts = new ArrayList<>(Arrays.asList(
//                new Post(0L, "Где мои деньги, Лебовски?", new Date()),
//                new Post(1L, "ъуъ", new Date()),
//                new Post(2L, "Выйди отсюда розбiйник", new Date())));
    }

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
