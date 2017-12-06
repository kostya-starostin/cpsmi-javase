package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client implements Runnable{
    public Client()  {
        String inp;
        try {
            Socket clientSocket = new Socket("localhost", 10800);
            OutputStream outstream = clientSocket.getOutputStream();

            System.out.println("enter some bytes:");
            System.out.println("//type 0 to terminate");

            InputStream inpstream = clientSocket.getInputStream();

            Scanner sc=new Scanner(System.in);
            while (true) {
                inp = sc.nextLine();
                if (inp.compareTo("0") == 0) {
                    break;
                } else {
                    byte x = (byte) Integer.parseUnsignedInt(inp);
                    outstream.write(x);
                    outstream.flush();
                    System.out.println("summ:"+inpstream.read());

                }
                System.out.println("Final summ:"+inpstream.read());
            }

        } catch (IOException e){
            System.out.println(e);
        }

    }

    @Override
    public void run() {
        new Client();
    }
}