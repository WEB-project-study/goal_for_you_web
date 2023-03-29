package com.example.GoalForYou.dto;

import com.example.GoalForYou.domain.File;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileDto {
    private Long fileId;
    private String origFilename;
    private String filename;
    private String filePath;

    public File toEntity() {
        File build = File.builder()
                .id(fileId)
                .origFilename(origFilename)
                .filename(filename)
                .filePath(filePath)
                .build();
        return build;
    }

    @Builder
    public FileDto(Long id, String origFilename, String filename, String filePath) {
        this.fileId = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}