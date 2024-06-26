package org.tx.shortlink.shop;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConfig;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;

public class AlipayTradePagePay {

    public static void main(String[] args) throws AlipayApiException {
        String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDWi5qA04HZPlCXK03/pUdo4OIh40vc5AuVkcNnlNICG2XBOij7VFFT8AyYkW5bEWWXuXnry2L6rWdzunnEmOzn2whknXCxS2H8omIAhFpdBuzuS5LNPszhp6sdOv+86KNvD9XQM+Jo034ZiyqGqUxEkRoj85QNToK90ZIROUGMtDAT+E5N6VwhUtXicdaFErO5qyswJNvm6Jvb/WjWh2Vl+C3kje9VKpkX0TXtkxZPZH5C3BjvLEGxJd5e8ThTzZj9b4ILBNcYgWbzj2kWNXMys29Av6L33pRyfYPn3i9U65bAWrPVw+Hupq3JsX9TCt0gKAB8kCC3y6siQOOrUeZ3AgMBAAECggEBALdwZ+tMbNK14CxQv4Ec7UC0P0UgVgYJCgqZtgzDhwh8KnWbZ9z0zBDLx8lPV58P8eBXmvJMVVXmm/SsdV7uLmlTswpsPyWoQaDDqq2sfKLbwAtDnMJWttEeDkWQ44a/FrZoQLWjFyvv4PqwLe0zpd1ef45LvsPd5BWusYh+fxhwitaVJibHlOKIhj+bgwm7ETgRh3nPQmaJIzJ5vGLF+b5ehf0GurYPJz9y+W6sOb5A1iUKwxGQsxMncwiOOlYtbyMBYOcvIEDiOGphPIt9oQSiMgjaggG+dMUV6ShaJ/KA/qxqaqjQYEnge3qkKenJvke4vsJDhk/imvrY34BrSKkCgYEA+Fz4RJcwijyp5r/lbm7GyrjeXuSPy64kQeH6WgvmHgwO/Up79Z2adQynqOT5OQtCkDyRF1ZoqjqjpHez/3baaMjcqq6GtmhSJFaXjyfs2+UfWUlhEwGqh1RftPu3H/fzYvawdaRn5sa4SvECV3RYg/2cDdj7LanmgD7XWHb9LuMCgYEA3SRuZcoC/gG/Aq2/2bApOKH6+9tronQdaGttVSLWnne/PVT59azBIf1T4RjSLwzxB9CSUjeDjRDF99d4yHlt4DsA+MFHpBEPHUaqMxjNbwVOpkq3SODOfCUr+W1h416OGwKwhRK7Ppduzp0qnUTNIPws0/KArREBuxo3scjhCl0CgYAdnrjdNUrMsb9xjaFHMl7y/mlG1+tuVy5rzQ+WfaTMIJQJEUEHYexx2TiFpAk1DGq72P1U0zFYW/X4P25wITSbGpl2oanfR0HEo68fm5tb/k9mzqGNKr2zthRT+VE1ttSIEPOqlBjwJPMFvQiSdYW4+B4MaLxMDd83nEcCfe5kEQKBgFrTjLgn2UTEKNSL0kExdiy5cqEgxLtrX2y0uqn97hIV8qjZDvTVaFlyd5H7JNCISzK/emlkPZahrf2WNRh5ryQqd8Kzd54uF3wZuuvTowSXNG9ePpsjIguhJMeEInFFM65qU1/Eir0xayRXLtp7GJkUmcDPWAQ8+O4E3Z0aeTtNAoGAFiVq0jknbUamCCHz7QVwZhLSAOerzrFqKLTj0rlOoEnDVIkk4Dm+VEHQhQaAStpOHmRRtqPtDeEovn2zx+7szIAksTdCE9E0WQmxrTiBYd6CN+uzj6DYm15gzr6eWO8tFIR51bAVSY1MP8DbPu+jpDaIaP5InqJ1Xzm0uIr0h+w=";
        String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk+AN0Nd5pGfVpUu6W6xe918Sc5zkdeUM0XH+MvOqHNKxiegdVIbnzOZJ4VpVkwvUxKzi8snLkCZDSlJ25nn0NXRFPCHZQPMJL3XcMLaf245S2hCR8aVjpFtiT6pieFfyJ7Rw82Xk7NhCty3KpdAKhWAa+YV0IVlk7c5Z2rO5w7+W0PB0i938MA1KSpWhGmek1ppJTNO12GhzvbDCv/gCh0U+Ou0hTaW6+2yEG2r3Agq+RUdp/F3utlsfEIw5ycwu4NN/ssjhLOj4pnZy0KtjHijsjJQRbmzG5UGJY80+4ipHLC0VgM40LG+8cNpsBNu5wo6xsJiggcYBIV0QmO501wIDAQAB";
        AlipayConfig alipayConfig = new AlipayConfig();
        alipayConfig.setServerUrl("https://openapi-sandbox.dl.alipaydev.com/gateway.do");
        alipayConfig.setAppId("9021000137691976");
        alipayConfig.setPrivateKey(privateKey);
        alipayConfig.setFormat("json");
        alipayConfig.setAlipayPublicKey(alipayPublicKey);
        alipayConfig.setCharset("UTF-8");
        alipayConfig.setSignType("RSA2");
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig);
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        AlipayTradePagePayModel model = new AlipayTradePagePayModel();
        model.setOutTradeNo("20150320010101001");
        model.setTotalAmount("88.88");
        model.setSubject("Iphone6 16G");
        model.setProductCode("FAST_INSTANT_TRADE_PAY");
        model.setTimeExpire("2024-06-07 20:19:00");
        request.setBizModel(model);
        AlipayTradePagePayResponse response = alipayClient.pageExecute(request, "POST");
        // 如果需要返回GET请求，请使用
        // AlipayTradePagePayResponse response = alipayClient.pageExecute(request, "GET");
        String pageRedirectionData = response.getBody();
        System.out.println(pageRedirectionData);
        if (response.isSuccess()) {
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
            // sdk版本是"4.38.0.ALL"及以上,可以参考下面的示例获取诊断链接
            // String diagnosisUrl = DiagnosisUtils.getDiagnosisUrl(response);
            // System.out.println(diagnosisUrl);
        }
    }
}