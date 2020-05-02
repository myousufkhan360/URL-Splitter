
package urlsplitter;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class UrlSplitter {

    public static void splitURL(String path) throws MalformedURLException{
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("URL SPLITTER");
        
        System.out.println();
        
        URL url = new URL(path);
        System.out.println("Protocol : "+url.getProtocol());
        System.out.println("Domain : "+url.getHost());
        System.out.println("Port : "+url.getPort());
        System.out.println("URI : "+url.getPath());
        System.out.println("File : "+url.getFile());
        System.out.println("Reference : "+url.getRef());
        System.out.println("Query String : "+url.getQuery());
        System.out.println("User Information : "+url.getUserInfo());
        System.out.println("Authority : "+url.getAuthority());
        
    }
    public static void main(String[] args) throws MalformedURLException {
        
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter URL :");
      String url = sc.nextLine();
      
      splitURL(url);
      
      System.out.println("--------------------------------------------------");

    }
    
}
