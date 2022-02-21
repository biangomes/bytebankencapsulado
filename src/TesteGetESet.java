
public class TesteGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(140);
		System.out.println(conta.getNumero());
		
		Cliente bia = new Cliente();
		bia.setNome("Beatriz Nascimento Gomes");
		bia.setCpf("000.000.000-00");
		bia.setProfissao("Analista de Serviços TI I");
		
		//conta.titular = bia;
		conta.setTitular(bia);
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getProfissao());
		System.out.println("-------------");
		conta.getTitular().setProfissao("Cientista de Dados");
		System.out.println(conta.getTitular().getProfissao());
		
		
		// Outra alternativa
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programadora");
		System.out.println("-------------");
		System.out.println(titularDaConta.getProfissao());
	}
}
