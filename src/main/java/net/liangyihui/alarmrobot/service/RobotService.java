package net.liangyihui.alarmrobot.service;

import net.liangyihui.alarmrobot.request.RobotRequest;

import java.security.NoSuchAlgorithmException;

/**
 * @Author ruofa
 * @Date 2021/1/20 15:30
 * @Version 1.0
 */
public interface RobotService {
    /**
     * 显示到钉钉群
     * @param robotRequest 要显示的请求
     */
    String DingTalkDisplay(RobotRequest robotRequest) throws Exception;
}
