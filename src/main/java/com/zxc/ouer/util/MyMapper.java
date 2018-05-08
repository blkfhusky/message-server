package com.zxc.ouer.util;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ganglun
 * @date 2018/5/8
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}