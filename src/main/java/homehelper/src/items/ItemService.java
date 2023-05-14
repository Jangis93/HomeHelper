package homehelper.src.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Optional create(ItemRequest request) {
        ShoppingItem newItem = request.map();
        return Optional.of(itemRepository.save(newItem));
    }
}
