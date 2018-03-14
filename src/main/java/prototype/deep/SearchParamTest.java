package prototype.deep;

public class SearchParamTest {
    public static void main(String[] args) {
        SearchParam searchParam = new SearchParam();
        Ent ent = new Ent();
        ent.name = "测试企业1";
        searchParam.ent = ent;

        try {
            SearchParam cloneParam = (SearchParam)searchParam.clone();
            System.out.println(searchParam.p);
            System.out.println(cloneParam.p);
            System.out.println(searchParam.ent == cloneParam.ent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
