package com.dou.learnproject.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池工具类 ThreadPoolExecutor
 *
 * @author doulongfei
 * @date 2022/10/10
 */
public class ThreadPollUtils {
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;
    public final ThreadPoolExecutor poolExecutor;
    private volatile static ThreadPollUtils INSTANCE;

    public static ThreadPollUtils getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadPollUtils.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadPollUtils();
                }
            }
        }
        return INSTANCE;
    }

    private ThreadPollUtils() {
        /*
        ThreadPoolExecutor(int corePoolSize,//线程池的核心线程数量
                           int maximumPoolSize,//线程池的最大线程数
                           long keepAliveTime,//当线程数大于核心线程数时，多余的空闲线程存活的最长时间
                           TimeUnit unit,//时间单位
                           BlockingQueue<Runnable> workQueue,//任务队列，用来储存等待执行任务的队列
                           ThreadFactory threadFactory,//线程工厂，用来创建线程，一般默认即可
                           RejectedExecutionHandler handler//拒绝策略，当提交的任务过多而不能及时处理时，我们可以定制策略来处理任务
                           )
         */
        poolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY),new NamingThreadFactory(""), new ThreadPoolExecutor.CallerRunsPolicy());
    }
}
