package delegate;

/**
 * @author jim
 * @create 2018-03-21 19:20
 **/
public class Joy implements  ProductManager {
    public void finishTempTask(String taskContent) {
        System.out.printf("Joy 完成任务"+taskContent);
    }
}
