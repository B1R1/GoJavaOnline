package module_3.instruments;

import java.util.List;

public class MusicStore {
    private List<MusicalInstrument> instruments;
    private int priceOfItems;

    public MusicStore(final List<MusicalInstrument> instruments, final int priceOfItems) {
        this.instruments = instruments;
        this.priceOfItems = priceOfItems;
    }

    public List<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public int getPriceOfItems() {
        return priceOfItems;
    }

    public void setInstruments(List<MusicalInstrument> instruments) {
        this.instruments = instruments;
    }

    public void setPriceOfItems(int priceOfItems) {
        this.priceOfItems = priceOfItems;
    }
}
