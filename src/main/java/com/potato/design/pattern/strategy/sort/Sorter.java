package com.potato.design.pattern.strategy.sort;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.potato.design.pattern.strategy.sort.SortAlgFactory.CONCURRENT_EXTERNAL_SORT;
import static com.potato.design.pattern.strategy.sort.SortAlgFactory.EXTERNAL_SORT;
import static com.potato.design.pattern.strategy.sort.SortAlgFactory.MAP_REDUCE_SORT;
import static com.potato.design.pattern.strategy.sort.SortAlgFactory.QUICK_SORT;

/**
 * @author dehuab
 */
public class Sorter {
    private static final long GB = 1024 * 1024 * 1024;
    private static final List<AlgRange> ALGS = new ArrayList<>();

    static {
        ALGS.add(new AlgRange(0, 6 * GB, SortAlgFactory.getSortAlg(QUICK_SORT)));
        ALGS.add(new AlgRange(6 * GB, 10 * GB, SortAlgFactory.getSortAlg(EXTERNAL_SORT)));
        ALGS.add(new AlgRange(10 * GB, 100 * GB, SortAlgFactory.getSortAlg(CONCURRENT_EXTERNAL_SORT)));
        ALGS.add(new AlgRange(100 * GB, Long.MAX_VALUE, SortAlgFactory.getSortAlg(MAP_REDUCE_SORT)));
    }

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        ISortAlg sortAlg = null;
        for (AlgRange algRange : ALGS) {
            if (algRange.inRange(fileSize)) {
                sortAlg = algRange.getAlg();
                break;
            }
        }
        sortAlg.sort(filePath);
    }

    private static class AlgRange {
        private long start;
        private long end;
        private ISortAlg alg;

        AlgRange(long start, long end, ISortAlg alg) {
            this.start = start;
            this.end = end;
            this.alg = alg;
        }

        ISortAlg getAlg() {
            return alg;
        }

        boolean inRange(long size) {
            return size >= start && size < end;
        }
    }
}
