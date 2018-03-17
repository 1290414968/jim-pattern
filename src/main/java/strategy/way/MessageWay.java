package strategy.way;

import strategy.Content;

public class MessageWay implements NoticeWay {
    @Override
    public NoticeResult notice(Content content) {
        System.out.println("站内信发送");
        return new NoticeResult(200,content);
    }
}
