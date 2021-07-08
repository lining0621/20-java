package com.andy.java.demo.sample.ddd.domain.model.aggregates;

import com.andy.java.demo.sample.ddd.domain.model.vo.UserInfo;
import com.andy.java.demo.sample.ddd.domain.model.vo.UserSchool;
import lombok.Data;

import java.util.List;

/**
 * @author ccb
 */
@Data
public class UserRichInfo
{
    private UserInfo         userInfo;
    private List<UserSchool> userSchoolList;
}
