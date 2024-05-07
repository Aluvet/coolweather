package com.example.weatherforecast.DB;

import org.litepal.crud.LitePalSupport;
//表结构 省市
public class Province extends LitePalSupport {
    /*id 每个实体类应有的字段
    * provinceName记录省的名字
    * provinceCode 省的代号
    * 若使用litepal需将实体类继承自  LitePalSupport  */
    private int id;
    private String provinceName;
    private  int provinceCode;
//  生成getter 以及 setter方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
