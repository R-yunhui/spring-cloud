package com.ral.young.service;

import com.ral.young.bo.*;

import java.util.List;

/**
 * @author renyunhui
 * @description 资源监控接口定义
 * @date 2024-08-22 11-39-29
 * @since 1.2.0
 */
public interface ResourceMonitorService {

    /**
     * 查看节点信息
     *
     * @return 集群的节点信息
     */
    List<ClusterNodeInfo> queryClusterNodeInfo();

    /**
     * 查询集群节点状态
     *
     * @param metricsQueryRange 查询条件
     * @return 集群节点状态
     */
    List<ClusterNodeStatus> queryClusterNodeStatus(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群内存使用情况
     *
     * @param metricsQueryRange 查询条件
     * @return 集群内存使用情况
     */
    List<ClusterMemoryInfo> queryMemoryUsage(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群内存使用情况详情
     *
     * @param metricsQueryRange 查询条件
     * @return 集群内存使用情况详情
     */
    List<ClusterMemoryDetail> queryMemoryUsageDetails(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群磁盘使用情况
     *
     * @param metricsQueryRange 查询条件
     * @return 集群磁盘使用情况
     */
    List<ClusterDiskInfo> queryDiskUsage(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群磁盘使用情况详情
     *
     * @param metricsQueryRange 查询条件
     * @return 集群磁盘使用情况详情
     */
    List<ClusterDiskMemoryDetail> queryDiskUsageDetails(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群 CPU 核心使用情况
     *
     * @param metricsQueryRange 查询条件
     * @return 集群 CPU 核心使用情况
     */
    List<ClusterCpuCoreInfo> queryCpuCore(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群 CPU 核心使用情况详情
     *
     * @param metricsQueryRange 查询条件
     * @return 集群 CPU 核心使用情况详情
     */
    List<ClusterCpuCoreDetail> queryCpuCoreDetails(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群网络IO 使用情况详情
     *
     * @param metricsQueryRange 查询条件
     * @return 集群网络流量使用情况详情
     */
    List<ClusterDiskIoDetail> queryDiskIoDetails(MetricsQueryRange metricsQueryRange);

    /**
     * 查询集群磁盘IO 使用情况详情
     *
     * @param metricsQueryRange 查询条件
     * @return 集群网络流量使用情况详情
     */
    List<ClusterNetworkDetail> queryNetworkInfoDetails(MetricsQueryRange metricsQueryRange);

}
