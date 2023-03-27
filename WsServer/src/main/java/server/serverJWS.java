package server;

import services.BanqueService;

import javax.xml.ws.Endpoint;

public class serverJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8087/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service deployed in "+url);
    }
}
