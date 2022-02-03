package course2.lesson2__11;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Component
@SessionScope
public class ShoppingCart {
    private final Set<Integer> itemsIds;

    public ShoppingCart() {this.itemsIds = new LinkedHashSet<>();}
    public void addItem(int itemId){
        itemsIds.add(itemId);}
    public Set<Integer> getItems(){
        return Set.copyOf(itemsIds);}

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemsIds=" + itemsIds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(itemsIds, that.itemsIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemsIds);
    }
}
