package net.liangyihui.alarmrobot.request;

import lombok.Data;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.PrimitiveIterator;

/**
 * @Author ruofa
 * @Date 2021/1/20 17:17
 * @Version 1.0
 */
@Data
public class RobotRequest {
    private String msgtype;
    private Text text;
    private At at;


    public static class Text {
        String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class At {
        private List<String> atMobiles;
        boolean isAtAll;

        public List<String> getAtMobiles() {
            return atMobiles;
        }

        public void setAtMobiles(List<String> atMobiles) {
            this.atMobiles = atMobiles;
        }

        public boolean isAtAll() {
            return isAtAll;
        }

        public void setAtAll(boolean atAll) {
            isAtAll = atAll;
        }
    }

}