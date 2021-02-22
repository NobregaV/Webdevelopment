public class SecondYear extends Student {

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
    private Double[] cijfers = {5.0, 6.5, 4.6, 5.5 };
    private String[] gedrag = {"Student was 5 keer te laat", "Student 2 keer te laat", "Student loopt achter op schema", "Student al 3 keer geen huiswerk af"};

    @Override
    public void passYear() {
        System.out.println("second year");


    }

    public SecondYear() {

    }


}

class SecondYearHonor implements HonorStudent {

    @Override
    public void removeFromProgram() {

    }

    @Override
    public void checkForNotes() {

    }
}
