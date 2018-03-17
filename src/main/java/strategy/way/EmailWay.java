package strategy.way;

import strategy.Content;

public class EmailWay implements NoticeWay {

    @Override
    public NoticeResult notice(Content content) {
        System.out.println("邮件发送");
        return new NoticeResult(200,content);
    }
}
