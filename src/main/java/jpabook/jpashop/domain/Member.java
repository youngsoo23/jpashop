package jpabook.jpashop.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long Id;

    private String name;

    private String city;

    private String street;

    private String zipcode;

    //양방향 예제
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
