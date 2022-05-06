import java.lang.*;
import java.net.*;
import java.io.*;

class Server
{
    public static void main(String args[]) throws Exception
    {
        System.out.println("Server Apllication is Running");
        String s1,s2;

        ServerSocket ss = new ServerSocket(1100);
        Socket s = ss.accept();

        System.out.println("Connection Succesful");
        BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());
        while((s1 = br.readLine())!= null)
        {
            System.out.println("Client Says: "+s1);
            System.out.println("Enter Message for Client: ");
            s2 = brK.readLine();
            ps.println(s2);
        }
        s.close();
        ss.close();
        br.close();
        brK.close();
        ps.close();
    }
}
