package aula14;

// [x] Crie uma hierarquia de classes para representar os diferentes tipos de funcionários de um escritório que 
// tem os seguintes cargos: gerente, assistente, vendedor. Escreva uma classe base chamada Funcionario que contenha 
// os atributos: nome (String), matricula (String) e salarioBase (double). Forneça um construtor que receba os 
// valores correspondentes a serem armazenados nos respectivos atributos.

// [x] A classe Funcionario deverá ser estendida pelas classes representativas dos tipos de funcionários: 
// Gerente, Assistente e Vendedor.

// [x] Crie uma classe Teste com um método main que cria um objeto de cada tipo de funcionário. Calcule então a soma 
// dos salários dos três funcionários e imprima no console o valor total.

public class Funcionario {
    String nome;
    String matricula;
    double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

}
