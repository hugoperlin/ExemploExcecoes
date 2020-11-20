public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws RuntimeException{
        if(this.nome.length() < 10){
            throw new RuntimeException("Tamanho do nome inválido!!!");
        }

        this.nome = nome;

        if(idade < 18){
            throw new RuntimeException("Idade inválida!!!");
        }

        this.idade = idade;
    }
}
