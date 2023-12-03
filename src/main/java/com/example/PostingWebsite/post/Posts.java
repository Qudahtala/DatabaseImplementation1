package com.example.PostingWebsite.post;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table (name="post_Details")
public class Posts {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name ="Post_id")
    private long post_id;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    //fk
    private Long user_id;
    private Time Timestamp;
    boolean validation_status=true;

}
