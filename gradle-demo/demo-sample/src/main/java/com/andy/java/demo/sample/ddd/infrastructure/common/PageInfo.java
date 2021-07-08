package com.andy.java.demo.sample.ddd.infrastructure.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ccb
 */
@AllArgsConstructor
@Data
public class PageInfo<T> implements Serializable
{
    private int pageNum;
    private int pageSize;
    private T condition;
}
