import model.Personne;
import model.db;
import repository.PersonneRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        PersonneRepository personneRepository = new PersonneRepository();
        //personneRepository.insert(new Personne("Sarr", "Sambou",22));
        //personneRepository.delete(4);
        //personneRepository.allPersonne().forEach((a) -> System.out.println(a.toString()));
        //personneRepository.updatePersonne(new Personne(2,"Gueye","Saliou",24));
        personneRepository.searchPersonne("al").forEach((a) -> System.out.println(a.toString()));

    }
}