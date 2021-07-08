package com.andy.java.demo.sample.ddd.interfaces.dto;

import lombok.Data;
import org.springframework.data.domain.Sort;

/**
 * @author li-ning
 */
@Data
public class UserFindDto
{
    public final static String[]       SortColumn = new String[]{"cnName","id"};
    public final static Sort.Direction SortType   = Sort.Direction.DESC;
    private Long        id;
    private int pageSize = 10;
    private int pageNum = 0;
}
