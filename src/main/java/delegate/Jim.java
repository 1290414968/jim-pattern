package delegate;

/**
 * 、
 *
 * @author jim
 * @create 2018-03-21 19:19
 **/
public class Jim implements ProductManager {
    public void finishTempTask(String taskContent) {
        System.out.printf("Jim 完成任务"+taskContent);
    }
}
