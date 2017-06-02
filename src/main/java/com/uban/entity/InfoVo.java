package com.uban.entity;

/**
 * Created by DuanYangYu on 2017/5/26 0026.
 */
public class InfoVo {
    private String code;
    private String name;
    private String date;
    private String money;

    public InfoVo() { }

    public InfoVo(String code, String name, String date, String money) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.money = money;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }
}
