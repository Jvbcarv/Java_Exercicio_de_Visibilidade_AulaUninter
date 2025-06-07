
//classe Funcionario
public class Funcionario {
	public String nome; // Acesso livre de qualquer lugar (visibilidade: pública)
    protected double salario; // Acesso permitido na mesma classe, subclasses e mesmo pacote (visibilidade: protegida)
    private String cpf; // Acesso apenas dentro da própria classe (visibilidade: privada)
    String departamento; // Acesso permitido apenas dentro do mesmo pacote (default package - sem modificador)

 // Getter e Setter para o atributo 'cpf'
 //Esses métodos são públicos, e por isso podem ser usados para acessar/modificar o atributo cpf, mesmo que ele seja private
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  // Método para exibir informações chamadoexibirInformacoes() solicitado no exercício.
  
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("CPF: " + cpf);  //Mesmo que o cpf seja private, dentro da própria classe ele ainda pode ser acessado diretamente.
}
}
