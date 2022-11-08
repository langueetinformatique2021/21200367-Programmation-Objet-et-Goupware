package devoirs;
/**
 * 
 * @author zhang
 *
 */

public class Etudiant {
	public static void main(String[]args) {
		private int Number;
		private String Nom;
		private String Prenom;
		private String Sex;
		private int Age;
		
		public Etudiant(int Number, String Nom, String Prenom, String Sex, int Age) {
			this.Number = Number;
			this.Nom = Nom;
			this.Prenom = Prenom;
			this.Sex = Sex;
			this.Age = Age;
		}
		public int getNumber() {
			return Number;
		}
		public void setNumber(int Number) {
			this.Number = Number;
		}
		public String getNom() {
			return Nom;
		}
		public void setNom(String Nom) {
			this.Nom = Nom;
		}
		public String getPrenom() {
			return Prenom;
		}
		public void setPrenom(String Prenom) {
			this.Prenom = Prenom;
		}
		public String getSex() {
			return Sex;
		}
		public void setSex(String Sex) {
			this.Sex = Sex;
		}
		public int getAge() {
			return Age;
		}
		public void setAge() {
			this.Age = Age;
		}
		public void print() {
			System.out.printf("numero d'étudiant: %d\nNom: %s\nPrénom: %s\nSexe: %s\tAge: %d", number, Nom, Prenom, Sex, Age);
		}
	}

}
