
public class Principal {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();

        f.nome = "Maria Silva";  // atributo público
        f.salario = 4500.00;    // mesma classe, mesmo pacote (protected). Como essa classe (Principal) está no mesmo pacote da classe Funcionario, o salario pode ser acessado diretamente.
        f.departamento = "RH"; // default, está no mesmo pacote (package)

        // f.cpf = "123.456.789-00"; 
        // ERRO: 'cpf' é private (acesso negado)
        // cpf é um atributo private, ou seja, só pode ser acessado dentro da própria classe Funcionario
        //Qualquer tentativa de acessar cpf diretamente fora da classe gera erro de compilação. Por isso, comentei essa linha — se fosse executada, não funcionaria.

        f.setCpf("123.456.789-00"); // uso do setter público
        System.out.println("CPF via getter: " + f.getCpf()); 
        
        f.exibirInformacoes(); // Exibe todos os dados
    }
}
