package com.zxc.ouer.mapper;


import com.zxc.ouer.entity.Forbidden;
import com.zxc.ouer.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ganglun
 * @date 2018/5/8
 */
@Mapper
public interface OuerForbiddenMapper extends MyMapper<Forbidden> {

    int insertBatch(List<Forbidden> forbiddens);
}
