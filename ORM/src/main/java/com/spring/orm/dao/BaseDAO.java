package com.spring.orm.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 94921 on 2019/3/11.
 */
public interface BaseDAO<T> extends Mapper<T>,MySqlMapper<T>{
}
