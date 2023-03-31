package part1.multithreading;

public class Multithread {

    int start;
    int end;
    int result;

    public Multithread(int start, int end) {
        this.start = start;
        this.end = end;
        this.result =0;
    }

    public void add(){
        for(int start=this.start;start<=this.end;start++){
            this.result+=start;
        }
    }


    public static void main(String[] args) throws InterruptedException {

        Multithread t1 = new Multithread(1,10);
        Multithread t2 = new Multithread(11,20);
        Runnable newr= new Runnable() {
            @Override
            public void run() {
                Multithread t3 = new Multithread(0,5);
                t3.add();
            }
        };
        Thread NEW = new Thread(newr);
        NEW.start();

        Thread s1 = new Thread(() -> {
           t1.add();
        });

        Thread s2 = new Thread(() -> {
            t2.add();
        });

        s1.start();

        s2.start();

        s1.join();
        s2.join();

        System.out.println(t1.result);
        System.out.println(t2.result);
        System.out.println(newr);

    }
}
