package com.sunny.design.mode.factory.statical;

/**
 * @author sunny
 * @className PlaneFactory
 * @date 2018-02-27 17:44
 * @description:
 */
public class PlaneFactory extends VehicleFactory {
    
    @Override
    Moveable create() {
        return new Plane();
    }
}
