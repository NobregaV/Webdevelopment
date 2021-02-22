public class FourthYear extends Student {

    public String[] getLessen() {
        return lessen;
    }

    public void setLessen(String[] lessen) {
        this.lessen = lessen;
    }

    public Double[] getCijfers() {
        return cijfers;
    }

    public void setCijfers(Double[] cijfers) {
        this.cijfers = cijfers;
    }

    public String[] getGedrag() {
        return gedrag;
    }

    public void setGedrag(String[] gedrag) {
        this.gedrag = gedrag;
    }

    private String[] lessen = {"Engels", "Nederlands", "Wiskunde", "Frans"};
    private Double[] cijfers = {6.0, 7.0, 8.9, 9.0 };
    private String[] gedrag = {"Geen op en aanmerkingen", "Student is altijd op tijd", "Student helpt graag anderen", "Huiswerk altijd netjes op tijd af"};

    @Override
    public void passYear() {
        System.out.println("fourth year");
    }

    public FourthYear(){

    }


}

class FourthYearHonor implements HonorStudent {

    @Override
    public void removeFromProgram() {

    }

    @Override
    public void checkForNotes() {

    }
}


