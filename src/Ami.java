
public class Ami {
	private Personne[] Friend;
	private int NombreDamis=0;
	
	public Ami(){}
	
	public Ami(Ami Friend){
		this.Friend = Friend.Friend;
		this.NombreDamis = Friend.NombreDamis;
	}
	
	
	
	public void CreeListeDami(){
		Friend = new Personne[700];
		System.out.println("---Liste D'amis Cr�e---");
	}
	
	
	
	public void AddAmi(Personne P){
		NombreDamis=NombreDamis+1;
		Friend[NombreDamis]=P;
		System.out.println("La personne "+P.getNomAmi()+P.getPrenomAmi()+" A �tait ajouter a la liste d'Amis");
	}
	
	
	
	public void ListeDamis(){
		System.out.println("------------Ma Liste D'amis(es)------------");
		for(int i=0;i<=NombreDamis;i++){
			System.out.println((i+1)+Friend[i].toSting());
		}
	}
	
	
	
	public void amisAlgeriens(){
		System.out.println("Mes Amis(es) de Nationnalit� Alg�rienne sont :");
		for(int i=0;i<=NombreDamis;i++){
			if(Friend[i].getNation()=="Agerien" || Friend[i].getNation()=="Algerienne"){
				System.out.println("Votre Amis(es)"+Friend[i].getNomAmi()+Friend[i].getPrenomAmi()+" Est de Nationnalit� Algerienne");
			}
		}
	}
	
	
	
	public void AmisEtranger(){
		System.out.println("Mes Amis(es) de Nationnalit� Etrang�res sont :");
		for(int i=0;i<=NombreDamis;i++){
			if(Friend[i].getNation()!="Agerien" || Friend[i].getNation()!="Algerienne"){
				System.out.println("Votre Amis(es)"+Friend[i].getNomAmi()+Friend[i].getPrenomAmi()+" Est de Nationnalit�"+Friend[i].getNation());
			}
		}
	}
	
	public int getNombreDamis(){
		return NombreDamis ;
	}
	
	public void setNombreDamis(int n){
		this.NombreDamis=n;
	}
	
}
