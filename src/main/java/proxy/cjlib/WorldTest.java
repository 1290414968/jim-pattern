package proxy.cjlib;

public class WorldTest {
    public static void main(String[] args) {
        World world = new World();
        try {
            Jim jim = (Jim)world.getInstance(new Jim().getClass());
            jim.findJob();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
