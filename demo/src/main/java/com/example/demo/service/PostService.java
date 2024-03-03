package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Убийца плачет", 200));
        posts.add(new Post("Но он не смог", 404));
        posts.add(new Post("Поступить иначе", 503));
        return posts;
    }
}