package strategy.way;

import strategy.Content;

public class SmsWay implements NoticeWay {

    @Override
    public NoticeResult notice(Content content) {
        System.out.println("短信发送");
        return new NoticeResult(200,content);
    }
}