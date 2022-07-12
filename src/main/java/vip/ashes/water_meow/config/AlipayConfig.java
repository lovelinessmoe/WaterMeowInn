package vip.ashes.water_meow.config;

import com.alipay.easysdk.kernel.Config;

/**
 * 类名：AlipayConfig
 * 功能：基础配置类
 * 详细：设置帐户有关信息及返回路径
 * 修改日期：2017-04-05
 * 说明：
 * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */
    public static String app_id = "2021000118645987";

    /**
     * 商户私钥，您的PKCS8格式RSA2私钥
     */
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCDYw0sjpaRBIxLbEOkuS16TDqrQExvf3zS2s3VFR26i6DaoXqKNue0JW+9ruJXZkQ91WZZwOtzp5bXKXvKCPJvE6nj2wu/GPmWgLqISGdfsP0OfSht7tsRt6IgdUTqGSQMIXb7pzwlsXIhPE4eDJ2KUThM255aEGMSRXloCsJKNObtE1UHPxvPAuqy66/My9vBXML9R3wOys9ENH1qRKaqitBqX2YzYmAbAPNlmdKNdL/FQsjxq1TwUIe4LWRiS2AB/GBcuqn4WMVEsTdb/Y5+7RpzcjwYBD0Nv4eLMsq5T7npH/8rO4dTIRIflPfW4BLpHxgaw+FVgEZkjdcRzRFZAgMBAAECggEAc6Q0DTq3VY6uORhidVKzr4f2v5JJdH2+jQwezOTYFMAe5S/p3kszJ0EoF8kc2RZfDBmPC4Kc+l/QiTKvDQVQ9OlWyAGdViaST6CgDaHEstnh8eXBNvlcAj0hyvXMoUtdifvOcPMiIn8LWCtvCk3KP9r69dL7joQL3yIdGLEXjx22fpSXAx5QS5QhK2uXQC/A4bnBbbO43zq8h3Wp/BWt3akhQUL1d5nNzGloD7oOZ6nFVksxUoE/6UDPhKsYJI+Ouj7c7tfFLXDWAlgcPLsvUPXSZCSQ+DCd+h/M/eVO+RJcERw1TsfYkPTvXmhEGCEjCOk59xNKC5lWhE6pwyeUAQKBgQDdGfICcQN2AHn93whyvbj4zddkl8nBwd8pEWHSwOp4H3zpd4aT9YWnVLElWzCywneFxCDaLoh36sCPWUJdnozREqyd+x8kLg0QHJ9HgTzMdAa567lP9JrW4Qc/ROEWD+qczD6zPiuwWdbWy7K2jNm6U5pbKBkvsQN6a9hYe4nSgQKBgQCYIAKXRpzqIYrRHBCQ1kDfkBn1WIXA7TvEFV8EmqnwLsGXGzt1Rn0SN9hSUzP4FkH40o/OodJXjLKh44me9vFqx2XGknVcGAPJfIaOsorYJvzaruWvIAb+Vrs98t1gSu37iE5nd/aYNjaZzsry2Eo1H7NQ4m+J4xEUkhm3+MSi2QKBgQCcWoGqulKxOssJ/ZPS2FmbEK12BGT3sOrn9tPPnv7wLYw+6Xhw31pBp4GSIjeA4kZ1gOmegPOeoZLEjGGDJOD95I/PNEukYTB5qVP10+2zw4USKyEj6p0owX9HfaUS3fSSJ1lbleZ9Ujq8MNZTg61gt0hbmDKfaDVGeEdI4yvmgQKBgHIf4ZG3qdSEIW5LDap68eRGaRMEvCNGVoX+OnBrz32etiE0juCmZwIZ3zGztdMyb3/KB5TPFcwUg5ar6vzU6bxfptzX1y+l3IF16ER5cWxDo4Izn6BH+LcqPgJ1htrMm8kOMzOwbdE3KrMszlhtJw6/n3jYxzC8pn22NZEtEefRAoGBAIkmgO/ECaoUdjtrdNxKpwdaPOH7DuQ89+msfkbEvyplrQrNaAjUN5XKhQjuCBhXPkgoshYoe2EWvOzgszZcWLhYzYUhqGeS1TyfCZmz38eb1wpo+ASlIcn4YhZm83SAdU998lBOlvB/gaTM0eDijHlKGz0tma5Bh7kBuGEcpcUF";

    /**
     * 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
     */
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkugYRSC7txhXVf00zwuAuRsjb6yYp75777Da9m3JqeyX3jxvUoVWH/++Ekup+bOnKw6I6Z1KNlRxDCekm9VkeYlU3lVvqH7hvXgWdSmP9uXpVhzdsLLvHPm0ZfmaAQ9puDnCOXDIx5qGGxqHsRCJkliZx/4sFO1SmaFQFGa+vfImLyBaQT4b/6cPKb8aZvHhCXkevGtKZ1JIPtDPaQgkgw8mhDHnOP5D0zFC7wDqkcZ+6pJvNcbBkfzD0W1+6spffwS9WAjjXIjrCUoQnj0ghwOAKdEtv6HI6BZbbD/cbIKaWenXi3WXo4tKqtIdnGh4O1enMdBTdt3uFmSwhXoehwIDAQAB";

    /**
     * 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    public static String notify_url = "https://water.ashes.vip/AsyncServlet";

    /**
     * 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    public static String return_url = "https://water.ashes.vip/SuccedServlet";

    /**
     * 签名方式
     */
    public static String sign_type = "RSA2";

    /**
     * 字符编码格式
     */
    public static String charset = "utf-8";

    /**
     * 支付宝网关
     */
    public static String gatewayUrl = "openapi.alipaydev.com";

    public static Config getOptions() {
        Config config = new Config();
        config.protocol = "https";
        config.gatewayHost = gatewayUrl;
        config.signType = sign_type;
        config.appId = app_id;
        // 为避免私钥随源码泄露，推荐从文件中读取私钥字符串而不是写入源码中
        config.merchantPrivateKey = merchant_private_key;
        //注：证书文件路径支持设置为文件系统中的路径或CLASS_PATH中的路径，优先从文件系统中加载，加载失败后会继续尝试从CLASS_PATH中加载
//        config.merchantCertPath = "<-- 请填写您的应用公钥证书文件路径，例如：/foo/appCertPublicKey_2019051064521003.crt -->";
//        config.alipayCertPath = "<-- 请填写您的支付宝公钥证书文件路径，例如：/foo/alipayCertPublicKey_RSA2.crt -->";
//        config.alipayRootCertPath = "<-- 请填写您的支付宝根证书文件路径，例如：/foo/alipayRootCert.crt -->";
        //注：如果采用非证书模式，则无需赋值上面的三个证书路径，改为赋值如下的支付宝公钥字符串即可
        config.alipayPublicKey = alipay_public_key;
        //可设置异步通知接收服务地址（可选）
        config.notifyUrl = notify_url;
        //可设置AES密钥，调用AES加解密相关接口时需要（可选）
//        config.encryptKey = "<-- 请填写您的AES密钥，例如：aa4BtZ4tspm2wnXLb1ThQA== -->";
        return config;
    }
}

