package controllers.BDDpackage;

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
