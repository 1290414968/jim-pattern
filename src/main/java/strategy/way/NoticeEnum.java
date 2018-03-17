package strategy.way;

public enum NoticeEnum {
    MESSAGE(new MessageWay()),EMAIL(new EmailWay()),SMS(new SmsWay());
    private NoticeWay noticeWay;
    NoticeEnum(NoticeWay noticeWay) {
        this.noticeWay = noticeWay;
    }

    public NoticeWay getNoticeWay() {
        return noticeWay;
    }
}
