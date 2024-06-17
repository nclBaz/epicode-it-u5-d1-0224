package riccardogulin.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import riccardogulin.u5d1.entities.BackendStudent;
import riccardogulin.u5d1.entities.FrontendStudent;
import riccardogulin.u5d1.entities.Interviewer;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5d1Application.class, args);

	/*	// ************************************ METODO TRADIZIONALE (Senza Beans) ******************************************
		BackendStudent b = new BackendStudent("Aldo");
		FrontendStudent f = new FrontendStudent("Giovanni");
		FullstackStudent fs = new FullstackStudent("Giacomo");

		Interviewer i1 = new Interviewer(b);
		Interviewer i2 = new Interviewer(f);
		Interviewer i3 = new Interviewer(fs);

		i1.asksQuestion();
		i2.asksQuestion();
		i3.asksQuestion();*/


		// ************************************ METODO CON I BEANS ******************************************
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class);

		FrontendStudent f = context.getBean(FrontendStudent.class);
		// getBean mi consente di andare a cercare nello 'scatolone' context un bean di tipo FrontendStudent
		// questo bean è un oggetto che dovrebbe esser già stato da Spring all'avvio dell'applicazione, poichè
		// nella classe di configurazione ho dichiarato un metodo (annotato con @Bean), il quale mi restituisce un
		// nuovo oggetto di tipo FrontendStudent
		// Se l'applicazione si è avviata correttamente, ciò significa che gli oggetti dovrebbero essere stati creati
		// in maniera corretta, quindi posso leggerli dallo scatolone ed utilizzarli

		// Alternativamente, potrei leggere un bean, non solo passando al metodo getBean il nome della classe
		// ma anche il nome del bean
		FrontendStudent f1 = (FrontendStudent) context.getBean("getFrontendStudent");
		System.out.println(f);
		System.out.println(f1);

		Interviewer i = context.getBean(Interviewer.class);
		i.asksQuestion();

		// ************************************ SINGLETON VS PROTOTYPE **************************************
		BackendStudent backendStudent = context.getBean(BackendStudent.class);
		System.out.println(backendStudent);
		BackendStudent backendStudent1 = context.getBean(BackendStudent.class);
		backendStudent1.setName("Claudio");
		System.out.println(backendStudent1);
		System.out.println(backendStudent);

		context.close(); // Alla fine delle operazioni è buona norma chiudere il context
	}

}
