package strategy;

import strategy.way.NoticeEnum;

public class ContentTest {
    public static void main(String[] args) {
        Content content = new Content("张三","你好","李四");
        System.out.println(content.notice(NoticeEnum.EMAIL).toString());
    }
}
