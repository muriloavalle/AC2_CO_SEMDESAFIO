
package ac2;
import java.util.Scanner;
public class teste {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tentativas;
        int senha = 12345;
        int n2;
        
        
        for (tentativas=1;tentativas<=2;tentativas++){
            System.out.print("Insira sua senha (tentativa numero " + (tentativas) + "):");
            n2 = sc.nextInt();
                if (n2 == senha){
                    System.out.println("Senha correta! Bem-vindo!");
                }
                else {
                    System.out.println("Senha incorreta!");
                    
                }
                    if (tentativas == 2){
                        System.out.println("Voce esgotou o numero de tentativas!");
                    }
        }
        
        
        
        
    }
}
