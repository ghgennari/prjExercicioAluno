/**
 *
 * @author Gustavo
 */
import java.util.Scanner;
public class Aplic {
    public static void main(String[] args) {
        double P1, P2, T1, T2;
        int opcao, RA;
        
        //Entradas de dados
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o RA do aluno: ");
        RA = entrada.nextInt();
        System.out.print("Digite a nota da Prova 1: ");
        P1 = entrada.nextDouble();
        System.out.print("Digite a nota da Prova 2: ");
        P2 = entrada.nextDouble();
        System.out.print("Digitte a nota do Trabalho 1: ");
        T1 = entrada.nextDouble();
        System.out.print("Digite a nota do Trabalho 2: ");
        T2 = entrada.nextDouble();
        
        //Instanciação dos dados
        Aluno objAluno = new Aluno();
        objAluno.setRA(RA);
        objAluno.setNtPrv1(P1);
        objAluno.setNtPrv2(P2);
        objAluno.setNtTrab1(T1);
        objAluno.setNtTrab2(T2);
        
        //Escolhas
        do{
            System.out.println("1 - Exibir nota das Provas/Trabalhos");
            System.out.println("2 - Exibir média das Provas/Trabalhos");
            System.out.println("3 - Exibir média final");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opcao: ");
            opcao = entrada.nextInt();
            
            if(opcao == 1){
                System.out.println("RA: " + RA);
                System.out.println("Prova 1; " + P1);
                System.out.println("Prova 2: " + P2);
                System.out.println("Trabalho 1: " + T1);
                System.out.println("Trabalho 2: " + T2);
            }else{
                if(opcao == 2){
                    System.out.println("RA: " + RA);
                    System.out.println("Media Provas: " + objAluno.calcMediaProva());
                    System.out.println("Media trabalhos: " + objAluno.calcMediaTrab());
                }else{
                    if(opcao == 3){
                        System.out.println("RA: " + RA);
                        System.out.println("Media final: " + objAluno.calcMediaFinal());
                    }
                }
            }
        }while(opcao<4);
        System.out.print("Sistema encerrado!\n");
    }
}
