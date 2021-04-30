package desc;

public class RepasMidi extends NoteFrais {
	private int montantFacture;
	
	
	public RepasMidi(int numero, DateFr date, int montantARembourse, boolean isEstRembourse,Commercial leCommercial, int montantFacture) {
		super(numero, date, montantARembourse, isEstRembourse, leCommercial);
		this.montantFacture = montantFacture;
		this.setMontantARembourse();
	}
	public double calculMontantARembourse() {
		if(leCommercial.getCategorie() == 'A') {
			if(montantFacture<25) {
				montantARembourse = montantFacture;
				return  montantARembourse;
			}else {
				montantARembourse = 25;
			return montantARembourse;
				
			}
		}
			else if(leCommercial.getCategorie() == 'B') {
				if(montantFacture<22) {
					montantARembourse = montantFacture;
				return montantARembourse;
				}else {
					montantARembourse = 22;
				return montantARembourse;
			}
		}else {
			if(montantFacture<20) {
				montantARembourse = montantFacture;
				return montantARembourse;
			}else { 
				montantARembourse = 22;
				return montantARembourse;
			}
		}
	}
	
	public int getMontantFacture() {
		return this.montantFacture;
	}
	public void setMontantFacture(int montantFacture) {
		this.montantFacture = montantFacture;
	}
	@Override
	public String toString() {
		return "[R-"+getNumero()+"-"+getDate()+"-"+calculMontantARembourse()+"E-"+super.rembourser()+"-payé : "+montantFacture+"E]";
	}
}
