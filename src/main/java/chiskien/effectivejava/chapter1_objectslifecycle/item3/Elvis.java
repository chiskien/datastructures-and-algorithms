package chiskien.effectivejava.chapter1_objectslifecycle.item3;


//Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {

    }

    public static Elvis getInstance() {
        return INSTANCE;
    }
}
