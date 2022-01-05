package com.yzzg.biz.aliyun.rocketmq;

import com.aliyun.openservices.shade.com.alibaba.fastjson.JSON;
import com.aliyun.openservices.shade.com.alibaba.fastjson.JSONObject;
import com.aliyun.openservices.shade.org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.Random;

public class AliyunPropertyTools {

    // 开发环境（NCZ-DEV）
//    public static final String NAMESRV_ADDR = "http://MQ_INST_1846819814603408_BbEQKQJE.mq-internet-access.mq-internet.aliyuncs.com:80";
//    public static final String AccessKey = "LTAIVvPZvFcj6DxP";
//    public static final String SecretKey = "Xtd2CgbFcZtfpkhvm951rX6YVScy8c";

    // 测试环境
    public static final String NAMESRV_ADDR = "http://MQ_INST_1846819814603408_BbEQK0Kg.mq-internet-access.mq-internet.aliyuncs.com:80";
    public static final String AccessKey = "LTAIENEMp45wZoNP";
    public static final String SecretKey = "vHuxbRPp4lJTfvktPBH1TxnZRuhZaE";

    public static final String NCARZONEB2CORDER_PRODUCER_GID = "GID_NCZ-ncarzoneb2corder-demo";
    public static final String NCARZONEB2CORDER_CONSUMER_GID = "GID_NCZ-ncarzoneb2corder-demo";

    public static final String TOPIC_NCARZONEB2CORDER_PRODUCER = "MQ_NCZ-1-ncarzoneb2corder";
    public static final String TOPIC_TTRADE_PRODUCER = "MQ_NCZ-1-ttrade";
    public static final String TOPIC_ORDERMANAGER_PRODUCER = "MQ_NCZ-1-ordermanager";
    public static final String TOPIC_TASKSCHEDULE_PRODUCER = "MQ_NCZ-1-taskschedule";



