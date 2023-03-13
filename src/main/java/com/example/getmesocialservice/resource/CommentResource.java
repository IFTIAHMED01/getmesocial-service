package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")

public class CommentResource {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comment")
    public Comment getComment(){
        return commentService.getComment();
    }

    @PostMapping("/comment")
    public Comment saveComment(@RequestBody @Valid Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/allComments")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/comment/{commentId}")
    public Comment getCommentById(@PathVariable("commentId") int commentId){
        return commentService.getCommentById(commentId);
    }

    @PutMapping("/comment/{commentId}")
    public Comment updateComment(@PathVariable("commentId") int commentId, @RequestBody Comment comment){
        return commentService.updateComment(commentId,comment);
    }

    @DeleteMapping("/comment")
    public Comment deleteComment(@RequestParam(name = "commentId") int commentId){
        return commentService.deleteComment(commentId);
    }

}
