package ThreadMethods;

public class yieldMethod extends Thread {
  public yieldMethod(String Name) {
    super(Name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName());
      Thread.yield();
    }
  }

  public static void main(String[] args) {
    yieldMethod t1 = new yieldMethod("Thread 1");
    yieldMethod t2 = new yieldMethod("Thread 2");
    t1.start();
    t2.start();
  }
}

// Yield method - Allows other thread also to execute
