package com.ral.young.mybatis.filter;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.proxy.jdbc.StatementProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author renyunhui
 * @date 2023-12-13 15:32
 * @since 1.0.0
 */
@Component
@Slf4j
public class SlowSqlMetric extends StatFilter {

    @Override
    protected void handleSlowSql(StatementProxy statementProxy) {
        // 处理慢sql
        final String slowSql = statementProxy.getLastExecuteSql();
        final long nowNano = System.nanoTime();
        final long nanos = nowNano - statementProxy.getLastExecuteStartNano();
        long consumingTime = nanos / (1000 * 1000);
        log.info("慢sql：{}，耗时：{}ms", slowSql, consumingTime);
    }
}