    public static final String extgateway_gid = "GID_NCZ-1-extgateway-testi0";
    public static final String extgateway_topic = "MQ_NCZ-1-extgateway";



//    public static String message = "{\n" +
//            "  \"alipayNo\": \"2020082722001106951413905246\",\n" +
//            "  \"buyerAlipayNo\": \"***4922837f1@alitest.com\",\n" +
//            "  \"buyerArea\": \"上海上海阿里巴巴软件(上海)有限公司\",\n" +
//            "  \"buyerNick\": \"cdb测试买家01\",\n" +
//            "  \"buyerOpenUid\": \"AAHSDegRALV1-r0_GTIdpgG3\",\n" +
//            "  \"consignTime\": 1598507045000,\n" +
//            "  \"created\": 1598505596000,\n" +
//            "  \"discountFee\": \"0.00\",\n" +
//            "  \"lm\": \"1\",\n" +
//            "  \"modified\": 1598507248000,\n" +
//            "  \"nczExtAttrObject\": {\n" +
//            "    \"nczBuyerName\": \"不需要收货人\",\n" +
//            "    \"nczChannel\": \"102000\",\n" +
//            "    \"nczLocalOrder\": \"true\",\n" +
//            "    \"nczPayChannel\": \"alipay\",\n" +
//            "    \"nczStoreId\": \"323584009\",\n" +
//            "    \"nczStoreName\": \"钰诚汽车装饰\"\n" +
//            "  },\n" +
//            "  \"newPresell\": false,\n" +
//            "  \"orders\": [\n" +
//            "    {\n" +
//            "      \"adjustFee\": \"0.00\",\n" +
//            "      \"buyerRate\": false,\n" +
//            "      \"cid\": 50012131,\n" +
//            "      \"consignTime\": \"2020-08-27 13:44:05\",\n" +
//            "      \"discountFee\": \"0.00\",\n" +
//            "      \"divideOrderFee\": \"0.01\",\n" +
//            "      \"endTime\": 1598507248000,\n" +
//            "      \"invoiceNo\": \"YT4738888589451\",\n" +
//            "      \"isDaixiao\": false,\n" +
//            "      \"isOversold\": false,\n" +
//            "      \"isShShip\": false,\n" +
//            "      \"logisticsCompany\": \"圆通速递\",\n" +
//            "      \"num\": 1,\n" +
//            "      \"numIid\": 591902368175,\n" +
//            "      \"oid\": 1208030691320010428,\n" +
//            "      \"oidStr\": \"1208030691320010428\",\n" +
//            "      \"orderFrom\": \"TAOBAO\",\n" +
//            "      \"outerIid\": \"MF0007\",\n" +
//            "      \"payment\": \"0.01\",\n" +
//            "      \"picPath\": \"https://img.alicdn.com/bao/uploaded/i3/TB1lrbjLpXXXXaWaXXXXXXXXXXX_!!0-item_pic.jpg\",\n" +
//            "      \"price\": \"0.01\",\n" +
//            "      \"refundStatus\": \"NO_REFUND\",\n" +
//            "      \"sellerRate\": false,\n" +
//            "      \"sellerType\": \"B\",\n" +
//            "      \"shipper\": \"seller\",\n" +
//            "      \"shippingType\": \"express\",\n" +
//            "      \"skuId\": \"4074014428906\",\n" +
//            "      \"skuPropertiesName\": \"轮胎类型:防爆胎;销售版本:黑色\",\n" +
//            "      \"snapshotUrl\": \"r:1208030691320010428_1\",\n" +
//            "      \"status\": \"TRADE_FINISHED\",\n" +
//            "      \"storeCode\": \"11111000\",\n" +
//            "      \"title\": \"测试轮胎请不要拍（小建）\",\n" +
//            "      \"totalFee\": \"0.01\"\n" +
//            "    },\n" +
//            "    {\n" +
//            "      \"adjustFee\": \"0.00\",\n" +
//            "      \"buyerRate\": false,\n" +
//            "      \"cid\": 50012346,\n" +
//            "      \"consignTime\": \"2020-08-27 13:44:05\",\n" +
//            "      \"discountFee\": \"0.00\",\n" +
//            "      \"divideOrderFee\": \"1.00\",\n" +
//            "      \"endTime\": 1598507248000,\n" +
//            "      \"invoiceNo\": \"YT4738888589451\",\n" +
//            "      \"isDaixiao\": false,\n" +
//            "      \"isOversold\": false,\n" +
//            "      \"isShShip\": false,\n" +
//            "      \"logisticsCompany\": \"圆通速递\",\n" +
//            "      \"num\": 1,\n" +
//            "      \"numIid\": 625358129483,\n" +
//            "      \"oid\": 1208030691321010428,\n" +
//            "      \"oidStr\": \"1208030691321010428\",\n" +
//            "      \"orderFrom\": \"TAOBAO\",\n" +
//            "      \"outerIid\": \"MF0007\",\n" +
//            "      \"payment\": \"1.00\",\n" +
//            "      \"picPath\": \"https://img.alicdn.com/bao/uploaded/i4/443534648/TB2dCc9aw_xQeBjy0FoXXX1vpXa-443534648.png\",\n" +
//            "      \"price\": \"1.00\",\n" +
//            "      \"refundStatus\": \"NO_REFUND\",\n" +
//            "      \"sellerRate\": false,\n" +
//            "      \"sellerType\": \"B\",\n" +
//            "      \"shipper\": \"seller\",\n" +
//            "      \"shippingType\": \"express\",\n" +
//            "      \"snapshotUrl\": \"r:1208030691321010428_1\",\n" +
//            "      \"status\": \"TRADE_FINISHED\",\n" +
//            "      \"storeCode\": \"11111000\",\n" +
//            "      \"title\": \"(测试商品请不要拍)克隆商品=623968516493\",\n" +
//            "      \"totalFee\": \"1.00\"\n" +
//            "    }\n" +
//            "  ],\n" +
//            "  \"payTime\": 1598505620000,\n" +
//            "  \"payment\": \"1.01\",\n" +
//            "  \"postFee\": \"0.00\",\n" +
//            "  \"receiverAddress\": \"   翠苑街道 1-3-501\",\n" +
//            "  \"receiverCity\": \"杭州市\",\n" +
//            "  \"receiverCountry\": \"\",\n" +
//            "  \"receiverDistrict\": \"西湖区\",\n" +
//            "  \"receiverMobile\": \"18989488514\",\n" +
//            "  \"receiverName\": \"程洋洋\",\n" +
//            "  \"receiverState\": \"浙江省\",\n" +
//            "  \"receiverTown\": \"\",\n" +
//            "  \"receiverZip\": \"000000\",\n" +
//            "  \"sellerNick\": \"喵养车汽车服务旗舰店\",\n" +
//            "  \"sellerRate\": false,\n" +
//            "  \"sid\": \"1208030691319010428\",\n" +
//            "  \"status\": \"TRADE_FINISHED\",\n" +
//            "  \"tid\": 1208030691319010428,\n" +
//            "  \"tidStr\": \"1208030691319010428\",\n" +
//            "  \"title\": \"d[s58498512]\",\n" +
//            "  \"totalFee\": \"1.01\",\n" +
//            "  \"type\": \"fixed\",\n" +
//            "  \"youXiang\": false\n" +
//            "}";


