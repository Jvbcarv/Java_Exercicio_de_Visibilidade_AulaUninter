Programação Orientada a Objetos (POO) com Java – Visibilidade (modificadores de acesso)<br>

Exercício: Controle de Acesso em uma Classe de Funcionário<br><br>

Objetivo:<br>
Praticar o uso de modificadores de acesso (private, public, protected e default) em Java.<br>

Descrição:<br>
Crie duas classes: Funcionario e Principal.<br>
1.	Na classe Funcionario:<br>
- Crie os seguintes atributos:<br>
-- nome (visibilidade: pública)<br>
-- salario (visibilidade: protegida)<br>
-- cpf (visibilidade: privada)<br>
-- departamento (sem modificador - default)<br>
-	Crie um método público chamado exibirInformacoes() que imprime todos os dados do funcionário.<br>
-	Crie métodos getters e setters apenas para o atributo cpf.<br><br>
2.	Na classe Principal:<br>
-	Crie um objeto da classe Funcionario.<br>
-	Atribua valores a todos os atributos (use os meios corretos de acesso, respeitando os modificadores).<br>
-	Chame o método exibirInformacoes().<br><br>
Requisitos:<br>
•	Demonstre claramente onde é possível e onde não é possível acessar diretamente os atributos devido à visibilidade.<br>
•	Tente acessar o cpf diretamente fora da classe Funcionario e comente o motivo do erro (se houver).<br><br>

O objetivo do exercício é apresentar:<br>
•	Como proteger os dados de uma classe (encapsulamento).<br>
•	Por que é importante usar private com getters/setters.<br>
•	Como o acesso muda conforme estamos dentro ou fora do pacote.<br>
•	A diferença entre public, private, protected e "default".<br>

<br>
Saída do console:

![image](https://github.com/user-attachments/assets/f01fcdb4-7a90-4016-ba58-aaf585cf7f7f)
