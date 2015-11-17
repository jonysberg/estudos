package calc;

import java.rmi.RemoteException;

public class TestarCalculadora {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		CalculadoraProxy calc = new CalculadoraProxy();
		
		int retorno = calc.add(1,25);
		System.out.println("Resultado - " + retorno);
		
	}

}
