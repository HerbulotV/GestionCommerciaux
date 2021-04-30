package desc;

public class FraisTransport extends NoteFrais {
	private int nbKm;
	
	
	public FraisTransport(int numero, DateFr date, boolean isEstRembourse, int nbKm) {
		super(numero, date, isEstRembourse);
		this.nbKm = nbKm;
	}
	
	public FraisTransport(int numero, DateFr date, int montantARembourse, boolean isEstRembourse,Commercial leCommercial, int nbKm) {
		super(numero, date, montantARembourse, isEstRembourse, leCommercial);
		this.nbKm = nbKm;
		this.setMontantARembourse();
	}
	
	
	public int getNbKm() {
		return this.nbKm;
	}
	public void setNbKm(int nbKm) {
		this.nbKm = nbKm;
	}
	public double calculMontantARembourse() {
		
		if (leCommercial.getPuissanceVoiture() > 10) {
			montantARembourse =nbKm*0.9;
		}else if(leCommercial.getPuissanceVoiture() >= 5) {
			montantARembourse=nbKm*0.8;
		}else {
			montantARembourse= nbKm*0.7;
		}
		
		return montantARembourse;
	}


	@Override
	public String toString() {
		return "[T-"+getNumero()+"-"+getDate()+"-"+calculMontantARembourse()+"E-"+super.rembourser()+"-"+nbKm+" km-]";
	}
	
	

}
