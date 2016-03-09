package module_3.instruments;

public class Guitar extends MusicalInstrument {

    private String ownerName;
    private String typeOfInstrument;

    @Override
    public String sounds() {
        return "Guitar sounds good.";
    }

    // getters & setters
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