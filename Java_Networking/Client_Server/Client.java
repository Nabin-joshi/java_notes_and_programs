package Client_Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket soc = new Socket("localhost",8989);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String str = userInput.readLine();
            PrintWriter out= new PrintWriter(soc.getOutputStream(),true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String strl = in.readLine();
            System.out.println(strl);
//            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
//            System.out.println(in.readLine());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