    public static String jsonStr = "{\n" +
            "  \"alipayNo\": \"2020082722001106951413905246\",\n" +
            "  \"buyerAlipayNo\": \"***4922837f1@alitest.com\",\n" +
            "  \"buyerArea\": \"上海上海阿里巴巴软件(上海)有限公司\",\n" +
            "  \"buyerNick\": \"cdb测试买家01\",\n" +
            "  \"buyerOpenUid\": \"AAHSDegRALV1-r0_GTIdpgG3\",\n" +
            "  \"consignTime\": 1598507045000,\n" +
            "  \"created\": 1598505596000,\n" +
            "  \"discountFee\": \"0.00\",\n" +
            "  \"lm\": \"1\",\n" +
            "  \"modified\": 1598507248000,\n" +
            "  \"nczExtAttrObject\": {\n" +
            "    \"nczBuyerName\": \"不需要收货人\",\n" +
            "    \"nczChannel\": \"102000\",\n" +
            "    \"nczLocalOrder\": \"true\",\n" +
            "    \"nczPayChannel\": \"alipay\",\n" +
            "    \"nczStoreId\": \"323584009\",\n" +
            "    \"nczStoreName\": \"钰诚汽车装饰\"\n" +
            "  },\n" +
            "  \"newPresell\": false,\n" +
            "  \"orders\": [\n" +
            "    {\n" +
            "      \"adjustFee\": \"0.00\",\n" +
            "      \"buyerRate\": false,\n" +
            "      \"cid\": 50012131,\n" +
            "      \"consignTime\": \"2020-08-27 13:44:05\",\n" +
            "      \"discountFee\": \"0.00\",\n" +
            "      \"divideOrderFee\": \"0.01\",\n" +
            "      \"endTime\": 1598507248000,\n" +
            "      \"invoiceNo\": \"YT4738888589451\",\n" +
            "      \"isDaixiao\": false,\n" +
            "      \"isOversold\": false,\n" +
            "      \"isShShip\": false,\n" +
            "      \"logisticsCompany\": \"圆通速递\",\n" +
            "      \"num\": 1,\n" +
            "      \"numIid\": 591902368175,\n" +
            "      \"oid\": 1208030691320010428,\n" +
            "      \"oidStr\": \"1208030691320010428\",\n" +
            "      \"orderFrom\": \"TAOBAO\",\n" +
            "      \"outerIid\": \"ACASAD0001\",\n" +
            "      \"payment\": \"0.01\",\n" +
            "      \"picPath\": \"https://img.alicdn.com/bao/uploaded/i3/TB1lrbjLpXXXXaWaXXXXXXXXXXX_!!0-item_pic.jpg\",\n" +
            "      \"price\": \"0.01\",\n" +
            "      \"refundStatus\": \"NO_REFUND\",\n" +
            "      \"sellerRate\": false,\n" +
            "      \"sellerType\": \"B\",\n" +
            "      \"shipper\": \"seller\",\n" +
            "      \"shippingType\": \"express\",\n" +
            "      \"skuId\": \"4074014428906\",\n" +
            "      \"skuPropertiesName\": \"轮胎类型:防爆胎;销售版本:黑色\",\n" +
            "      \"snapshotUrl\": \"r:1208030691320010428_1\",\n" +
            "      \"status\": \"WAIT_SELLER_SEND_GOODS\",\n" +
            "      \"storeCode\": \"11111000\",\n" +
            "      \"title\": \"测试轮胎请不要拍（小建）\",\n" +
            "      \"totalFee\": \"0.01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"adjustFee\": \"0.00\",\n" +
            "      \"buyerRate\": false,\n" +
            "      \"cid\": 50012346,\n" +
            "      \"consignTime\": \"2020-08-27 13:44:05\",\n" +
            "      \"discountFee\": \"0.00\",\n" +
            "      \"divideOrderFee\": \"1.00\",\n" +
            "      \"endTime\": 1598507248000,\n" +
            "      \"invoiceNo\": \"YT4738888589451\",\n" +
            "      \"isDaixiao\": false,\n" +
            "      \"isOversold\": false,\n" +
            "      \"isShShip\": false,\n" +
            "      \"logisticsCompany\": \"圆通速递\",\n" +
            "      \"num\": 1,\n" +
            "      \"numIid\": 625358129483,\n" +
            "      \"oid\": 1208030691321010428,\n" +
            "      \"oidStr\": \"1208030691321010428\",\n" +
            "      \"orderFrom\": \"TAOBAO\",\n" +
            "      \"outerIid\": \"ACASAD0001\",\n" +
            "      \"payment\": \"1.00\",\n" +
            "      \"picPath\": \"https://img.alicdn.com/bao/uploaded/i4/443534648/TB2dCc9aw_xQeBjy0FoXXX1vpXa-443534648.png\",\n" +
            "      \"price\": \"1.00\",\n" +
            "      \"refundStatus\": \"NO_REFUND\",\n" +
            "      \"sellerRate\": false,\n" +
            "      \"sellerType\": \"B\",\n" +
            "      \"shipper\": \"seller\",\n" +
            "      \"shippingType\": \"express\",\n" +
            "      \"snapshotUrl\": \"r:1208030691321010428_1\",\n" +
            "      \"status\": \"WAIT_SELLER_SEND_GOODS\",\n" +
            "      \"storeCode\": \"11111000\",\n" +
            "      \"title\": \"(测试商品请不要拍)克隆商品=623968516493\",\n" +
            "      \"totalFee\": \"1.00\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"payTime\": 1598505620000,\n" +
            "  \"payment\": \"1.01\",\n" +
            "  \"postFee\": \"0.00\",\n" +
            "  \"receiverAddress\": \"   翠苑街道 1-3-501\",\n" +
            "  \"receiverCity\": \"杭州市\",\n" +
            "  \"receiverCountry\": \"\",\n" +
            "  \"receiverDistrict\": \"西湖区\",\n" +
            "  \"receiverMobile\": \"18989488514\",\n" +
            "  \"receiverName\": \"程洋洋\",\n" +
            "  \"receiverState\": \"浙江省\",\n" +
            "  \"receiverTown\": \"\",\n" +
            "  \"receiverZip\": \"000000\",\n" +
            "  \"sellerNick\": \"喵养车汽车服务旗舰店\",\n" +
            "  \"sellerRate\": false,\n" +
            "  \"sid\": \"1208030691319010482\",\n" +
            "  \"status\": \"WAIT_SELLER_SEND_GOODS\",\n" +
            "  \"tid\": 1208030691319010492,\n" +
            "  \"tidStr\": \"1208030691319010482\",\n" +
            "  \"title\": \"d[s58498512]\",\n" +
            "  \"totalFee\": \"1.01\",\n" +
            "  \"type\": \"fixed\",\n" +
            "  \"youXiang\": false\n" +
            "}";


