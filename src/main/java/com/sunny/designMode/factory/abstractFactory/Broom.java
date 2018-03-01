package com.sunny.designMode.factory.abstractFactory;

import com.sunny.designMode.factory.abstractFactory.abstraction.Vehicle;

/**
 * @author sunny
 * @className Broom
 * @date 2018-02-28 09:58
 * @description:
 */
public class Broom extends Vehicle {
    @Override
    public void run() {
        System.out.println("扫帚飞过来...");
    }
}
