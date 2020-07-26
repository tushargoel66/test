
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUCIFER
 */
public class NewClass1 {
    public static void main(String []args) throws ProtocolException, IOException {
            URL url = new URL("https://metals-api.com/api/latest?access_key=8vj50k12vje2qodx9i1soelae0kcoswse1r0kf84528fw1071u2v34qgoysh");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
            conn.setRequestMethod("POST");
            conn.connect();
            int responsecode = conn.getResponseCode(); 
            String inline = "";
//            Scanner sc = new Scanner(url.openStream());
//            while(sc.hasNext()){
//                    inline+=sc.nextLine();
//            }
//            System.out.println("\nJSON data in string format");
            System.out.println(responsecode);
            //sc.close();
            
    }
}
