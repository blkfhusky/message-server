package com.zxc.ouer.service;

import com.zxc.ouer.entity.Forbidden;

import java.util.List;

/**
 * @author ganglun
 * @date 2018/5/8
 */
public interface OuerForbiddenService {

    void init(String path);

    List<Forbidden> list();
}
