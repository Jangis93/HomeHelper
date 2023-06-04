package homehelper.src.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ItemRequest {

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
