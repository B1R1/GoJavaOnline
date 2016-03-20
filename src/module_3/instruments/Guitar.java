package module_3.instruments;

public class Guitar extends MusicalInstrument {

    private String ownerName;
    private String typeOfInstrument;

    public Guitar(final String ownerName, final String typeOfInstrument) {
        this.ownerName = ownerName;
        this.typeOfInstrument = typeOfInstrument;
    }

    @Override
    public String sounds() {
        return "Guitar sounds good.";
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
