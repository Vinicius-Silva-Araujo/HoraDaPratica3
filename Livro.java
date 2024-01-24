public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    void Exibir(){
        System.out.println("Titulo do Livro: "+titulo);
        System.out.println("Autor: "+autor);
    }
}
