package com.example.GoalForYou.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "community")
@EntityListeners(AuditingEntityListener.class)

public class Community extends TimeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long communityId;
    @Column
    private Long fileId;
    @Column(length = 10, nullable = false)
    private String writer;

//    @Column(length = 10, nullable = false)
//    private User user;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "posts", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @OrderBy("id asc") // 댓글 정렬
    private List<Comment> comments;

//    @Builder
//    public Photo(String origFileName, String filePath, Long fileSize){
//        this.origFileName = origFileName;
//        this.filePath = filePath;
//        this.fileSize = fileSize;
//    }

    @Builder
    public Community(Long id, String title, String content, String writer, Long fileId) {
        this.communityId = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.fileId = fileId;
    }

//    @Builder
//    public Photo(String origFileName, String filePath, Long fileSize){
//        this.origFileName = origFileName;
//        this.filePath = filePath;
//        this.fileSize = fileSize;
//    }
//
//    // Community 정보 저장
//    public void setBoard(Community board){
//        this.community = board;
//
//        // 게시글에 현재 파일이 존재하지 않는다면
//        if(!board.getPhoto().contains(this))
//            // 파일 추가
//            board.getPhoto().add(this);
//    }
}


