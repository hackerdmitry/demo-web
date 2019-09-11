package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(
                new Post("Где мои деньги, Лебовски?", 6472),
                new Post("ъуъ", 2618),
                new Post("Выйди отсюда розбiйник", 4963)
        );
    }
}
