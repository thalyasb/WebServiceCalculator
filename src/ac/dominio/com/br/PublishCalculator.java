package ac.dominio.com.br;
import javax.xml.ws.Endpoint;

public class PublishCalculator {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/servico/calculator?wsdl", new CalculatorImpl());
		System.out.println("Servi�o publicado com sucesso! Dattebayoooooo!!!");
		
	}

}