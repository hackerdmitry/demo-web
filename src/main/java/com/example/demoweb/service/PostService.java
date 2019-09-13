package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(
                new Post("Где мои деньги, Лебовски?", new Date()),
                new Post("ъуъ", new Date()),
                new Post("Выйди отсюда розбiйник", new Date())
        );
    }
}
