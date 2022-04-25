import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Filme filme = new Filme();
        List<Integer> filmeCodigos = new ArrayList<>();
        List<String> filmeNomes = new ArrayList<>();
        List<Double> filmeValores = new ArrayList<>();
        List<Boolean> filmeDisponivel = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        while(i < 2){
            System.out.print("Codigo:");
            filmeCodigos.add(input.nextInt());
            input.nextLine();

            System.out.print("Nome:");
            filmeNomes.add(input.nextLine());

            System.out.print("Valor:");
            filmeValores.add(input.nextDouble());
            input.nextLine();

            System.out.print("Disponível:");
            filmeDisponivel.add(input.nextBoolean());
        }

        //Limpar o terminal/console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        

        System.out.println("Filmes Cadastrados:");

        for (int j = 0; j < filmeCodigos.size(); j++){
            filme.setCodigo(filmeCodigos.get(j));
            filme.setNome(filmeNomes.get(j));
            filme.setValor(filmeValores.get(j));
            filme.setDisponivel(filmeDisponivel.get(j));

            filme.mostrar();
        }
        input.close();

}
}
