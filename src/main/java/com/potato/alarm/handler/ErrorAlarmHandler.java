package com.potato.alarm.handler;

import com.potato.alarm.AlarmRule;
import com.potato.alarm.ApiStatInfo;
import com.potato.alarm.Notification;
import com.potato.alarm.NotificationEmergencyLevel;

/**
 * @author dehuab
 */
public class ErrorAlarmHandler extends AlarmHandler {
    public ErrorAlarmHandler(AlarmRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
