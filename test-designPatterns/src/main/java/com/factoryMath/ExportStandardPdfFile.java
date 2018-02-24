package com.factoryMath;

/**
 * Created by xuesj on 2018/2/23.
 */
public class ExportStandardPdfFile implements ExportFile{
    @Override
    public void export(String data) {
        System.out.println("导出标准pdf版文件");
    }
}
