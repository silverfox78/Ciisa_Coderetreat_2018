import org.junit.Assert;
import org.junit.Test;

public class GildedRoeTest {

    @Test
    public void validarInstancia() {
        Item[] items = new Item[3];
        GildedRose gildedrose = new GildedRose(items);
        Assert.assertNotEquals(null, gildedrose);
    }

    @Test
    public void validarItem(){
        Item[] items = new Item[1];
        Item item = new Item("prueba",1,1);
        items[0]=item;
        GildedRose gildedrose = new GildedRose(items);
        Assert.assertEquals(item,gildedrose.items[0]);
    }

    @Test
    public void validarItemActualizacion01(){
        Item[] items = new Item[1];
        Item item = new Item("prueba",1,1);
        items[0]=item;
        GildedRose gildedrose = new GildedRose(items);
        gildedrose.updateQuality();
        Assert.assertEquals(0,gildedrose.items[0].quality);
    }



}
