package com.potato.alarm.handler;

import com.potato.alarm.AlarmRule;
import com.potato.alarm.ApiStatInfo;
import com.potato.alarm.Notification;

/**
 * @author dehuab
 */
public abstract class AlarmHandler {
    AlarmRule rule;
    Notification notification;

    AlarmHandler(AlarmRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
