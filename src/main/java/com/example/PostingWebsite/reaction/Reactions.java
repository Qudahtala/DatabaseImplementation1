package com.example.PostingWebsite.reaction;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="Reactions_Details")
public class Reactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="reaction_id")
    private long reaction_id;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private long user_id;
    private long post_id;
    private long comment_id;

}
