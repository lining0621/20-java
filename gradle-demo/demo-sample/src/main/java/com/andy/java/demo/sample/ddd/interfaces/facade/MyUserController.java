package com.andy.java.demo.sample.ddd.interfaces.facade;

import com.andy.java.demo.sample.ddd.application.service.IUserApplication;
import com.andy.java.demo.sample.ddd.infrastructure.common.Result;
import com.andy.java.demo.sample.ddd.interfaces.dto.UserFindDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author li-ning
 */
@Slf4j
@RestController
@RequestMapping("api/ddduser/")
@Api(tags = "用户管理", value = "用户管理")
public class MyUserController
{
    /**
     * @author lining
     * @date 2021-06-10
     *
     * @return 描述
     */
    @ApiOperation(value = "状态检查接口", notes = "没有说明")
    @RequestMapping(value = "status", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    @Deprecated
    @ApiOperation(value = "根据Id查询用户", notes = "没有说明")
    @RequestMapping(value = "queryUserById/{id}", method = RequestMethod.GET)
    public Result queryUserById(@PathVariable long id)
    {
        log.info("接口入参: {}", id);
        return new Result(HttpStatus.OK.value(), "", userApplication.findById(id));
    }
    @Deprecated
    @ApiOperation(value = "分页查询符合条件的用户", notes = "没有说明")
    @RequestMapping(value = "findUsersWithPage", method = RequestMethod.POST)
    public Result findUsersWithPage(@RequestBody UserFindDto userFind)
    {
        PageRequest page = PageRequest.of(userFind.getPageNum(),userFind.getPageSize(),UserFindDto.SortType,UserFindDto.SortColumn);
        return new Result(HttpStatus.OK.value(), "", userApplication.findUsersWithPage(page));
    }

    @Autowired
    @Getter @Setter
    private IUserApplication userApplication;
}
