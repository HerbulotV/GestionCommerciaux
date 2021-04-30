package desc;

import java.util.Calendar ;
import java.util.GregorianCalendar ;

/** Représenter une date au format "JJ/MM/AAAA"
 * @author xilim
 * @since 0.1
 * @version 0.1
 */
public class DateFr extends GregorianCalendar {
	
	private static final long serialVersionUID = 1L ;

	/** Créer une date
	 * @param jour Le numéro du jour
	 * @param mois Le numéro du mois
	 * @param annee L'année
	 */
	public DateFr(int jour, int mois, int annee){
		super(annee,mois-1,jour) ;
	}
	
	/** Créer la date d'aujourd'hui
	 * 
	 */
	public DateFr(){
		super() ;
		this.set(Calendar.HOUR,0);
		this.set(Calendar.MINUTE,0);
		this.set(Calendar.SECOND,0);
		this.set(Calendar.MILLISECOND,0);
	}
	
	/** Obtenir le numéro du jour
	 * @return Le numéro du jour
	 */
	public int getJour(){
		return this.get(Calendar.DAY_OF_MONTH) ;
	}
	
	/** Obtenir le numéro du mois
	 * @return Le numéro du mois
	 */
	public int getMois(){
		return this.get(Calendar.MONTH) + 1 ;
	}
	
	/** Obtenir l'année
	 * @return L'année
	 */
	public int getAnnee(){
		return this.get(Calendar.YEAR) ;
	}
	
	/** Indique si la date est antérieure à une autre date
	 * @param autre L'autre date
	 * @return true si la date est antérieure à l'autre date et false dans le cas contraire
	 */
	public boolean estAnterieure(DateFr autre){
		if(this.before(autre) == true){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	/** Indique si la date est postérieure à une autre date
	 * @param autre L'autre date
	 * @return true si la date est postérieure à l'autre date et false dans le cas contraire
	 */
	public boolean estPosterieure(DateFr autre){
		if(this.after(autre) == true){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	/** Indique si la date est égale à une autre date
	 * @param autre L'autre date
	 * @return true si la date est égale à l'autre date et false dans le cas contraire
	 */
	public boolean estIdentique(DateFr autre){
		if(this.equals(autre) == true){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	/** Indique si la date fait partie d'une période
	 * @param debut Date de début de la période
	 * @param fin Date de fin de la période
	 * @return true si la date fait partie de la période et false dans le cas contraire
	 */
	public boolean estCompriseEntre(DateFr debut, DateFr fin){
		if( (this.equals(debut) == true || this.after(debut) == true) && (this.equals(fin) == true || this.before(fin) == true) ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	/** Avancer la date d'un ou plusieurs jours
	 * @param nbJours Décalage en nombre de jours
	 */
	public void avancer(int nbJours){
		this.add(Calendar.DAY_OF_MONTH,-1 * nbJours) ;
	}
	
	/** Repousser la date d'un ou plusieurs jours
	 * @param nbJours Décalage en nombre de jours
	 */
	public void repousser(int nbJours){
		this.add(Calendar.DAY_OF_MONTH,nbJours);
	}
	
	/** Générer une date antérieure
	 * @param nbJours La différence en nombre de jours entre la date courante et la date antérieure
	 * @return La date antérieure
	 */
	public DateFr genererDateAvant(int nbJours){
		DateFr date = (DateFr) this.clone() ;
		date.avancer(nbJours) ;
		return date ;
	}
	
	/** Générer une date postérieure
	 * @param nbJours La différence en nombre de jours entre la date courante et la date postérieure
	 * @return La date postérieure
	 */
	public DateFr genererDateApres(int nbJours){
		DateFr date = (DateFr) this.clone() ;
		date.repousser(nbJours) ;
		return date ;
	}

	/* (non-Javadoc)
	 * @see java.util.Calendar#toString()
	 */
	@Override
	public String toString(){
		return String.format("%02d/%02d/%04d", this.getJour(), this.getMois(), this.getAnnee()) ;
	}

}


