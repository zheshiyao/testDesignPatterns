package com.factoryMath;

/**
 * Created by xuesj on 2018/2/23.
 */
public class ExportStandardHtmlFile implements ExportFile{
    @Override
    public void export(String data) {
        System.out.println("导出标准html版文件");
    }
}
