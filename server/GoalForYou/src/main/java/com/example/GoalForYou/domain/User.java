package com.example.GoalForYou.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

@Entity
@Table(name = "user")
public class User {

    /** Primary **/
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UID") @NotNull
    private long uid;

    @Column(name = "user_email") @NotNull
    private String email;

    @Column(name = "user_name") @NotNull
    private String name;

    /** 가입일 **/
    @Column(name = "user_reg_date") @NotNull
    @Temporal(TemporalType.DATE)
    private Date regDate;

    /** EntityManager의 Persist 호출 전 이용자의 regDate를 금일로 설정 **/
    @PrePersist
    public void prePersist() {
        this.regDate = Timestamp.valueOf(LocalDateTime.now());
    }

    @Column(name = "user_exp_date")
    @Temporal(TemporalType.DATE)
    private Date expDate;

    public long getUid() {
        return uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

}