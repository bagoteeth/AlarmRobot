package net.liangyihui.alarmrobot.service.Impl;

import net.liangyihui.alarmrobot.request.RobotRequest;
import net.liangyihui.alarmrobot.service.RobotService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import net.sf.json.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;

/**
 * @Author ruofa
 * @Date 2021/1/20 15:36
 * @Version 1.0
 */
@Service
public class RobotServiceImpl implements RobotService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String DingTalkDisplay(RobotRequest robotRequest) throws Exception {
        Long timestamp = System.currentTimeMillis();
        final String secret = "SECf2451c70775c065e41745827c1de819680d63be64a843f8abd232e0bd9145ff6";
        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8");
        String realurl=new String("https://oapi.dingtalk.com/robot/send?" +
                "access_token=8b308c7ce6790a5eb3f42044d75ae50c08de03a4f7ebfc4ba8a3c2d1548b2bf0" +
                "&timestamp=" +timestamp+
                "&sign="+sign);
        System.out.println(robotRequest.toString());
        return restTemplate.postForObject(realurl,robotRequest,String.class);
    }
}
