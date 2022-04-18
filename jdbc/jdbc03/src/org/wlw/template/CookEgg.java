package org.wlw.template;

public class CookEgg extends CookTemplate{
    @Override
    public void buy() {
        System.out.println("买了鸡蛋");
        System.out.println("买了西红柿");
    }

    @Override
    public void handle() {
        System.out.println("加入油");
        System.out.println("炒蛋");
        System.out.println("加入西红柿");
        System.out.println("加入配料");
    }
}
