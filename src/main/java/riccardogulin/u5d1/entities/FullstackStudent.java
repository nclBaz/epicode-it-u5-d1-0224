package riccardogulin.u5d1.entities;

public class FullstackStudent implements IStudent {
	private String name;

	public FullstackStudent(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FullstackStudent{" +
				"name='" + name + '\'' +
				'}';
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void answersQuestion() {
		System.out.println("Ciao sono uno studente Fullstack...secondo me la risposta è blablabla...");
	}
}
