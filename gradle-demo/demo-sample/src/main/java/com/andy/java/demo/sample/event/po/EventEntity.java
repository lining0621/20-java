package com.andy.java.demo.sample.event.po;

import com.andy.java.demo.sample.ddd.infrastructure.po.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author li-ning
 */
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_event")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventEntity extends BaseEntity implements Serializable
{
    @Column(name="name", length = 20)
    private String name;

    @Column(name="args")
    private String args;

    public void save()
    {

    }
}
