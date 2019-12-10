package com.potato.alarm;

import com.potato.alarm.handler.ErrorAlarmHandler;
import com.potato.alarm.handler.TimeoutAlertHandler;
import com.potato.alarm.handler.TpsAlarmHandler;

/**
 * @author dehuab
 */
public class AlarmContext {
    private static final AlarmContext alarmContext = new AlarmContext();

    private AlarmRule rule;
    private Notification notification;
    private Alarm alarm;

    private AlarmContext() {
        initializeBeans();
    }

    public static AlarmContext getInstance() {
        return alarmContext;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    private void initializeBeans() {
        rule = new AlarmRule();
        notification = new Notification();
        alarm = new Alarm();
        alarm.addHandler(new TpsAlarmHandler(rule, notification));
        alarm.addHandler(new ErrorAlarmHandler(rule, notification));
        alarm.addHandler(new TimeoutAlertHandler(rule, notification));
    }
}