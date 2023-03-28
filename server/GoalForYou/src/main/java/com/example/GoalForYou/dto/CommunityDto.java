package com.example.GoalForYou.dto;

//import com.example.GoalForYou.community.domain.Community;
import com.example.GoalForYou.domain.Community;
import lombok.Builder;

import java.time.LocalDateTime;

public class CommunityDto {
    private Long communityId;

    private String title;
    private String content;
    private Long fileId;
//    private String image;
    private String writer;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
//    private List<Tag> tags;


    public Community toEntity(){
        Community community = Community.builder()
                .id(communityId)
                .title(title)
                .content(content)
                .fileId(fileId)
//                .image(image)
                .writer(writer)
//                .tags(tags)
                .build();

        return community;
    }

    @Builder
    //List<Tag> tags 나중에 추가
    public CommunityDto(Long id, String title, String content, Long fileId, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.communityId = id;
        this.title = title;
        this.content = content;
        this.fileId = fileId;
//        this.image = image;
        this.writer = writer;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
//        this.tags = tags;
    }
}


