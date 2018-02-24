package com.factoryMath;

/**
 * 客户端需求
 * Created by xuesj on 2018/2/23.
 */
public class ExportClient {
    public static void main(String arg[]){
        //打印出pdf财务版
        //创建工厂
        ExportFactory exportFactory = new PdfExportFactory();
        //工厂返回需要的结果
        ExportFile exportFile = exportFactory.exportFactory(ExportType.FINANCIAL);
        exportFile.export("data");
    }
}
