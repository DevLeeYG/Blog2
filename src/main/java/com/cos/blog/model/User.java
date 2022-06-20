package com.cos.blog.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity //db 테이블화
public class User {

    @Id// 프라이머리 키
    @GeneratedValue(strategy = GenerationType.IDENTITY)//프로젝트 연결된 db의 넘버링 전략으 따라간다.
    private int id;

    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false,length = 100) //널이 될수 없다.
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @ColumnDefault("user")
    private String role; //enum으로 도메인 설정을 할수 있다.

    @CreationTimestamp// 시간이 자동입력
    private Timestamp createDate;
}
