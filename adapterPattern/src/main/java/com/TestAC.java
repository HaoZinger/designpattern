package com;

import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 * @author Haozhigang
 *
 *  2019年04月13日18:13
 *
 */
public class TestAC {
    private List<DC5adapter> adapterList = new LinkedList<DC5adapter>();

    TestAC() {
        adapterList.add(new ChinaPowerAdapter());
        adapterList.add(new JapanPowerAdapter());
    }

    DC5adapter getPowerAdapter(AC ac) throws IllegalArgumentException {
        DC5adapter dc5adapter = null;
        for (DC5adapter adapter : adapterList) {
            if (adapter.support(ac)) {
                dc5adapter = adapter;
                break;
            }
        }
        if (dc5adapter == null) {
            throw new IllegalArgumentException("没找到合适的适配器");
        }
        return dc5adapter;
    }
}
