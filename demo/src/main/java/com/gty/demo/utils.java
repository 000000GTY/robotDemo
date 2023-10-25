package com.gty.demo;

import java.util.Random;

public class utils {

    /**
     * 取一个间隔的随机数
     * @param start 开始的数
     * @param end 结束的数
     */
    public static int randamFun(double start,double end){
        Random random = new Random();
        double aDouble =(start + random.nextDouble()*(end - start))*1000;
        return (int)aDouble;
    }

}
