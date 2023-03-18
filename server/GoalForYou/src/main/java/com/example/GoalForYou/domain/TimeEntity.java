package com.example.GoalForYou.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass  /**테이블로 매핑하지 않고, CommunityEntity에게 매핑정보를 상속하기 위한 어노테이션**/
@EntityListeners(AuditingEntityListener.class) /** JPA에게 해당 Entity는 Auditing 기능을 사용한다는 **/

/** 데이터 조작 시 자동으로 날짜 수정 */

public abstract class TimeEntity {

    /** 생성일 주입 **/
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    /** 수정일자 주입 */
    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
