package org.wlw.template;

public abstract class CookTemplate {
    public void cook() {
        buy();
        wash();
        handle();
    }

    public abstract void buy();

    public void wash() {
        System.out.println("打开水龙头");
        System.out.println("冲洗");
    }

    public abstract void handle();
}
