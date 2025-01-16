package ThreadMethods;

public class setPriority extends Thread {
  // Naming of Thread
  public setPriority(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
    }
  }

  public static void main(String[] args) {
    setPriority t1 = new setPriority("Low");
    setPriority t2 = new setPriority("High");
    setPriority t3 = new setPriority("Norm");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(Thread.NORM_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
  }
}
