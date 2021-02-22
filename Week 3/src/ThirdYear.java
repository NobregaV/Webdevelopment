public class ThirdYear extends Student {

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
    private Double[] cijfers = {9.0, 7.5, 4.9, 9.5 };
    private String[] gedrag = {"Student krijgt nu bijlessen voor Wiskunde", "Student praat teveel", "Student let goed op", "Student misschien bijles volgen"};

    @Override
    public void passYear() {

        System.out.println("third year");

    }

    public ThirdYear(){

    }


}

class ThirdYearHonor implements HonorStudent {

    @Override
    public void removeFromProgram() {

    }

    @Override
    public void checkForNotes() {

    }
}