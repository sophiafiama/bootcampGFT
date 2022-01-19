package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Gato gato1 = new Gato();
        gato1.setNome("Nayla");
        gato1.setCor("Branca");
        gato1.setIdade(2);

        Gato gato2 = new Gato();
        gato2.setNome("Shirra");
        gato2.setIdade(3);
        gato2.setCor("Caramelo");

        System.out.println(gato1);
        System.out.println(gato2);
        gato2.setCor("Caramelo");

        Livro livro1 = new Livro("Tomates Verdes e Fritos", 482);
        System.out.println(livro1);


/*      int a = 5;
        int b = 3;
        System.out.println("Olá jovens!" + (a+b));*/
    }

}

class Livro{

    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

