package com.example.GoalForYou.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File {

    @Id
    @GeneratedValue
    private Long fileId;

    /**원래 파일명**/
    @Column(nullable = false)
    private String origFilename;

    /** 저장 파일명 */
    @Column(nullable = false)
    private String filename;

    /** 파일 경로 **/
    @Column(nullable = false)
    private String filePath;

    @Builder
    public File(Long id, String origFilename, String filename, String filePath) {
        this.fileId = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }

    @Builder
    public File(String filePath) {

        this.filePath = filePath;
    }



    public void mkdir() {
    }

    public boolean exists() {
        File file = new File(filePath);
        return file.exists();
    }
}