
package ac2;
import java.util.Scanner;
public class Ac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long cpf = 12345678900L; //variaveis pre determinadas
        int senha = 1020304;
        double saldo = 1000.0;
        
        long n1; //variavel a ser escaneada e comparada com o cpf
        int n2; //variavel a ser escaneada e comparada com a senha
        int tentativas; //variavel do for para as tentativas da entrada da senha
        int menu; //variavel para o switch case, do menu de operacoes
        int n3; //variavel para checar o final da operacao
        double n4; //variavel para operacao de deposito
        double n5; //variavel para operacao de saque
        int operador = 1; //variavel do while 
        
        
        while (true){ // lasso while pra voltar pro cpf
        int cont=0; //contador de tentativas
        System.out.print("Insira seu cpf sem pontos ou tracos, apenas os numeros:");
        n1 = sc.nextLong();
            if (n1 == cpf){ //checagem do cpf
                for (tentativas=1;tentativas<=2;tentativas++){ //checagem da senha
                    System.out.print("Insira sua senha (tentativa numero " + (tentativas) + "):");
                    n2 = sc.nextInt();
                        if (n2 == senha){
                            System.out.println("Senha correta! Bem-vindo!");
                            operador=1;
                            while (operador==1){ // lasso while do menu de operacoes 
                            System.out.print("\n Menu de operacoes \n 1)Saldo \n 2)Realizar deposito \n 3)Realizar saque \n 4)Sair \n" );
                            System.out.print("Digite a operacao desejada:");
                            menu = sc.nextInt();
                            
                            switch (menu){ //checagem da operacao selecionada
                                case 1:
                                    System.out.println("Seu saldo atual: "+saldo);
                                    System.out.print("\n 1)Voltar ao menu de operacoes \n 2)Sair \n Deseja realizar outra operacao?: ");
                                    n3 = sc.nextInt();
                                        if(n3 == 2){
                                            operador =2;
                                        } 
                                break;
                                
                            
                                case 2: 
                                    System.out.print("Insira o valor do deposito a ser realizado:");
                                    n4 = sc.nextDouble();
                                        if (n4 > 0){ //checagem do valor do deposito
                                            saldo = saldo + n4;
                                            System.out.println("Deposito realizado com sucesso!");
                                            System.out.print("\n 1)Voltar ao menu de operacoes \n 2)Sair \n Deseja realizar outra operacao?: ");
                                            n3 = sc.nextInt();
                                                if(n3 == 2){
                                                    operador =2;
                                                }
                                            
                                        }
                                        else {
                                            System.out.println("Valor inserido e invalido!");
                                            System.out.print("\n 1)Voltar ao menu de operacoes \n 2)Sair \n Deseja realizar outra operacao?: ");
                                            n3 = sc.nextInt();
                                                if(n3 == 2){
                                                    operador =2;
                                                }
                                        }    
                                break;
                                
                                case 3:
                                    System.out.print("Insira o valor do saque a ser realizado:");
                                    n5 = sc.nextDouble();
                                        if (n5 <= saldo){ // checagem do valor do saque 
                                            saldo = saldo - n5;
                                            System.out.println("Saque realizado com sucesso!");
                                            System.out.print("\n 1)Voltar ao menu de operacoes \n 2)Sair \n Deseja realizar outra operacao?: ");
                                            n3 = sc.nextInt();
                                                if(n3 == 2){
                                                    operador =2;
                                                }
                                        }
                                        else {
                                            System.out.println("Valor inserido ultrapassa a quantia do saldo!");
                                            System.out.print("\n 1)Voltar ao menu de operacoes \n 2)Sair \n Deseja realizar outra operacao?: ");
                                            n3 = sc.nextInt();
                                                if(n3 == 2){
                                                    operador =2;
                                                }
                                        }
                                break;    
                                
                                case 4:
                                    operador = 2;
                                break;
                                
                                default:
                                    System.out.println("Operacao invalida!");
                                    System.out.print("\n 1)Voltar ao menu de operacoes \n 2)Sair \n Deseja realizar outra operacao?: ");
                                    n3 = sc.nextInt();
                                        if(n3 == 2){
                                                    operador =2;
                                                }
                                break;
                                
                            }        
                        }
                    }        
                        else {
                            System.out.println("Senha incorreta!");
                            cont++;
                        }
                        
                        if (cont == 2){
                            System.out.println("Voce esgotou o numero de tentativas!");
                        }
                    
                } 
            }
            else {
                System.out.println("Tela de acesso nao permitida, CPF invalido!");
            }
        }
    }  
}
