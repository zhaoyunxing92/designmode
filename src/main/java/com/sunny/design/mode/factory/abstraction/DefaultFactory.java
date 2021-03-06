package com.sunny.design.mode.factory.abstraction;

import com.sunny.design.mode.factory.abstraction.abstraction.AbstractFactory;
import com.sunny.design.mode.factory.abstraction.abstraction.Food;
import com.sunny.design.mode.factory.abstraction.abstraction.Vehicle;
import com.sunny.design.mode.factory.abstraction.abstraction.Weapon;

/**
 * @author sunny
 * @className DefaultFactory
 * @date 2018-02-28 09:55
 * @description:
 */
public class DefaultFactory extends AbstractFactory {

    /**
     * 创建交通工具
     *
     * @return
     */
    @Override
    public Vehicle createVehicle() {
        return null;
    }

    /**
     * 创建武器
     *
     * @return
     */
    @Override
    public Weapon createWeapon() {
        return null;
    }

    /**
     * 创建食物
     *
     * @return
     */
    @Override
    public Food createFood() {
        return null;
    }
}
