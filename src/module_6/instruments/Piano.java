package module_6.instruments;

public class Piano extends Instrument {

    private String ownerName;

    @Override
    public String getType() {
        return "Piano";
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