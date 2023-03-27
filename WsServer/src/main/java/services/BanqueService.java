package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(name = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convertEuroToDh")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11.3;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code")int code){
        Compte compte = new Compte(code,code*122,new Date());
        return compte;
    }
    @WebMethod(operationName = "getCompteList")
    public List<Compte> getCompteList(){
        List<Compte> compteList1 = new ArrayList<>();
        compteList1.add(new Compte(1,Math.random()*91222,new Date()));
        compteList1.add(new Compte(2,Math.random()*91222,new Date()));
        compteList1.add(new Compte(3,Math.random()*91222,new Date()));
        return compteList1;
    }
}
