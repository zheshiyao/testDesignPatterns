package com.factoryMath;

/**
 * Created by xuesj on 2018/2/23.
 * 导出html工厂类
 */
public class HtmlExportFactory implements ExportFactory {
    @Override
    public ExportFile exportFactory(ExportType data) {
        if (ExportType.STANDARD.equals(data)){
            return new ExportStandardHtmlFile();
        }else if (ExportType.FINANCIAL.equals(data)){
            return new ExportFinancialHtmlFile();
        }
        return null;
    }
}
