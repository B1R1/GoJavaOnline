package module_3_4.instruments;

public class MusicalInstrument {
    private String ownerName;
    private String typeOfInstrument;

    public String sounds()
    {
        return "It sounds good.";
    }

    // getters & setters

    public String getOwnerName() {
        return ownerName;
    }

    public String getTypeOfInstrument() {
        return typeOfInstrument;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setTypeOfInstrument(String typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;
    }

}
