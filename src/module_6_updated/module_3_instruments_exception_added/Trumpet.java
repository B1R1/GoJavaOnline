package module_6_updated.module_3_instruments_exception_added;

public class Trumpet extends Instrument {


    private String ownerName;
    private String typeOfInstrument;

    @Override
    public String sounds() {
        return "Trumpet sounds good.";
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

    @Override
    public String toString() {
        return "Trumpet";
    }
}