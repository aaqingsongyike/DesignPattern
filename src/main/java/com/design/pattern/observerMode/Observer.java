package com.design.pattern.observerMode;

/**
 * 观察者接口
 * 定义观察者通用方法，当状态发生改变时的方法
 */
public interface Observer {

    public void update(float temperature, float humidity, float pressure);
}
