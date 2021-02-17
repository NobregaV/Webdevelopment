import com.javak.Animal;

public class Bear extends Animal {
//    private Boolean nederlands;
//    private String geslacht;
//    private int grootte;
    //    naam en leeftijd niet nodig, want dit staat al in Animal en Bear neemt dat automatisch mee.
    //    String naam;
//    int leeftijd;
    String type;


//Contructor
    public Bear(String naam, int leeftijd, String type) {
        super(naam, leeftijd);

        this.type = type;
    }
//Tweede constructor
//public Bear(String grootte, int geslacht, Boolean nederlands) {
//    super(grootte, geslacht, true);

//    this.grootte = grootte;
//this.geslacht = geslacht;
//this.nederlands = nederlands;


//Main methode in de class. (2e methode die los staat van de constructor)
    public static void main(String[] args) {
//
        Bear bear1 = new Bear("Hans", 12, "Brown Bear");
        Bear bear2 = new Bear("Piet", 12, "Polar Bear");
        Bear bears [] = {bear1, bear2};

//      Bear bear3 = new Bear("man", 15, true);
        Animal animal1 = new Animal("Harry", 4);
        Animal animals[] = {bear1, bear2, animal1};
        System.out.println();


//
//        bear1.showType();
//        bear2.showType();
//        animal1.showType();

//        System.out.println(Animal.type);

        for (int i =0; i< animals.length; i++) {
//            animals[i].showType();
//            System.out.println(animals[i].showName());
            System.out.println((animals[i]).naam);
            System.out.println((animals[i]).leeftijd);
            System.out.println(animals[i].showType());
            animals[i].Feed();
            animals[i].VisitVet();

        }

//        for (Animal i: animals
//             ) {
//            System.out.println(i);
//        }

    }


    public String showType() {
        return type;

//        System.out.println(type);
//        System.out.println(Animal.type);



    }


    }










