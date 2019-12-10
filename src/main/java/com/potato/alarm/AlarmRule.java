package com.potato.alarm;

/**
 * @author dehuab
 */
public class AlarmRule {
    private long mxaTps;
    private long maxErrorCount;

    public long getMaxTps() {
        return mxaTps;
    }

    public long getMaxErrorCount() {
        return maxErrorCount;
    }

    public AlarmRule getMatchedRule(String apiName) {
        return new AlarmRule();
    }
}
