package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {
    List<Comment> commentList = new ArrayList();

    public Comment getComment(){
        Comment comment = new Comment(1234, 567, "artistic", "IFTI","2022/12/07");
        return comment;
    }

    public Comment saveComment(Comment comment) {
        comment.setId(commentList.size() + 1);
        commentList.add(comment);
        return comment;
    }

    public List<Comment> getAllComments() {
        return commentList;
    }

    public Comment getCommentById(int commentId) {
        for(Comment comment:commentList){
            if(comment.getId() == commentId){
                return comment;
            }
        }
        return null;
    }

    public Comment updateComment(int commentId, Comment comment) {
        for(Comment c:commentList){
            if(c.getId() == commentId){
                c.setMessage(comment.getMessage());
                c.setCreatedBy(comment.getCreatedBy());
                c.setDataCreated(comment.getDataCreated());
                return c;
            }
        }
        return null;
    }

    public Comment deleteComment(int commentId) {
        Comment deletedComment = null;
        for(Comment c:commentList){
            if(c.getId() == commentId){
                deletedComment = c;
                commentList.remove(c);
            }
        }
        return deletedComment;
    }
}
