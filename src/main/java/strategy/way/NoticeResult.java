package strategy.way;

import strategy.Content;

public class NoticeResult {
    private int code;
    private Content content;

    public NoticeResult(int code, Content content) {
        this.code = code;
        this.content = content;
    }

    @Override
    public String toString() {
        return "NoticeResult{" +
                "code=" + code +
                ", content=" + content +
                '}';
    }
}
