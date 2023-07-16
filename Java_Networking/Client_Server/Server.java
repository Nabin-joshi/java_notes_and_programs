package Client_Server;

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


//            client work
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            System.out.println(str);


            String  reverse="";
            char ch;
            for(int i=0;i<str.length();i++){
                ch= str.charAt(i);
                reverse=ch+reverse;
            }
            System.out.println(reverse);
            String outString = "";
            if(str.equals(reverse)){
                outString = "Plaindrome";
                System.out.println("Plaindrome");
            }


            PrintWriter out= new PrintWriter(soc.getOutputStream(),true);
            out.println(outString);
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
