package com.andy.demo.commons.base.api;

import com.andy.demo.commons.base.api.dto.BaseDTO;
import com.andy.demo.commons.base.api.dto.BaseVO;
import com.andy.demo.commons.base.api.dto.Result;

public class BaseController<T extends BaseDTO, VO extends BaseVO>
{
    public Result<T> resultFormat(T data)
    {
        return new Result<T>(data);
    }
}
