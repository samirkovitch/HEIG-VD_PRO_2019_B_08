package controllers.BDDpackage;


// Pour afficher une Enum : java.util.Arrays.asList(Recurrence.values())
public enum Recurrence {
    Annuel(1),
    Mensuel(2),
    Hebdomadaire(3),
    Quotidien(4),
    Trimestriel(5),
    Semestriel(6);

    private final int id;


    Recurrence(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
