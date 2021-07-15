package com.andy.java.demo.sample.ddd.infrastructure.po;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ccb
 */
@Data
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_user2")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntityOld extends BaseEntity
{
    @Column(name="cn_name", length = 20)
    private String cnName;

    @Column(name="user_id", length = 10)
    private int userId;

    @Column(name="en_args", length = 20)
    private String enName;

    @Column(name="gender", length = 1)
    private int gender;

    @Column(name="age", length = 3)
    private int age;
}
