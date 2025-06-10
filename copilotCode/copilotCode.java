public class copilotCode {
  public static void main(String[] args) {
    int currenttime = 00;
    while (currenttime < 24) {
      if (currenttime < 12) {
        System.out.println("Good morning");
      } else if (currenttime < 18) {
        System.out.println("Good afternoon");
      } else {
        System.out.println("Good evening");
      }
      currenttime++;
    }
  }
}
