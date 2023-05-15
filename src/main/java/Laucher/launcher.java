package Laucher;


import cases.Cases;

public class launcher {
	public static void main(String[] args) {
		Cases cases = new Cases();
		String user = "YGrajalesA";
		String passw = "Fourieriplanner22*";
		
		System.out.println("Se ejecuta el caso de prueba");
		
		cases.caseCampaign(user, passw);
		cases.caseEvolution(user, passw);
		
		System.out.println("Se termina el caso de prueba");
		
	}
}
