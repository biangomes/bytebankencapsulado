public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    // Criando um construtor pra evitar os valores default de agencia e numero iguais a zero
    public Conta(int agencia, int numero) {
    	total++;
    	System.out.println("O total de contas é: " + total);
    	this.agencia = agencia;
    	this.numero = numero;
    }
    
    public void deposita(double valor) {
    	this.saldo = this.saldo + valor;
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo = this.saldo - valor;
    		return true;
    	} 
    	
    	return false;
    }
    
    public boolean transfere(double valor, Conta numeroDaContaDestino) {
    	if(this.saldo >= valor) {
    		numeroDaContaDestino.saldo = numeroDaContaDestino.saldo + valor;
    		this.saldo = this.saldo - valor;
    		return true;
    	}
    	
    	return false;
    }
    
    // Método que retorna um saldo, pois ele foi deixado como PRIVADO
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int novoNumero) {
    	if(numero <= 0) {
    		System.out.println("Não pode valor menor ou igual a zero");
    		return;
    	}
    	else {
    		this.numero = novoNumero;
    	}
    }
    
    public int getAgencia() {
    	return this.agencia;
    }
    
    public void setAgencia(int novaAgencia) {
    	if(novaAgencia <= 0) {
    		System.out.println("Não pode valor menor ou igual a zero");
    		return;
    	}
    	
    	this.agencia = novaAgencia;
    }
    
    public Cliente getTitular() {
    	return this.titular;
    }
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public static int getTotal() {
    	return Conta.total;
    }
}