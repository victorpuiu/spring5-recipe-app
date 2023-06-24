package victorpuiu.sping5recipeapp.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;


}
