package prototype.deep;

import java.io.*;

public class SearchParam extends Param implements  Cloneable,Serializable {
    public Ent ent;
    public SearchParam() {
        this.p = 11;
        this.ent = new Ent();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }
    private Object deepClone(){

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos  = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SearchParam copy = (SearchParam)ois.readObject();
            copy.p = 100;
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
