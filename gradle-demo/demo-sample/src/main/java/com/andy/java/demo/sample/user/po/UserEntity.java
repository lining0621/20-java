package com.andy.java.demo.sample.user.po;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author ccb
 */
@Data
@Entity
@ToString
@EqualsAndHashCode
@Table(name = "t_user")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", columnDefinition = "bigint(10) not null auto_increment comment '主键-用户ID' ")
    private Long userId;

    @Column(name = "passwd", columnDefinition = "varchar(32) comment '登录密码'")
    private String passwd;

    @Column(name = "state", columnDefinition = "int(1) default 1 comment '状态:0-注册，1-正常, 2-锁定, 3-关闭'")
    private UserState state;

    @Column(name = "operator", columnDefinition = "varchar(10) default '' comment '操作人'")
    private String operator;

    @Column(name = "create_date", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '最后修改时间' ")
    LocalDateTime createDate;

    @Column(name = "update_date", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '最后修改时间' ")
    LocalDateTime updateDate;

    @Column(name = "description", columnDefinition = "varchar(50) default '' comment '说明'")
    private String description;

    /**
     * 锁定用户
     */
    public void clock()
    {
        this.setState(UserState.CLOCK);
        this.setUpdateDate(LocalDateTimeUtil.now());
    }

    /**
     * 禁用用户
     */
    public void close()
    {
        this.setState(UserState.CLOSE);
        this.setUpdateDate(LocalDateTimeUtil.now());
    }
}