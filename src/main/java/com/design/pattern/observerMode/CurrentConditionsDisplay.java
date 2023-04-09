package com.design.pattern.observerMode;

/**
 * 观察者接口的实现类
 * 目前状况布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 主题（可观察者对象）
     */
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("目前状态布告板-温度：" + this.temperature + ", 湿度：" + this.humidity + ", 气压：" + this.pressure);
    }
}
