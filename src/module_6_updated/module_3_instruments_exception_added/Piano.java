package module_6_updated.module_3_instruments_exception_added;

public class Piano extends Instrument {

    private String ownerName;

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String sounds() {
        return "Piano sounds good.";
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Piano";
    }
}