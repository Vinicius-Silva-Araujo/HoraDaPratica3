public class Principal {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular="Vinicius";
        contaBancaria.setNumeroConta(1254);
        contaBancaria.setSaldo(1000);
        System.out.println("Titular conta: "+contaBancaria.titular);
        System.out.println("Numero da Conta: "+contaBancaria.getNumeroConta());
        System.out.println("Saldo da Conta: "+contaBancaria.getSaldo());
        System.out.println("\n-----------------------------------------------");
        contaBancaria.setSaldo(2000000);
        System.out.println("Saldo atualizado: "+contaBancaria.getSaldo() );
        System.out.println("\n#######################################");

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Daniela");
        idadePessoa.setIdade(18);
        System.out.println("Nome: "+idadePessoa.getNome());
        System.out.println("Idade: "+idadePessoa.getIdade());
        idadePessoa.verifiaIdade();
        System.out.println("\n#######################################");

        Produto produto = new Produto();
        produto.setNome("Cerveja");
        produto.setPreco(150);
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço original: "+produto.getPreco());
        System.out.println("Preco com 10% de desconto: "+produto.aplicaDesconto());
        System.out.println("\n#######################################");

        Aluno aluno = new Aluno();
        aluno.setNome("Daniel Alves Araujo");
        aluno.somaNota(10);
        aluno.somaNota(5);
        aluno.somaNota(8);
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Media: "+aluno.mediaNotas());
        System.out.println("\n#######################################");

        Livro livro = new Livro();
        livro.setTitulo("A Cabana");
        livro.setAutor("William P. Young");
        livro.Exibir();




    }
}
