public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    void verifiaIdade(){
        if (idade>=18){
            System.out.println("Aluno é maior de idade!");
        }
        else {
            System.out.println("Aluno é menor de idade!");
        }
    }
}
