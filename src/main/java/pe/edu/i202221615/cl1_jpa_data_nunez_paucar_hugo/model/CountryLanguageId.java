package pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.model;

import java.util.Objects;

public class CountryLanguageId {

    private String Language;
    private String country;

    public CountryLanguageId() {}

    public CountryLanguageId(String Language, String country) {
        this.Language = Language;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return Objects.equals(Language, that.Language) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Language, country);
    }
}
