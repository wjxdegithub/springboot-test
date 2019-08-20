package com.example.demo.config;


import com.p6spy.engine.common.P6Util;
import com.p6spy.engine.logging.Category;
import com.p6spy.engine.spy.appender.StdoutLogger;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Created by 程振奇 on 2018/06/04.
 */
public class P6SpyLogger extends StdoutLogger {

    protected final Log log = LogFactory.getLog(this.getClass());


    /**
     * 重写输出方法
     *
     * @param connectionId 连接id
     * @param now          当前时间
     * @param elapsed      执行时长，包括执行 SQL 和处理结果集的时间(可以参考来调优)
     * @param category     语句分类，statement、resultset 等
     * @param prepared     查询语句。可能是 prepared statement，表现为 select * from table1 where c1=?，问号参数形式
     * @param sql          含参数值的查询语句，如 select * from from table1 where c1=7
     */
    @Override
    public void logSQL(int connectionId, String now, long elapsed, Category category, String prepared, String sql) {
        if (!Category.COMMIT.equals(category) && !prepared.startsWith("select count(")) {
            this.logText(P6Util.singleLine(sql));
        }

    }

    @Override
    public void logText(String text) {
        if (StringUtils.isNoneBlank(text)) {
            log.info("执行的sql为: " + text.trim());
        }
    }

}