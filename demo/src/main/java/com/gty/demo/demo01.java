package com.gty.demo;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;

public class demo01 {



    public static void main(String[] args) {
        Robot robot;
        int RETIME = 0;
//      创建一个定时器对象
//        Timer timer = new Timer();

// 创建一个定时任务类


// 在主方法中，创建一个定时任务对象
//        MyTask task = new MyTask();

// 调用定时器的schedule方法，安排定时任务
// 参数1：定时任务对象
// 参数2：第一次执行的延迟时间，单位毫秒
// 参数3：每次执行的间隔时间，单位毫秒
//        timer.schedule(task, 0, 2000);

        {
            try {
                robot = new Robot();
                robot.delay(5*1000);
                while (true){
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyRelease(KeyEvent.VK_E);


                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyRelease(KeyEvent.VK_K);

                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyRelease(KeyEvent.VK_J);

                    robot.delay(utils.randamFun(0.1,0.5));
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(utils.randamFun(0.1,0.5));
                    robot.keyRelease(KeyEvent.VK_K);

                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyRelease(KeyEvent.VK_I);

                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyRelease(KeyEvent.VK_K);



                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyPress(KeyEvent.VK_SPACE );
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyRelease(KeyEvent.VK_SPACE );

                    robot.delay(utils.randamFun(0.3,0.6));
                      robot.keyPress(KeyEvent.VK_R);
                    robot.delay(utils.randamFun(0.3,0.6));
                    robot.keyRelease(KeyEvent.VK_R);

                }

            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }

}
