package com.design.pattern.observerMode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 观察者模式测试用例
 */
@SpringBootTest
public class ObserverModeTests {

    @Test
    void observerModeTest() {
        WeatherData observable = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(observable);
        Observer statisticsDisplay = new StatisticsDisplay(observable);
        System.out.println("只通知当前状况");
        observable.measurementsChanged(10.1f, 31.2f, 50.0f, currentConditionsDisplay);
        System.out.println("============");
        System.out.println("通知所有布告板");
        observable.measurementsChanged(10.1f, 31.2f, 50.0f, null);
    }

}
