package com.factoryMath;

/**
 * Created by xuesj on 2018/2/23.
 * 导出pdf工厂类
 */
public class PdfExportFactory implements ExportFactory {
    @Override
    public ExportFile exportFactory(ExportType data) {
        if (ExportType.STANDARD.equals(data)){
            return new ExportStandardPdfFile();
        }else if (ExportType.FINANCIAL.equals(data)){
            return new ExportFinancialPdfFile();
        }
        return null;
    }
}
