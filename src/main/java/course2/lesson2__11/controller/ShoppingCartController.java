package course2.lesson2__11.controller;

import course2.lesson2__11.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService){
        this.shoppingCartService = shoppingCartService;}
    @GetMapping("add")
    public void add (@RequestParam List<Integer> itemsIds){
        shoppingCartService.putItems(itemsIds);
    }
    @GetMapping("get")
    public Set<Integer> get(){
        return shoppingCartService.getItemsIds();}
}
