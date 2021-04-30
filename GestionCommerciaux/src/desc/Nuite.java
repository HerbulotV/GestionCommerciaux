package desc;

public class Nuite extends NoteFrais {
	private int montantFacture;
	private int region;
	
	public Nuite(int numero, DateFr date, int montantARembourse, boolean isEstRembourse, Commercial leCommercial, int montantFacture, int region) {
		super(numero, date, montantARembourse, isEstRembourse, leCommercial);
		this.montantFacture = montantFacture;
		this.region = region;
		this.setMontantARembourse();
	}
	
	public double calculMontantARembourse() {
		if(leCommercial.getCategorie() == 'A') {
			if(montantFacture<65) {
				montantARembourse = montantFacture;
				
			}else {
				montantARembourse = 65;
			
				
			}
			
		}
			else if(leCommercial.getCategorie() == 'B') {
				if(montantFacture<55) {
					montantARembourse = montantFacture;
					
				}else {
					montantARembourse = 55;
				
			}
		}else {
			if(montantFacture<50) {
				montantARembourse = montantFacture;
				
			}else { 
				montantARembourse = 50;
				
			}
			
		}
		double a = 0;
	switch(region) {
	case 1:a = montantARembourse * 0.90;
		break;
	case 2 :a= montantARembourse * 1;
		break;
	case 3 :a=montantARembourse * 1.15;
		break;
		}
	return a;
	}
	
	@Override
	public String toString() {
		return "[N-"+getNumero()+"-"+getDate()+"-"+calculMontantARembourse()+"E-"+super.rembourser()+"-payé : "+montantFacture+"E-"+region+"-]";
	}
	
	public int getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(int montantFacture) {
		this.montantFacture = montantFacture;
	}
	
	public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}
}
	
	

