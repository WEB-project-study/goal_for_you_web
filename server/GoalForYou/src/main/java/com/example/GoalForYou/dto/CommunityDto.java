package com.example.GoalForYou.dto;

//import com.example.GoalForYou.community.domain.Community;
import com.example.GoalForYou.domain.Community;
import lombok.Builder;

import java.time.LocalDateTime;

public class CommunityDto {
    private Long communityId;

<<<<<<< Updated upstream
    private String title;
    private String content;
    private Long fileId;

//    private String image;
    private String writer;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
=======
//    private String title;
    private String communityContent;
    private Long fileId;

//    private String image;
//    private String writer;
    private LocalDateTime communityWriteDate;
    private LocalDateTime communityEditDate;
>>>>>>> Stashed changes
//    private List<Tag> tags;


    public Community toEntity(){
        Community community = Community.builder()
                .id(communityId)
<<<<<<< Updated upstream
                .title(title)
                .content(content)
                .fileId(fileId)
                .writer(writer)
=======
//                .title(title)
                .content(communityContent)
                .fileId(fileId)
//                .writer(writer)
>>>>>>> Stashed changes
//                .tags(tags)
                .build();

        return community;
    }

    @Builder
    //List<Tag> tags 나중에 추가
<<<<<<< Updated upstream
    public CommunityDto(Long id, String title, String content, Long fileId, String writer, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.communityId = id;
        this.title = title;
        this.content = content;
        this.fileId = fileId;
        this.writer = writer;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
=======
    public CommunityDto(Long id, String content, Long fileId, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.communityId = id;
//        this.title = title;
        this.communityContent = content;
        this.fileId = fileId;
//        this.writer = writer;
        this.communityWriteDate = createdDate;
        this.communityEditDate = modifiedDate;
>>>>>>> Stashed changes
//        this.tags = tags;
    }


}


