package desc;

public class NoteFrais {
		private DateFr date;
		private boolean isEstRembourse;
		protected double montantARembourse;
		private int numero;
		protected Commercial leCommercial;
		
		
		public NoteFrais(int numero, DateFr date, boolean isEstRembourse) {
			this.numero = numero;
			this.date = date;
			this.isEstRembourse = isEstRembourse;
			
		}
		public NoteFrais(int numero, DateFr date, double montantARembourse, boolean isEstRembourse) {
			this.numero = numero;
			this.date = date;
			this.isEstRembourse = isEstRembourse;
			this.montantARembourse = montantARembourse;
		}
		
		public NoteFrais(int numero, DateFr date, double montantARembourse, boolean isEstRembourse,Commercial leCommercial) {
			this.numero = numero;
			this.date = date;
			this.isEstRembourse = isEstRembourse;
			this.montantARembourse = montantARembourse;
			this.leCommercial = leCommercial;
		}
		
		
	
		public NoteFrais(int numero, DateFr date, Commercial leCommercial) {
			this.numero = numero;
			this.date = date;
			this.leCommercial = leCommercial;
			
		}
		
		public double calculMontantARembourse() {
		
			return 0;
			
		}
		public String rembourser() {
			if (isEstRembourse == true ) {
				return "R";
			}else {
					return "NR";
				}
			}
		
		
		
		
		public String toString() {
			return "Numéro de la note :"+numero+", date: "+date+", montant à rembourser: "+rembourser();
			}
		
		
		
	
		
		public DateFr getDate() {
			return this.date;
		}
		public void setDate(DateFr date) {
			this.date = date;
		}
		
		
		public boolean getIsEstRembourse() {
			return this.isEstRembourse;
		}
		public void setIsEstRembourse(boolean isEstRembourse) {
			this.isEstRembourse = isEstRembourse;
		}
		
		
		public double getMontantARembourse() {
			return this.montantARembourse;
		}
		public void setMontantARembourse() {
			this.montantARembourse = calculMontantARembourse();
		}
		
		
		public int getNumero() {
			return this.numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public Commercial getLeCommercial() {
			return leCommercial;
			
		}
		public void setLeCommercial(Commercial leCommercial) {
			this.leCommercial = leCommercial;
		}
}
