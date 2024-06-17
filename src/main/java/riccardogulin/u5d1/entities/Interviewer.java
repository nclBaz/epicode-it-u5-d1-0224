package riccardogulin.u5d1.entities;

public class Interviewer {
	private IStudent student;

	public Interviewer(IStudent student) {
		this.student = student;
	}

	public void asksQuestion() {
		System.out.println("Ciao studente " + this.student.getName() + ". Per favore rispondimi alla seguente domanda...blablabla...");
		this.student.answersQuestion();
	}
}
