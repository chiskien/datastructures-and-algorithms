package chiskien.javacore.classfile_bytecode;

public class ClassLoading {
    public static void main(String[] args) {
        ClassLoading classLoading = new ClassLoading();
        classLoading.test();
    }

    public void test() {
        Class<?> clazz;
        try {
            clazz = Class.forName("chiskien.datastructures_algorithms.stack.Brackets");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(clazz);

    }
}
