import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args) throws IOException {
        try{
            System.out.println("Waiting For Client");
            ServerSocket sc = new ServerSocket(8989);
            Socket soc = sc.accept();
            System.out.println("Connection Established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            System.out.println(str);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String strl = userInput.readLine();
            PrintWriter out= new PrintWriter(soc.getOutputStream(),true);
            out.println(strl);
//
//            if(str.equals("add")){
//                int result = 10;
//                PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
//                out.println(result);
//            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
