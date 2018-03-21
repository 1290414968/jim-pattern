package delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jim
 * @create 2018-03-21 19:18
 **/
public class RdManager {
    private static Map<TaskType,ProductManager> managerMap = new HashMap<TaskType,ProductManager>();
    static {
        managerMap.put(TaskType.NECC,new Jim());
        managerMap.put(TaskType.PLAT,new Joy());
    }
    void assignTask(TaskType type,String taskContent){
        managerMap.get(type).finishTempTask(taskContent);
    }
}
