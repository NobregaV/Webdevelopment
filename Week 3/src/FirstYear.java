
public class FirstYear extends Student  {

    private Double[] cijfers = {8.0, 7.5, 7.6, 5.8 };
    private String[] gedrag = {"Student doet hard zijn best", "Student heeft nu bijles", "Student op schema", "Student praat teveel"};
    private String[] lessen = {"Engels", "Nederlands", "Wiskunde", "Frans"};

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


//    private List<String> gedrag = Arrays.asList(new String[]{"Student doet hard zijn best", "Student heeft nu bijles", "Student op schema", "Student praat teveel"});

    @Override
    public void passYear() {
        System.out.println("first year");

    }

    public FirstYear () {


    }



}

class FirstYearHonor implements HonorStudent {

    @Override
    public void removeFromProgram() {

    }

    @Override
    public void checkForNotes() {

    }
}
