package com.sunny.design.mode.factory.abstraction;

import com.sunny.design.mode.factory.abstraction.abstraction.Weapon;

/**
 * @author sunny
 * @className AK47
 * @date 2018-02-28 09:38
 * @description:
 */
public class AK47 extends Weapon {
    @Override
    public void shoot() {
        System.out.println("哒哒哒....");
    }
}
