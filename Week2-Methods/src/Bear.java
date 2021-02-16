import com.javak.Animal;

public class Bear extends Animal {
    private Boolean nederlands;
    private String geslacht;
    private int grootte;
    //    naam en leeftijd niet nodig, want dit staat al in Animal en Bear neemt dat automatisch mee.
    //    String naam;
//    int leeftijd;
    String type;





//Contructor
    public Bear(String naam, int leeftijd, String type) {

        this.naam = naam;
        this.leeftijd = leeftijd;
        this.type = type;
    }
//Tweede constructor

   public Bear(int grootte, String geslacht, Boolean nederlands) {
this.grootte = grootte;
this.geslacht = geslacht;
this.nederlands = nederlands;

   }
//Main methode in de class. (2e methode die los staat van de constructor)
    public static void main(String[] args) {
        Bear bear1 = new Bear("Hans", 12, "Brown Bear" );
        Bear bear2 = new Bear("Piet", 12, "Polar Bear");
        Bear bear3 = new Bear(15, "man", true);
        Animal animal1 = new Animal("Harry", 4, "Hond");
        bear1.showType();
        bear2.showType();

    }

    void showType() {
        System.out.println(type);
        System.out.println(Animal.type);

    }

    }










