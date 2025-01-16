package ThreadMethods;

public class setDaemon extends Thread {
  @Override
  public void run() {
    while (true) {
      System.out.println("Hello World");
    }
  }

  public static void main(String[] args) {
    setDaemon t = new setDaemon();
    t.setDaemon(true);
    t.start();
    System.out.println("Main Done");
  }
}
// setDaemon - Background threads which run until and unless all the threads
// terminates.