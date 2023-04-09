package com.design.pattern.observerMode;

/**
 * 观察者接口的实现类
 * 追踪最小，最大的布告板
 */
public class StatisticsDisplay implements Observer, DisplayElement{

    /**
     * 温度(最小)
     */
    private float minTemperature = -100f;

    /**
     * 温度（最大）
     */
    private float maxTemperature = 100f;

    /**
     * 湿度(最小)
     */
    private float minHumidity = -100f;

    /**
     * 湿度（最大）
     */
    private float maxHumidity = 100f;

    /**
     * 气压(最小)
     */
    private float minPressure = -100f;

    /**
     * 气压（最大）
     */
    private float maxPressure = 100f;

    /**
     * 主题（可观察者对象）
     */
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (this.minTemperature == -100f || temperature <= this.minTemperature) {
            this.minTemperature = temperature;
        }
        if (this.maxTemperature  == 100f || temperature >= this.maxTemperature) {
            this.maxTemperature = temperature;
        }
        if (this.minHumidity == -100f || humidity <= this.minHumidity) {
            this.minHumidity = humidity;
        }
        if (this.maxHumidity == 100f || humidity >= this.maxHumidity) {
            this.maxHumidity = humidity;
        }
        if (this.minPressure == -100f || pressure <= this.minPressure) {
            this.minPressure = pressure;
        }
        if (this.maxPressure == 100f || humidity >= this.maxPressure) {
            this.maxPressure = pressure;
        }
        this.display();
    }

    @Override
    public void display() {
        System.out.println("跟踪最高最低状态布告板-最低温度：" + this.minTemperature
                +  "，最高温度：" + this.maxTemperature + ", 最低湿度：" + this.minHumidity
                + "，最高湿度：" + this.maxHumidity + ", 最低气压：" + this.minPressure
                + ", 最高气压：" + this.maxPressure);
    }
}
