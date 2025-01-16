package ThreadMethods;

public class interruptMethod extends Thread {
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
      System.out.println("Thread is Running.....");
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    interruptMethod t = new interruptMethod();
    t.start();
    t.interrupt();
  }
}
