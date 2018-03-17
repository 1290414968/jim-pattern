package strategy;

import strategy.way.NoticeEnum;
import strategy.way.NoticeResult;

public class Content {
    private String senderUserName;
    private String detaiContent;
    private String receiver;

    public Content(String senderUserName, String detaiContent, String receiver) {
        this.senderUserName = senderUserName;
        this.detaiContent = detaiContent;
        this.receiver = receiver;
    }

    public NoticeResult notice(NoticeEnum noticeEnum){
        return noticeEnum.getNoticeWay().notice(this);
    }

    @Override
    public String toString() {
        return "Content{" +
                "from='" + senderUserName + '\'' +
                ", detaiContent='" + detaiContent + '\'' +
                ", to='" + receiver + '\'' +
                '}';
    }
}
