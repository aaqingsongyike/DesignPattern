package com.design.pattern.decoratorMode;

/**
 * 具体的组件,被装饰者
 * 具体的产品（HouseBlend）
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDesc(getDesc() + "House Blend Coffe");
    }

    /**
     * 这种咖啡的具体价格
     * @return
     */
    @Override
    public double cost() {
        return .89;
    }
}
