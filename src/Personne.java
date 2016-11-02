
public class Personne {
			
	private String nomAmi;
	private String prenomAmi;
	private Date Naissance;
	private String Nation;
	
	public Personne(String n,String P){
		this.nomAmi=n;
		this.prenomAmi=P;
	}
	
	public Personne(String Nation){
		this.Nation=Nation;
	}
	
	public String getNomAmi(){
		return nomAmi;
	}
	public void setNomAmi(String nomAmi){
		this.nomAmi=nomAmi;
	}
	
	
	public void setPrenomAmi(String prenomAmi){
		this.prenomAmi=prenomAmi;
	}
	
	public void setNaissance(Date Naissance){
		this.Naissance=Naissance;
	}
	
	public void setNation(String Nation){
		this.Nation=Nation;
	}
	
	public String getPrenomAmi(){
		return prenomAmi;
	}
	
	public Date getNaissance(){
		return Naissance;
	}
	
	public String getNation(){
		return Nation;
	}
	
	
	
	public String toSting(){
		return this.nomAmi+this.prenomAmi+"   \n"+this.Naissance.toSting()+" De "+this.Nation+"\n est votre amis sur facebook"; 
	}
	
	
}
