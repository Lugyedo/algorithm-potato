package com.potato.alarm;

import lombok.Data;

/**
 * @author dehuab
 */
@Data
public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
    private long timeoutCount;
}
