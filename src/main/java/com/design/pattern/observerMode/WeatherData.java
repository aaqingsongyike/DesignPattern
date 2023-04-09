package com.design.pattern.observerMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WeahterData对象跟物理气象站联系，会随机更新3个布告板的显示
 */
public class WeatherData implements Observable{

    /**
     * 所有的观察者
     */
    private List<Observer> observers;

    /**
     * 状态变化标志  true:状态改变  false:状态没有变化
     */
    private boolean flag = false;

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

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    /**
     * 一旦气象测量更新，此方法会被调用
     * 会通过该方法更新目前状况，气象统计，天气预报的显示布告板
     */
    public void measurementsChanged(float temperature, float humidity, float pressure, Observer observer) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChange();
        notifyObservers(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if (index > 0) {
            this.observers.remove(index);
        }
    }

    @Override
    public void notifyObservers(Observer observer) {
        if (Objects.isNull(observer)) {
            for (Observer o: this.observers) {
                o.update(this.temperature, this.humidity, this.pressure);
            }
        } else {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
        setChange();
    }

    @Override
    public void setChange() {
        if (this.flag) {
            this.flag = false;
        } else {
            this.flag = true;
        }
    }
}
