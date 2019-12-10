package com.potato.alarm.handler;

import com.potato.alarm.AlarmRule;
import com.potato.alarm.ApiStatInfo;
import com.potato.alarm.Notification;
import com.potato.alarm.NotificationEmergencyLevel;

/**
 * @author dehuab
 */
public class TpsAlarmHandler extends AlarmHandler {
    public TpsAlarmHandler(AlarmRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
