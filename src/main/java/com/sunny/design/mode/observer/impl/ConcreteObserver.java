package com.sunny.design.mode.observer.impl;

import com.sunny.design.mode.observer.Observer;
import com.sunny.design.mode.observer.Subject;

/**
 * @author sunny
 * @className ConcreteObserver
 * @date 2018-02-26 14:29
 * @description: 具体的观察者对象，实现更新方法，使自身的状态和目标的状态保持一致
 */
public class ConcreteObserver implements Observer {
    /**
     * 观察者状态
     */
    private String message;
    /**
     * 观察者名称
     */
    private String observerName;


    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    /**
     * 获取目标类的状态同步到观察者中
     *
     * @param subject 传入的目标对象，方便获取相应的目标对象状态
     */
    @Override
    public void update(Subject subject) {
        this.message = subject.getMessage();
        read();
    }

    private void read() {
        System.out.println(observerName + " 收到消息: " + message);
    }
}
