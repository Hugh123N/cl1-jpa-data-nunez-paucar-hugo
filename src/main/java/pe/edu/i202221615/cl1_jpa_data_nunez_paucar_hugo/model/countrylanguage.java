package pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(CountryLanguageId.class)
@Entity
public class countrylanguage {
    @Id
    private String Language;
    private String isOfficial;
    private Double Percentage;
    @Id
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private country country;

}
