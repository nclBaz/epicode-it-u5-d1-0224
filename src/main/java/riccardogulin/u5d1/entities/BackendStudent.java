package riccardogulin.u5d1.entities;

public class BackendStudent implements IStudent {

	private String name;

	public BackendStudent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BackendStudent{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void answersQuestion() {
		System.out.println("Ciao sono uno studente Backend...secondo me la risposta è blablabla...");
	}
}
