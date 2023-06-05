import java.util.ArrayList;
import java.util.Scanner; 

public class Meus_Livros{


ArrayList<Livros_Romance> Livros_Romance;
ArrayList<Livros_Acao> Livros_Acao;  

Scanner sc = new Scanner (System.in);
String nome;


public void cadastar_LivrosRomance (){
    Livros_Romance lvRomance = new Livros_Romance();

    System.out.println("Informe os dados do Livro");

    

    String nome = sc.nextLine();
    
    System.out.println("Livro de romance cadastrado");
    





}

public static void main(String[] args) {
    
    //Imprimir o Enum

    for (Genero genero : Genero.values()){

        System.out.println("Filmes Favoritos:\n");

        System.out.println("Genero" + genero.name());
        System.out.println("Favorito" + genero.getFavorito());
        System.out.println("Nota" + genero.getNota());

    }
}



}