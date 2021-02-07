package Sprint2.services;

import Sprint2.entities.Commande;

import java.util.List;
import java.util.Map;

public interface ICommandeService {

    Map<String, Boolean> AjouterCommande(Commande c);

    List<Commande> listerCommandes();

    Map<String, Boolean> updateCommande(Commande c);

    Map<String, Boolean> DeleteCommande(int id);

    public Commande getByCommande(int id);



}
