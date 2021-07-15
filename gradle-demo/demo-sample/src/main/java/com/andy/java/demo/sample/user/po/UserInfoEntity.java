package com.andy.java.demo.sample.user.po;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ccb
 */
@Data
@Entity
@ToString
@EqualsAndHashCode
@Table(name = "t_user_info")
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoEntity implements Serializable
{
    @Id
    @Column(name = "user_id", columnDefinition = "bigint(10) not null default 10000 comment '主键-用户ID' ")
    private Long userId;

    @Column(name="cn_name", length = 20)
    private String cnName;

    @Column(name="en_args", length = 20)
    private String enName;

    @Column(name="gender", length = 1)
    private int gender;

    @Column(name="age", length = 3)
    private int age;

    @Column(name="tel", length = 11)
    private int tel;
}
