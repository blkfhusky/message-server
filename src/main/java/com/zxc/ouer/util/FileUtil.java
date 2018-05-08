package com.zxc.ouer.util;

import java.io.File;

/**
 * @author ganglun
 * @date 2018/5/8
 */
public class FileUtil {

    public static File readFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new RuntimeException("file not found");
        }
        return file;
    }


}
