package com.andy.java.demo.sample.ddd.infrastructure.po;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author li-ning
 */
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseEntity implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", columnDefinition = "bigint(15) comment '主键' ")
    Long id;

    @Column(name= "status", columnDefinition = "int(2) default 0 comment '状态:0-有效，1-无效'")
    private int status;

    @Column(name= "operator", columnDefinition = "varchar(10) default '' comment '操作人'")
    private String operator;

    @Column(name= "create_date", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '最后修改时间' ")
    LocalDateTime createDate;

    @Column(name= "update_date", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '最后修改时间' ")
    LocalDateTime updateDate;

    @Column(name= "description", columnDefinition = "varchar(50) default '' comment '说明'")
    private String description;
}
