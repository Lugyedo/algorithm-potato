package com.potato.alarm;

public class Demo {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        AlarmContext.getInstance().getAlarm().check(apiStatInfo);
    }
}
