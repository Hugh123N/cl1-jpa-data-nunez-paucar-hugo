package pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class city {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String Name;
    private String District;
    private int Population;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "CountryCode")
    private country country;

}
