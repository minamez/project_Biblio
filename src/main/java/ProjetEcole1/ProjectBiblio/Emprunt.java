package ProjetEcole1.ProjectBiblio;

public class Emprunt {
	private int idEmprunt;
	private int refLivre;
	private String nomUser;
	private int dateEmprunt;
	private int dateRendu;
	private User user;

	public int getIdEmprunt() {
		return idEmprunt;
	}

	public void setIdEmprunt(int idEmprunt) {
		this.idEmprunt = idEmprunt;
	}

	public int getRefLivre() {
		return refLivre;
	}

	public void setRefLivre(int refLivre) {
		this.refLivre = refLivre;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public int getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(int dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public int getDateRendu() {
		return dateRendu;
	}

	public void setDateRendu(int dateRendu) {
		this.dateRendu = dateRendu;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
