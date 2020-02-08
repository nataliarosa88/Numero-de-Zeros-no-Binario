package teste;

public class SolutionImpl implements Solution{

	@Override
	public void solution(int inteiro) {
		
		int count = 0;
		
		String binaryString = Integer.toBinaryString(inteiro);
		
		System.out.println("O numero passado " + inteiro + " em Binario é : " + binaryString);
		
		for(int i=0; i< binaryString.length(); i++) {
			if( binaryString.charAt(i) == '0' ) count ++;
		}
		
		System.out.println("A quantidade de zeros no binario " + binaryString + " é " + count);
	}
	
}
