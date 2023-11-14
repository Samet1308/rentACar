package kodlama.io.rentACar.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "colors")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="color_id")
    private int colorId;

    @Column(name = "color_name", unique = true)
    private String colorName;


}
