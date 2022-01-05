package com.yzzg.biz.aliyun.rocketmq;

import com.aliyun.openservices.ons.api.*;

import java.util.Properties;


public class ConsumerClient_04 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        // 您在控制台创建的 Group ID
        properties.put(PropertyKeyConst.GROUP_ID, AliyunPropertyTools.NCARZONEB2CORDER_CONSUMER_GID);
        // AccessKeyId 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.AccessKey, AliyunPropertyTools.AccessKey);
        // AccessKeySecret 阿里云身份验证，在阿里云服务器管理控制台创建
        properties.put(PropertyKeyConst.SecretKey, AliyunPropertyTools.SecretKey);
        // 设置 TCP 接入域名，进入控制台的实例管理页面的“获取接入点信息”区域查看
        properties.put(PropertyKeyConst.NAMESRV_ADDR, AliyunPropertyTools.NAMESRV_ADDR);
        // 顺序消息消费失败进行重试前的等待时间，单位（毫秒），取值范围: 10 毫秒 ~ 30,000 毫秒
        properties.put(PropertyKeyConst.SuspendTimeMillis, "100");
        // 消息消费失败时的最大重试次数
        properties.put(PropertyKeyConst.MaxReconsumeTimes, "20");

        // 在订阅消息前，必须调用 start 方法来启动 Consumer，只需调用一次即可。
        Consumer consumer = ONSFactory.createConsumer(properties);
        consumer.subscribe(
                // Message 所属的 Topic
                AliyunPropertyTools.TOPIC_ORDERMANAGER_PRODUCER,
                // 订阅指定 Topic 下的 Tags：
                // 1. * 表示订阅所有消息
                // 2. TagA || TagB || TagC 表示订阅 TagA 或 TagB 或 TagC 的消息
                "ORDERCENTER_HAVE_SIGN",
                new MessageListener() {
                    /**
                     * 1. 消息消费处理失败或者处理出现异常，返回 OrderAction.Suspend<br>
                     * 2. 消息处理成功，返回 OrderAction.Success
                     */
                    @Override
                    public Action consume(Message message, ConsumeContext context) {
                        System.out.println("ConsumerClient_03 : " + message);
                        return Action.CommitMessage;
                    }


                });



        consumer.subscribe(
                // Message 所属的 Topic
                AliyunPropertyTools.TOPIC_TASKSCHEDULE_PRODUCER,
                // 订阅指定 Topic 下的 Tags：
                // 1. * 表示订阅所有消息
                // 2. TagA || TagB || TagC 表示订阅 TagA 或 TagB 或 TagC 的消息
                "TASKSCHEDULE_TIMEOUT_CALLBACK_NCARZONEB2CORDER",
                new MessageListener() {
                    /**
                     * 1. 消息消费处理失败或者处理出现异常，返回 OrderAction.Suspend<br>
                     * 2. 消息处理成功，返回 OrderAction.Success
                     */
                    @Override
                    public Action consume(Message message, ConsumeContext context) {
                        System.out.println("ConsumerClient_02 : " + message);
                        return Action.CommitMessage;
                    }


                });
        consumer.start();

    }
}