package com.zxc.ouer.controller;

import com.zxc.ouer.entity.OuerForbidden;
import com.zxc.ouer.service.OuerForbiddenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ganglun
 * @date 2018/5/8
 */
@RestController
@RequestMapping("/forbidden")
public class ForbiddenController {

    @Autowired
    private OuerForbiddenService ouerForbiddenService;

    @RequestMapping(value = "/init")
    public String init(@RequestParam(name = "path", required = false)String path) {
        ouerForbiddenService.init(path);
        return "success";
    }

    @RequestMapping("/list")
    public List<OuerForbidden> list() {
        return ouerForbiddenService.list();
    }
}
