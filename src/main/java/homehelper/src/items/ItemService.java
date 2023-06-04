package homehelper.src.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Optional create(ItemRequest request) {
        ShoppingItem newItem = request.map();
        return Optional.of(itemRepository.save(newItem));
    }

    public Optional<ShoppingItem> getItem(Integer id) {
        return itemRepository.findById(id);
    }

    public List<ShoppingItem> getAll() {
        return (List<ShoppingItem>) itemRepository.findAll();
    }
}
