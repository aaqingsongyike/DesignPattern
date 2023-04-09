package com.design.pattern.observerMode;

/**
 * 主题（可观察者）
 * 定义通用的方法：注册观察者，溢出观察者，通知观察者
 */
public interface Observable {

    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除指定的观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObservers(Observer observer);

    /**
     * 状态是否发生变化
     */
    public void setChange();
}
