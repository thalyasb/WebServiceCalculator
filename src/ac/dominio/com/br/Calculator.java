package ac.dominio.com.br;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface Calculator {

	@WebMethod
	String calcular(@WebParam(name = "numero1") float numero1, @WebParam(name = "numero2") float numero2,
			@WebParam(name = "operacao") String operacao);

}