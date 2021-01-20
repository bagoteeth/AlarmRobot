package net.liangyihui.alarmrobot.service;

import java.security.NoSuchAlgorithmException;

/**
 * @Author ruofa
 * @Date 2021/1/20 15:30
 * @Version 1.0
 */
public interface RobotService {
    /**
     * 显示到钉钉群
     * @param str 显示的字符串
     */
    void DingTalkDisplay(String str) throws Exception;
}
