
import proxy.BanqueServiceService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
        System.out.println(stub.convertEuroToDh(700));
        Compte compte = stub.getCompte(3);
        System.out.println(compte.getCode()+" "+ compte.getMantant());
        List<Compte> compteList = stub.getCompteList();
        compteList.forEach(c->{
            System.out.println(c.getCode()+" "+ c.getMantant());
        });
    }
}
