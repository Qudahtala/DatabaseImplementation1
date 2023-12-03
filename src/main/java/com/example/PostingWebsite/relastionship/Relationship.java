package com.example.PostingWebsite.relastionship;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="relationship_Details")
public class Relationship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="relationship_id")
    private Long relationshipId;
    @ManyToOne
    @JoinColumn(name = "user1Id", nullable = false)
    private Long Sender_user_id;
    @JoinColumn(name = "user2Id", nullable = false)
    private Long Reciever_user_id;
    private String RelationshipStatus;
    @Column(nullable = false)
    private Time Timestamp;
}
