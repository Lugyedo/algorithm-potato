package com.potato.design.pattern.strategy.sort;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dehuab
 * 每种排序类都是无状态的，没必要在每次使用的时候，都重新创建一个新的对象。所以，可以使用工厂模式对对象的创建进行封装。
 */
public class SortAlgFactory {
    static final String QUICK_SORT = "QuickSort";
    static final String EXTERNAL_SORT = "ExternalSort";
    static final String CONCURRENT_EXTERNAL_SORT = "ConcurrentExternalSort";
    static final String MAP_REDUCE_SORT = "MapReduceSort";

    private static final Map<String, ISortAlg> ALGS = new HashMap<>();

    static {
        ALGS.put(QUICK_SORT, new QuickSort());
        ALGS.put(EXTERNAL_SORT, new ExternalSort());
        ALGS.put(CONCURRENT_EXTERNAL_SORT, new ConcurrentExternalSort());
        ALGS.put(MAP_REDUCE_SORT, new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return ALGS.get(type);
    }
}
