package com.potato.alarm;

import com.potato.alarm.handler.AlarmHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dehuab
 */
public class Alarm {
    private List<AlarmHandler> alarmHandlers = new ArrayList<>();

    public void addHandler(AlarmHandler handler) {
        this.alarmHandlers.add(handler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlarmHandler handler : alarmHandlers) {
            handler.check(apiStatInfo);
        }
    }
}
