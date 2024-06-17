package riccardogulin.u5d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class FrontendStudent implements IStudent {
/*	@Setter(AccessLevel.NONE) // Dice a Lombok di non creare il setter per questo campo
	private long id;*/

	private String name;

	@Override
	public void answersQuestion() {
		System.out.println("Ciao sono uno studente Frontend...secondo me la risposta è blablabla...");
	}

/*	@Override
	public String toString() {
		return "FrontendStudent{" +
				"name='" + name + '\'' +
				'}';
	}*/ // <-- Alternativamente posso usare @ToString di Lombok
}
