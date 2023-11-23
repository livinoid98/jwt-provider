package com.livinoid.jwtTutorial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "myuser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;

    @Column(name="username", length=50, unique=true)
    private String username;

    @JsonIgnore
    @Column(name="password", length=100)
    private String password;

    @Column(name="nickname", length=50)
    private String nickname;

    @JsonIgnore
    @Column(name="activated")
    private boolean activated;

}
