package aufgabe2;



public class Write extends Thread{
    private IntegerList list;

    public Write(IntegerList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
            System.out.println("writing " + i + " on index " + i);
        }
    }
}
