package co.edu.udea;

public class CodeBreaker {

	public String comparar(String num){
		
		String obtiene = "";
		String numSecreto = "1234";

				
		
		for(int i=0;i<4;i++){
			for (int j=0;j<4;j++){
				if(i==j) {
					if(numSecreto.charAt(i)==num.charAt(j))
						obtiene=obtiene+"X";	
				}
				if (i!=j){
					if(numSecreto.charAt(i)==num.charAt(j))
					obtiene=obtiene+"_";
				}
			}
		}
		
		
		
		return obtiene;
	}
}
