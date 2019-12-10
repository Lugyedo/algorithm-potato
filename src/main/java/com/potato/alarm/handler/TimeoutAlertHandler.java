package com.potato.alarm.handler;

import com.potato.alarm.AlarmRule;
import com.potato.alarm.ApiStatInfo;
import com.potato.alarm.Notification;

/**
 * @author dehuab
 */
public class TimeoutAlertHandler extends AlarmHandler {
    public TimeoutAlertHandler(AlarmRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {

    }
}
