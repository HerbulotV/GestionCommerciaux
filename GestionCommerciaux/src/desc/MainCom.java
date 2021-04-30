package desc;



public class MainCom {
	public static void main(String[] args) {
		DateFr date=  new DateFr(15,9,2020);
		Commercial comTest = new Commercial('A',"Henri","Jean",127);
		
		Nuite blue = new Nuite(3,date,0,false,comTest,68,3);
		System.out.println(blue);
		/*RepasMidi kfc = new RepasMidi(3,date,0,false,comTest,35);
		System.out.println(kfc);*/
		/*FraisTransport noteTest1 = new FraisTransport(22,date,0,false,comTest, 100);
		System.out.println(noteTest1);*/
		
		
	}

}
