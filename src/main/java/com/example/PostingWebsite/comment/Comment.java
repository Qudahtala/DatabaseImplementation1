package com.example.PostingWebsite.comment;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="Comment_Details")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="commenter_id")
    private long comment_id;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Long user_id;
    private Long post_id;
    private String commentContent;
    private Time Timestamp;



}
