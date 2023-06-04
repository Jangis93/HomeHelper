package homehelper.src.items;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/item")
@Slf4j
public class ItemController {

    @Autowired
    private ItemService itemService;


    @PostMapping("/")
    public ResponseEntity create(@RequestBody ItemRequest request){

        return ResponseEntity.of(itemService.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShoppingItem> get(@RequestParam("id") int id) {
        return ResponseEntity.of(itemService.getItem(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ShoppingItem>> getAll() {
        return ResponseEntity.of(java.util.Optional.ofNullable(itemService.getAll()));
    }

}
