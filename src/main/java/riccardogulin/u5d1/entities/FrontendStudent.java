package riccardogulin.u5d1.entities;

public class FrontendStudent implements IStudent {
	private String name;

	public FrontendStudent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FrontendStudent{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void answersQuestion() {
		System.out.println("Ciao sono uno studente Frontend...secondo me la risposta è blablabla...");
	}
}
