
//Thread creation using Runnable Interface

package Thread_Creation;

public class runnable_interface {
  public static void main(String[] args) {
    World w = new World();
    Thread t = new Thread(w);
    t.start();
    for (;;) {
      System.out.println(Thread.currentThread().getName());
    }
  }
}

class World implements Runnable {
  @Override
  public void run() {
    for (;;) {
      System.out.println(Thread.currentThread().getName());
    }
  }
}
