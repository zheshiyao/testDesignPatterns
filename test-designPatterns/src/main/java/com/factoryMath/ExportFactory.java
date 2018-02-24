package com.factoryMath;

/**
 * Created by xuesj on 2018/2/9.
 * 导出文件抽象工厂
 */
public interface ExportFactory {
   public ExportFile exportFactory(ExportType data);
}
