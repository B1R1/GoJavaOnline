package module_6.instruments;

import java.util.List;

public class MusicStore {

    public static final int MINIMUM_PRICE = 1500;
    public static final int MAXIMIM_PRICE = 150_000;

    private List<MusicalInstrument> list;
    private int priceOfItem;


    public void showPriceOfItem (int priceOfItem)
    {
        try {
            if (priceOfItem > MAXIMIM_PRICE & priceOfItem < MINIMUM_PRICE)
            {
                throw new WrongPriceOfItemsException();
            }
        }
        catch (WrongPriceOfItemsException e) {
            System.out.println("Check price - it's lower or higher than our prices.");
        }
    }


    // getters & setters

    public List<MusicalInstrument> getList() {
        return list;
    }

    public int getPriceOfItems() {
        return priceOfItem;
    }

    public void setList(List<MusicalInstrument> list) {
        this.list = list;
    }

    public void setPriceOfItems(int priceOfItems) {
        this.priceOfItem = priceOfItems;
    }
}
