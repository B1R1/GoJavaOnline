package module_3.instruments;

import java.util.List;

public class MusicStore {
    private List<MusicalInstrument> list;
    private int priceOfItems;

    // getters & setters

    public List<MusicalInstrument> getList() {
        return list;
    }

    public int getPriceOfItems() {
        return priceOfItems;
    }

    public void setList(List<MusicalInstrument> list) {
        this.list = list;
    }

    public void setPriceOfItems(int priceOfItems) {
        this.priceOfItems = priceOfItems;
    }
}
