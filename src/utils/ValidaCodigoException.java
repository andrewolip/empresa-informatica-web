package utils;

public class ValidaCodigoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidaCodigoException() {
		System.out.println("Este usuário já existe!");
	}
}
