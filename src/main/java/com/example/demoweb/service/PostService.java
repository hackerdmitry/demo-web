package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private ArrayList<Post> posts;

    public PostService() {
        posts = new ArrayList<>(Arrays.asList(
                new Post(0L, "Где мои деньги, Лебовски?", new Date()),
                new Post(1L, "ъуъ", new Date()),
                new Post(2L, "Выйди отсюда розбiйник", new Date())));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date()));
    }
}
