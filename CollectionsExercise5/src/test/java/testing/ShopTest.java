package testing;

import org.example.service.ShopService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ShopTest {

    @Test
    public void verifyAddProductToListTest() {

        ShopService shopService = new ShopService();

        shopService.addProductToList("Pencil",1);
        shopService.addProductToList("Eraser",2);
        shopService.addProductToList("Notebook",3);
        shopService.addProductToList("Diary",5);

        Assertions.assertEquals(4,shopService.getProductMap().size());
    }

    @Test
    public void showingAllProductsWithPriceTest() {

        ShopService shopService = new ShopService();

        shopService.addProductToList("Pencil",1);
        shopService.addProductToList("Eraser",2);
        shopService.addProductToList("Notebook",3);
        shopService.addProductToList("Diary",5);

        for (Map.Entry<String,Integer> entry : shopService.getProductMap().entrySet()) {
            System.out.println("Product: " + entry.getKey() + "| Price: " + entry.getValue());
            Assertions.assertNotNull(entry.getKey());
        }
    }

    @Test
    public void verifyChangingPriceTest() {

        ShopService shopService = new ShopService();

        shopService.addProductToList("Pencil",1);
        shopService.addProductToList("Eraser",2);
        shopService.addProductToList("Notebook",3);
        shopService.addProductToList("Diary",5);

        shopService.modifyPrice("Diary",8);

        Assertions.assertTrue(shopService.getProductMap().containsValue(8));

    }

    @Test
    public void verifyRemoveProductTest() {

        ShopService shopService = new ShopService();

        shopService.addProductToList("Pencil",1);
        shopService.addProductToList("Eraser",2);
        shopService.addProductToList("Notebook",3);
        shopService.addProductToList("Diary",5);

        shopService.removeProduct("Pencil",1);
        shopService.removeProduct("Eraser",2);

        Assertions.assertEquals(2,shopService.getProductMap().size());
    }
}
