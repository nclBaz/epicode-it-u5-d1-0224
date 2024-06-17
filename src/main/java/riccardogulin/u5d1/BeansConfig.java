package riccardogulin.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import riccardogulin.u5d1.entities.*;

@Configuration // Annotazione OBBLIGATORIA, altrimenti questa classe non verrà presa in considerazione
public class BeansConfig {
	// Principalmente questa classe è un elenco di metodi, ognuno dei quali conterrà le 'istruzioni' per creare un Bean

	@Bean // Annotazione OBBLIGATORIA, se voglio che questo metodo mi restituisca un oggetto gestito da Spring (BEAN)
	// Questi oggetti faranno parte dello 'scatolone' (Application Context) fin dall'avvio dell'applicazione.
	// In pratica succede che Spring all'avvio dell'app controlla tutte le classi di configurazione e cerca di creare degli oggetti
	// inserendoli nello 'scatolone'. Quindi quando eseguirò la mia applicazione mi ritroverò una serie di oggetti già messi a disposizione
	// per il loro utilizzo.
	// Spring inoltre, come vedremo in particolare con il modulo Web, sarà in grado di creare e gestire oggetti anche a runtime
	public int getAge() {
		return 30;
	}

	@Bean
	public String getName() {
		return "Ajeje";
	}

	@Bean
	public FrontendStudent getFrontendStudent() {
		return new FrontendStudent("Aldo");
	}

	@Bean
	@Scope("prototype") // Annotazione opzionale per quando non voglio che lo scope sia SINGLETON
	// SINGLETON = c'è un'UNICA copia dell'oggetto condivisa in tutta l'applicazione
	// PROTOTYPE = ogni volta che uso .getBean mi verrà tornato un nuovo oggetto slegato dal precedente
	@Primary // Annotazione che mi consente di risolvere le ambiguità, ci consente di stabilire
	// che questo sarà il bean da scegliere in caso di ambiguità. Una sorta di default.
	public BackendStudent getBackendStudent(String name) {
		return new BackendStudent(name);
	}

	@Bean
	public FullstackStudent getFullstackStudent() {
		return new FullstackStudent("Giacomo");
	}

	@Bean(name = "interviewer") // Posso anche assegnare un nome ai miei Bean, se non lo faccio verrà usato il nome del metodo
	public Interviewer getInterviewer(IStudent student) {
		return new Interviewer(student);
	}
}
