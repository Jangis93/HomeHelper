package homehelper.src.items;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "SHOPPING_ITEM")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ShoppingItem {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String brand;

    @Column
    private String type;

    @Column
    private String foodGroup;

}
