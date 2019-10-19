package aufgabe2;

public class TestClass {

    public static void main(String[] args) {
        IntegerList list = new IntegerList();

        Read read = new Read(list);
        Write write = new Write(list);

        write.start();
        read.start();

        try {
            read.join();
            write.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }



}
