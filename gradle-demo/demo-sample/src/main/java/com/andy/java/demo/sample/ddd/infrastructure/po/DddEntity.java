package com.andy.java.demo.sample.ddd.infrastructure.po;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ccb
 */
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_ddd")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DddEntity extends BaseEntity
{
    @Column(name="name", length = 20)
    private String name;

    @Column(name="args")
    private String args;
}
