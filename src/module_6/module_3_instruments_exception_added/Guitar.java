package module_6.module_3_instruments_exception_added;

public class Guitar extends Instrument {

    private String ownerName;

    @Override
    public String getType() {
        return "Guitar";
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

    @Override
    public String toString() {
        return "Guitar";
    }
}