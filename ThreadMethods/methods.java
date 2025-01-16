package ThreadMethods;

public class methods extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("error");
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args) throws InterruptedException {
    methods t1 = new methods();
    t1.start();
    t1.join();
  }
}

// METHODS
// Run
// Sleep
// join
// set priority