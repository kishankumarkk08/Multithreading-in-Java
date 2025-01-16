//Thread creation by extending thread class

package Thread_Creation;

public class thread_class {
  public static void main(String[] args) {
    World w = new World();
    w.start();
    for (;;) {
      System.out.println(Thread.currentThread().getName());
    }
  }
}

class World extends Thread {
  @Override
  public void run() {
    for (;;) {
      System.out.println(Thread.currentThread().getName());

    }
  }
}
