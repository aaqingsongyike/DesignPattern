package com.design.pattern.decoratorMode;

/**
 * 抽象组件
 */
public abstract class Beverage {

    /**
     * 饮料描述
     */
    private String desc = "未知的饮料";

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 计算饮料的价格
     * @return
     */
    public abstract double cost();
}
