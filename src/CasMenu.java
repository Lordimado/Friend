import java.util.*;
public class CasMenu {
	
	 private Ami X=new Ami();
	
		String Stop;
		
		public void Interaction(){
			Scanner key=new Scanner(System.in);
			Scanner clavier =new Scanner(System.in);
			System.out.println("-----*RABAH Imed Vous souhaite le Bienvenue Dans MiniFace*----- \n");
			boolean end=false;
			while(!end){
				System.out.println("------------------Menu Principale------------------");
				System.out.println("|  1 - Ajouter des Personnes a ma Liste d'amis(es) |");
				System.out.println("|  2 - Voir ma Liste d'amis(es)                    |");
				System.out.println("|  3 - Voir ma Liste d'amis(es) Algerien(ne)       |");
				System.out.println("|  4 - Voir ma liste d'amis(es) Etranger(re)       |");
				System.out.println("|  5 - Deconnexion                                 |");
				System.out.println("---------------------------------------------------- \n");
				
				System.out.println("Votre Choix :");
				int rep=key.nextInt();
				Personne Y=new Personne("","");
				switch(rep){
				//Si la réponce est 1 
				case 1 : 
					System.out.println("Entrer le nom de La personne Rechercher :");
					String name=clavier.next();
					String prenom=clavier.next();
					Y.setNomAmi(name);
					Y.setPrenomAmi(prenom);
					X.AddAmi(Y);
					break;
					
				//Si la réponse est 2
				case 2 :
					if(X.getNombreDamis()==0){
						System.out.println("Ma liste est vide !");
					}else{
						for(int j=0;j<=X.getNombreDamis();j++){
				        X.ListeDamis();
					}}
					break;
					
					
				//Si la réponse est 3
				case 3 :
					X.amisAlgeriens();
					break;
					
					
				//Si la réponse est 4	
				case 4 :
					X.AmisEtranger();
					break;
					
					
				//Si la réponse est 5
				case 5 :
					System.out.println("Merci de Votre Visite revenez Vite !");
					end =true;
					break;
					
					
				}
			}
		}
}
