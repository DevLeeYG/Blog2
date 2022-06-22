package com.cos.blog.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reply {

    @Id//primary
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne//여러개의 rply 는 하나의 게시물에 달릴수 있다.
    @JoinColumn(name="boardId") // 포린키가 필요한이유는 게시물이 답글들을 달고 있어야되기떄문 답글아이디에 게시물아이디가 묶여야된다
    private Board board;

    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    @CreationTimestamp
    private LocalDate createDate;
}
