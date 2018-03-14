package prototype.simple;

import java.util.List;

public class SearchParam  implements  Cloneable{
    public String name;
    public List<String> testList;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
