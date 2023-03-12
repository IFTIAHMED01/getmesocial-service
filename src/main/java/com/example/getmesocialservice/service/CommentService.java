package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment getComment(){
        return commentRepository.getComment();
    }

    public Comment saveComment(Comment comment){
        return commentRepository.saveComment(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.getAllComments();
    }

    public Comment getCommentById(int commentId) {
        return commentRepository.getCommentById(commentId);
    }

    public Comment updateComment(int commentId, Comment comment) {
        return commentRepository.updateComment(commentId,comment);
    }

    public Comment deleteComment(int commentId) {
        return commentRepository.deleteComment(commentId);
    }

}
