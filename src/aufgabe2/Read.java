package aufgabe2;


public class Read extends Thread{
    private IntegerList list;

    public Read(IntegerList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("reading index " + i + ": " + list.get(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
