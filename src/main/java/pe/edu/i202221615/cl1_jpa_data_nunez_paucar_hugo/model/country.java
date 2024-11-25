package pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class country {

    @Id
    private String Code;
    private String Name;
    private String continent;
    private String Region;
    private Double SurfaceArea;
    private Integer IndepYear;
    private int Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<city> citys;

    @OneToMany(mappedBy = "country", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<countrylanguage> languages;

}
