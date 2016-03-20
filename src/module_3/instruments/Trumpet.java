package module_3.instruments;

public class Trumpet extends MusicalInstrument {

    private String ownerName;
    private String typeOfInstrument;

    public Trumpet(final String ownerName, final String typeOfInstrument) {
        this.ownerName = ownerName;
        this.typeOfInstrument = typeOfInstrument;
    }

    @Override
    public String sounds() {
        return "Trumpet sounds good.";
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getTypeOfInstrument() {
        return typeOfInstrument;
    }

    public void setTypeOfInstrument(String typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;
    }
}
