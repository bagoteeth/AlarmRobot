package net.liangyihui.alarmrobot.controller;

import net.liangyihui.alarmrobot.request.RobotRequest;
import net.liangyihui.alarmrobot.service.RobotService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ruofa
 * @Date 2021/1/20 15:25
 * @Version 1.0
 */
@RestController
@RequestMapping("robot")
public class RobotController {

    private final RobotService robotService;

    public RobotController(RobotService robotService) {
        this.robotService = robotService;
    }

    @RequestMapping("alarm")
    public String DingTalkDisplay(@RequestBody RobotRequest robotRequest) throws Exception {

        return robotService.DingTalkDisplay(robotRequest);
    }
}
