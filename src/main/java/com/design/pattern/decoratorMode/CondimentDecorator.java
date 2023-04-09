package com.design.pattern.decoratorMode;

/**
 * 用来修饰装饰者的组件
 */
public abstract class CondimentDecorator extends Beverage{

    @Override
    public abstract String getDesc();
}
