
public class Client {
	
	private String nom;
	
	public Client(String nom) {
		this.nom = nom;
	}
	
	public boolean seConnecter (Serveur s) {
		if((s != null) && (s.connecter(this))) {
			return true;
		}
		else return false;
	}
	
	public void envoyer(String message) {
		s.diffuser(message);
	}
	
	public void recevoir(String message) {}
}
