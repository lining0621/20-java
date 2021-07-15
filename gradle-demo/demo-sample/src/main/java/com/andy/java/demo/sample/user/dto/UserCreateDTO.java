package com.andy.java.demo.sample.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * @author li-ning
 */
@Data
@NoArgsConstructor
public class UserCreateDTO implements Serializable
{
    private String  passwd;
    private String  operator;
    private String  description;
    private String  cnName;
    private String  enName;
    private Integer gender;
    private Integer age;
    private Integer tel;
}
