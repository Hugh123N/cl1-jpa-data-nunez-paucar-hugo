package pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.model.city;
import pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.model.country;
import pe.edu.i202221615.cl1_jpa_data_nunez_paucar_hugo.repository.CountryRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataNunezPaucarHugoApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataNunezPaucarHugoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Buscar el país con código "ARG"
		Optional<country> argentina = countryRepository.findById("ARG");
		argentina.ifPresentOrElse(
				country -> {
					System.out.println("Lenguajes de Argentina:");
					System.out.println("*********************************************");
					country.getLanguages().forEach(language -> System.out.println(language.getLanguage()));
					System.out.println("*********************************************");
				},
				() -> {
					// Si no se encuentra "ARG", buscar "PER"
					Optional<country> perCountry = countryRepository.findById("PER");
					perCountry.ifPresent(per -> {
						System.out.println("Lenguajes de Perú:");
						System.out.println("*********************************************");
						per.getLanguages().forEach(lang -> System.out.println(lang.getLanguage()));
						System.out.println("*********************************************");
					});
				}
		);

		// Lista de IDs de los países a eliminar
		/*List<String> countryIdsToDelete = Arrays.asList("COL", "ARG");

		countryRepository.deleteAllById(countryIdsToDelete);
		System.out.println("Países eliminados con sus ciudades y lenguajes asociados");*/

	}
}
