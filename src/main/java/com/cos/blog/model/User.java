package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor//파라미터가 없는 기본생성자를 생성
@AllArgsConstructor //모든 필드값을 파라미터로 받는 생성자를 만들어줌
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 20)
    private String username;


    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false)
    private String email;


    @CreationTimestamp
    private Timestamp createDate;

    // Enum 으로 변경 예정
    @ColumnDefault("'user'")
    private String role;
}