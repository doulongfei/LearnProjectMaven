package com.dou.learnproject.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class NamingThreadFactory implements ThreadFactory {

    private final AtomicInteger mThreadNum = new AtomicInteger();
    private ThreadFactory mDelegate;
    private final String mName;

    /**
     * 创建一个带名字的线程池生产工厂
     */
    public NamingThreadFactory(ThreadFactory delegate, String name) {
        mDelegate = delegate;
        mName = name;
    }

    public NamingThreadFactory(String name) {
        mName = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = mDelegate.newThread(r);
        t.setName(mName + " [#" + mThreadNum.incrementAndGet() + "]");
        return t;
    }

}
