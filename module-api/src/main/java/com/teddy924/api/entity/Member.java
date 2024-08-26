package com.teddy924.api.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @Entity: JPA가 엔티티로 인식하여 테이블과 연결될 클래스를 나타냄.
@Entity
// @Table: 기본적으로 생성해주는 테이블 이름을 직접 지정.
@Table(name= "member")
// getter 메서드를 자동 생성.
@Getter
// toString 메서드를 자동생성.
// exclude를 사용하여 toString에서 제외할 수 있다.
@ToString(exclude = "password")
// PK클래스를 따로 생성한 후 참조.
@IdClass(MemberPK.class)
@NoArgsConstructor
@EnableJpaAuditing
public class Member {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(name = "name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Id
    @Column(name = "email")
    private String userEmail;

    @Column(name = "phone")
    private String userPhone;

}
