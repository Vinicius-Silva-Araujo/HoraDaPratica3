import org.w3c.dom.ls.LSOutput;

public class Aluno {
    private String nome;
    private double nota;
    private  int totalNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    void somaNota(double nota1){
        nota += nota1;
        totalNotas ++;


    }

    double mediaNotas(){
        return  nota / totalNotas;
    }

}
