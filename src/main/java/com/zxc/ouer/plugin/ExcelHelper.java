package com.zxc.ouer.plugin;

import com.zxc.ouer.entity.OuerForbidden;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ganglun
 * @date 2018/5/8
 */
@Component
public class ExcelHelper {

    public List<OuerForbidden> read(File file) {
        LinkedList<OuerForbidden> ouerForbiddens = new LinkedList<>();
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Sheet sheet = workbook.getSheetAt(0);
        int firstRowNum = sheet.getFirstRowNum();
        int lastRowNum = sheet.getLastRowNum();
        for (int i = firstRowNum + 1; i < lastRowNum; i++) {
            Row row = sheet.getRow(i);
            ouerForbiddens.add(new OuerForbidden(
                    row.getCell(0).toString(),
                    row.getCell(1).toString(),
                    row.getCell(2).toString(),
                    row.getCell(3).toString()));

        }
        return ouerForbiddens;
    }

}
