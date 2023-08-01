// import java.util.*;
// import java.io.*;

// public class Main {
//     public static void main(String args[]) {

//         try {
//             RandomAccessFile raf = new RandomAccessFile("data.dat", "rw");

//             raf.writeChar('A');
//             raf.writeInt(200);

//             raf.seek(0);

//             System.out.println(raf.readChar());
//             System.out.println(raf.readInt());

//             raf.seek(0);

//             raf.seek(raf.length());
//             raf.writeBoolean(false);
//             raf.seek(raf.length() - 1);

//             System.out.println(raf.readBoolean());

//             raf.close();
//         } catch (IOException e) {
//             System.out.println(e);
//         }

//     }
// }

class Multi1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 : @" + i);
        }
    }
}

class Multi2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 : #" + i);
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Multi1 m1 = new Multi1();
        Multi2 m2 = new Multi2();
        System.out.println(m1.getState());
        m1.start();
        m2.start();
        System.out.println(m2.getState());
        for (int i = 0; i < 10; i++) {
            System.out.println("Outside the thread");
        }

        System.out.println(m1.getState());
        m1.stop();
        System.out.println(m1.getState());
        ;
    }
}