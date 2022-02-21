
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);

		
		// conta está inconsistente com relacao a regra de negocio
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 24227);
		Conta conta3 = new Conta(1001, 10023);
		Conta conta4 = new Conta(0001, 12123);
		
		System.out.println(conta2.getTotal());
	}
}