    public static String jsonTestStr = "{\n" +
            "  \"alipayNo\": \"2020082722001106951413905246\",\n" +
            "  \"buyerAlipayNo\": \"***4922837f1@alitest.com\",\n" +
            "  \"buyerArea\": \"上海上海阿里巴巴软件(上海)有限公司\",\n" +
            "  \"buyerNick\": \"商家测试帐号42\",\n" +
            "  \"buyerOpenUid\": \"AAHSDegRALV1-r0_GTIdpgG3\",\n" +
            "  \"consignTime\": 1598507045000,\n" +
            "  \"created\": 1598505596000,\n" +
            "  \"discountFee\": \"0.00\",\n" +
            "  \"lm\": \"1\",\n" +
            "  \"modified\": 1598507248000,\n" +
            "  \"nczExtAttrObject\": {\n" +
            "    \"nczBuyerName\": \"不需要收货人\",\n" +
            "    \"nczChannel\": \"102000\",\n" +
            "    \"nczLocalOrder\": \"true\",\n" +
            "    \"nczPayChannel\": \"alipay\",\n" +
            "    \"nczStoreId\": \"371801004\",\n" +
            "    \"nczStoreName\": \"钰诚汽车装饰\"\n" +
            "  },\n" +
            "  \"newPresell\": false,\n" +
            "  \"orders\": [\n" +
            "    {\n" +
            "      \"adjustFee\": \"0.00\",\n" +
            "      \"buyerRate\": false,\n" +
            "      \"cid\": 50012131,\n" +
            "      \"consignTime\": \"2020-08-27 13:44:05\",\n" +
            "      \"discountFee\": \"0.00\",\n" +
            "      \"divideOrderFee\": \"0.01\",\n" +
            "      \"endTime\": 1598507248000,\n" +
            "      \"invoiceNo\": \"YT4738888589451\",\n" +
            "      \"isDaixiao\": false,\n" +
            "      \"isOversold\": false,\n" +
            "      \"isShShip\": false,\n" +
            "      \"logisticsCompany\": \"圆通速递\",\n" +
            "      \"num\": 1,\n" +
            "      \"numIid\": 591902368175,\n" +
            "      \"oid\": 1208030691320010428,\n" +
            "      \"oidStr\": \"1208030691320010428\",\n" +
            "      \"orderFrom\": \"TAOBAO\",\n" +
            "      \"outerIid\": \"MQL0811\",\n" +
            "      \"payment\": \"0.01\",\n" +
            "      \"picPath\": \"https://img.alicdn.com/bao/uploaded/i3/TB1lrbjLpXXXXaWaXXXXXXXXXXX_!!0-item_pic.jpg\",\n" +
            "      \"price\": \"0.01\",\n" +
            "      \"refundStatus\": \"NO_REFUND\",\n" +
            "      \"sellerRate\": false,\n" +
            "      \"sellerType\": \"B\",\n" +
            "      \"shipper\": \"seller\",\n" +
            "      \"shippingType\": \"express\",\n" +
            "      \"skuId\": \"4074014428906\",\n" +
            "      \"skuPropertiesName\": \"轮胎类型:防爆胎;销售版本:黑色\",\n" +
            "      \"snapshotUrl\": \"r:1208030691320010428_1\",\n" +
            "      \"status\": \"WAIT_SELLER_SEND_GOODS\",\n" +
            "      \"storeCode\": \"11111000\",\n" +
            "      \"title\": \"测试轮胎请不要拍（小建）\",\n" +
            "      \"totalFee\": \"0.01\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"adjustFee\": \"0.00\",\n" +
            "      \"buyerRate\": false,\n" +
            "      \"cid\": 50012346,\n" +
            "      \"consignTime\": \"2020-08-27 13:44:05\",\n" +
            "      \"discountFee\": \"0.00\",\n" +
            "      \"divideOrderFee\": \"1.00\",\n" +
            "      \"endTime\": 1598507248000,\n" +
            "      \"invoiceNo\": \"YT4738888589451\",\n" +
            "      \"isDaixiao\": false,\n" +
            "      \"isOversold\": false,\n" +
            "      \"isShShip\": false,\n" +
            "      \"logisticsCompany\": \"圆通速递\",\n" +
            "      \"num\": 1,\n" +
            "      \"numIid\": 625358129483,\n" +
            "      \"oid\": 1208030691321010428,\n" +
            "      \"oidStr\": \"1208030691321010428\",\n" +
            "      \"orderFrom\": \"TAOBAO\",\n" +
            "      \"outerIid\": \"MQL0811\",\n" +
            "      \"payment\": \"1.00\",\n" +
            "      \"picPath\": \"https://img.alicdn.com/bao/uploaded/i4/443534648/TB2dCc9aw_xQeBjy0FoXXX1vpXa-443534648.png\",\n" +
            "      \"price\": \"1.00\",\n" +
            "      \"refundStatus\": \"NO_REFUND\",\n" +
            "      \"sellerRate\": false,\n" +
            "      \"sellerType\": \"B\",\n" +
            "      \"shipper\": \"seller\",\n" +
            "      \"shippingType\": \"express\",\n" +
            "      \"snapshotUrl\": \"r:1208030691321010428_1\",\n" +
            "      \"status\": \"WAIT_SELLER_SEND_GOODS\",\n" +
            "      \"storeCode\": \"11111000\",\n" +
            "      \"title\": \"(测试商品请不要拍)克隆商品=623968516493\",\n" +
            "      \"totalFee\": \"1.00\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"payTime\": 1598505620000,\n" +
            "  \"payment\": \"1.01\",\n" +
            "  \"postFee\": \"0.00\",\n" +
            "  \"receiverAddress\": \"乐佳国际\",\n" +
            "  \"receiverCity\": \"杭州市\",\n" +
            "  \"receiverCountry\": \"\",\n" +
            "  \"receiverDistrict\": \"余杭区\",\n" +
            "  \"receiverMobile\": \"18989488514\",\n" +
            "  \"receiverName\": \"liuyaguang\",\n" +
            "  \"receiverState\": \"浙江省\",\n" +
            "  \"receiverTown\": \"\",\n" +
            "  \"receiverZip\": \"000000\",\n" +
            "  \"sellerNick\": \"商家测试帐号42\",\n" +
            "  \"sellerRate\": false,\n" +
            "  \"sid\": \"1208030691319010482\",\n" +
            "  \"status\": \"WAIT_SELLER_SEND_GOODS\",\n" +
            "  \"tid\": 1208030691319010492,\n" +
            "  \"tidStr\": \"1208030691319010482\",\n" +
            "  \"title\": \"d[s58498512]\",\n" +
            "  \"totalFee\": \"1.01\",\n" +
            "  \"type\": \"fixed\",\n" +
            "  \"youXiang\": false\n" +
            "}";


    public static void main(String[] args) {
        long  times_str = new Date().getTime();
        System.out.println(times_str);
        String jsonStr = AliyunPropertyTools.jsonStr;

        JSONObject jsonObject = JSON.parseObject(jsonStr);
        if (StringUtils.isNotEmpty(jsonStr) && jsonObject != null) {
            jsonStr = jsonObject.put("tid",times_str).toString();
        }
    }
}
