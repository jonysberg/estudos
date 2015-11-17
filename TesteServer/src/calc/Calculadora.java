package calc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculadora {

	   @WebMethod(operationName="add", action="urn:Add")
	   public int add(int i, int j) {
	           int k = i +j ;
	           System.out.println(i + "+" + j +" = " + k);
	               
	               return k;
	       }
}

