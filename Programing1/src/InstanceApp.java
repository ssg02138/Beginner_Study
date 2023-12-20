import java.io.PrintWriter;
public class InstanceApp {
    public static void main(String[] args) throws Exception{

        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.wirte("Hello 1");
        P1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.wirte("Hello 2");
        P2.close();

    }
}
