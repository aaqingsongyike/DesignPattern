package com.design.pattern.decoratorMode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 装饰者模式测试用例
 */
@SpringBootTest
public class DecoratorModeTests {

    @Test
    void observerModeTest() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc() + ": $" + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDesc() + ": $" + beverage1.cost());
    }

}
