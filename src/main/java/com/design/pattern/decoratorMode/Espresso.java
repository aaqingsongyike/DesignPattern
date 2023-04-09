package com.design.pattern.decoratorMode;

/**
 * 具体的组件,被装饰者
 * 具体的产品（Espresso）
 */
public class Espresso extends Beverage{

    public Espresso() {
        setDesc(getDesc() + "Espresso");
    }

    /**
     * 这种咖啡的具体价格
     * @return
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
