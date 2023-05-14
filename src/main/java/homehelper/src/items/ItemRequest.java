package homehelper.src.items;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

final class ItemRequest {

    @NotBlank
    @Min(3)
    private String name;

    @NotBlank
    private String company;

    @NotBlank
    private String foodGroup;


    public ShoppingItem map() {
        return ShoppingItem.builder()
                .name(this.name)
                .foodGroup(this.foodGroup)
                .brand(this.company)
                .type(ItemType.USER_DEFINED.name())
                .build();
    }
}
