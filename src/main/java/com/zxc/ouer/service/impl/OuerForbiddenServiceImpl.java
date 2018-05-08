package com.zxc.ouer.service.impl;

import com.zxc.ouer.entity.OuerForbidden;
import com.zxc.ouer.mapper.OuerForbiddenMapper;
import com.zxc.ouer.plugin.ExcelHelper;
import com.zxc.ouer.service.OuerForbiddenService;
import com.zxc.ouer.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ganglun
 * @date 2018/5/8
 */
@Service("forbiddenService")
public class OuerForbiddenServiceImpl implements OuerForbiddenService {

    @Autowired
    private OuerForbiddenMapper ouerForbiddenMapper;

    @Autowired
    private ExcelHelper excelHelper;

    @Override
    public void init(String path) {
        try {
            List<OuerForbidden> ouerForbiddens = excelHelper.read(
                    FileUtil.readFile(path));
            ouerForbiddenMapper.insertBatch(ouerForbiddens);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<OuerForbidden> list() {
        return ouerForbiddenMapper.selectAll();
    }
}
