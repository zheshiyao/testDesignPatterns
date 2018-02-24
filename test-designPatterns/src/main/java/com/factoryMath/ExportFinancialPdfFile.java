package com.factoryMath;

/**
 * Created by xuesj on 2018/2/23.
 */
public class ExportFinancialPdfFile implements ExportFile{
    @Override
    public void export(String data) {
        System.out.println("导出财务pdf版文件");
    }
}
