package kr.ac.ks.app.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int quota;
    private int regCnt; // 카운트용 변수 생성

    @OneToMany
    private List<Course> courses = new ArrayList<>();

    public Lesson() {
    }

    @Builder
    public Lesson(String name, int quota) {
        this.name = name;
        this.quota = quota; // 총 수강 가능한 인원
        this.regCnt = regCnt; // 수강 신청한 인원
    }
}
