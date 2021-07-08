package com.andy.demo.commons.base.api.dto;

import java.io.Serializable;

/**
 * @author ccb
 */
public class PageInfo<T> implements Serializable
{
    private int pageNum;
    private int pageSize;
    private T condition;
}
