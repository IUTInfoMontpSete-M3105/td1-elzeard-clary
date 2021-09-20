
import java.util.*;

/**
 * 
 */
public class Cours {
    private String nomCours;
    private Chargédecours chargéDeCours;
    private Enseignant enseignant;
    /**
     * Default constructor
     **/
    public Cours(String nomCours, Chargédecours chargédeCours, Enseignant enseignant) {
    	this.nomCours = nomCours;
    	this.chargédeCours = chargédeCours;
    	this.enseignant = enseignant;
    }
}
