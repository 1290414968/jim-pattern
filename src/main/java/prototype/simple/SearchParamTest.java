package prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class SearchParamTest {
    public static void main(String[] args) {
        SearchParam param = new SearchParam();
        param.name = "企业1";
        List<String> lists = new ArrayList<String>();
        lists.add("p1");
        param.testList = lists;

        try {
            SearchParam cloneParam = (SearchParam)param.clone();
            System.out.println(cloneParam.testList);

//            System.out.println(cloneParam==param);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        CarbinParam carbinParam = new CarbinParam();
        carbinParam.unit = "吨";
        carbinParam.name = "c1";
        SearchParam sVariableParam = new SearchParam();
        sVariableParam.name="s1";
        carbinParam.param = sVariableParam;
        System.out.println(carbinParam.param);
        try {
            CarbinParam carbinCloneParam = (CarbinParam)carbinParam.clone();
            System.out.println(carbinCloneParam.param);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
