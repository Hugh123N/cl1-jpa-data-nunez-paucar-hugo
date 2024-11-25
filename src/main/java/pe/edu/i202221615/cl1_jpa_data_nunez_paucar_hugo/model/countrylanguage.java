package pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class countrylanguage {
    @Id
    private String Language;
    private String isOfficial;
    private Double Percentage;
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private country country;

}
