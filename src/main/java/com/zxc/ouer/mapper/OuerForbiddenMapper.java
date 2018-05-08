package com.zxc.ouer.mapper;


import com.zxc.ouer.entity.OuerForbidden;
import com.zxc.ouer.util.MyMapper;

import java.util.List;

/**
 * @author ganglun
 * @date 2018/5/8
 */
public interface OuerForbiddenMapper extends MyMapper<OuerForbidden> {

    int insertBatch(List<OuerForbidden> ouerForbiddens);
}
