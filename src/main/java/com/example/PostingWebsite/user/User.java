package com.example.PostingWebsite.user;

import com.example.PostingWebsite.post.Posts;
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
@Table(name="User_Details")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="user_id")
    private long user_id;
    @Column(unique = true, nullable = false)

    private String firstName;
    private String secondName;
    private String email;
    @Column(unique = true, nullable = false)

    private Date birthDay;
    private Time Timestamp;
    //posts/reactions/comments
    @OneToMany (cascade = CascadeType.ALL)
    private Posts posts;





    public long getUser_id() {return user_id;}
    public String getFirstName() {return firstName;}
    public String getSecondName() {return secondName;}
    public String getEmail() {return email;}
    public Date getBirthDay() {return birthDay;}
    public Time getTimestamp() {return Timestamp;}

}
