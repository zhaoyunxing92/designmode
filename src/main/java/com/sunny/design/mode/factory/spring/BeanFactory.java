package com.sunny.design.mode.factory.spring;

/**
 * @author sunny
 * @className BeanFactory
 * @date 2018-03-02 16:01
 * @description:
 */
public interface BeanFactory {
    Object getBean(String id);
}
