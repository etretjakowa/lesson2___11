package course2.lesson2__11.service;

import course2.lesson2__11.ShoppingCart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private static final Logger log = LoggerFactory.getLogger(ShoppingCartServiceImpl.class);

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void putItems(Collection<Integer> itemsIds) {
        log.info("putItems has been called");
        for (Integer itemsId : itemsIds) {
            shoppingCart.addItem(itemsId);
        }
        log.info("The following items have been added to the shopping cart:{}", itemsIds);

    }
}
