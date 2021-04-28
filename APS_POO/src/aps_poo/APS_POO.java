package aps_poo;

import java.util.Scanner;

public class APS_POO {
    public static void main(String[] args) {

            Scanner menu = new Scanner (System.in);
            Scanner S = new Scanner (System.in);
            CadastroAcademia c = new CadastroAcademia();
        
        System.out.println("------ Cadastro de Usuario ------ \n" );
        
        System.out.println("Digita o seu Nome: ");
        c.nome = S.next();
       
        System.out.println("Digita a sua Idade: ");
        c.idade = S.nextInt();
        
        System.out.println("Digita o seu Sexo: ");
        c.sexo = S.next();
        
        System.out.println("Digite o seu CPF:");
        c.cpf = S.nextInt();
        
        System.out.println("Digite o seu RG: ");
        c.rg = S.nextInt();
        
        System.out.println("Digite o seu Endereço: ");
        c.endereço = S.next();
        
        System.out.println("Digite o seu Telefone:");
        c.telefone = S.nextInt();
       
        System.out.println("Digite o seu E-mail: ");
        c.email = S.next();
        
        c.cadastrar();
        

            while (true) {            

            System.out.print("\n ######### Escolha se o Usuário é Cliente ou Funcionario #########\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Clientes          |\n");
            System.out.print("| Opção 2 - Funcionario       |\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("\n Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 3) {
                System.out.print("\nAté logo!\n\n");
                menu.close();
                  break;      
            }
             

            switch (opcao) {
            case 1:
                
                System.out.print("\nOpção Clientes Selecionado\n");
                CadastroCliente cl = new CadastroCliente();
            
                System.out.println("\nDigite a sua Altura: ");
                cl.altura = S.nextFloat();
                
                System.out.println("Digite o seu Peso: ");
                cl.peso = S.nextFloat();
                 
                System.out.println("Digita a Duração da Matricula: ");
                cl.AnoDuracao = S.nextInt();
                
                //cl.DuraçãoDaMatricula(); 
                
                System.out.println("\n---------- Cliente Cadastrado com Sucesso ----------");
                
                System.out.println(c.toString());
                System.out.println(cl.toString());
                
                System.out.println("------------------------------------------------------");
                
                break;
                
                

            case 2:
                System.out.print("\nOpção Funcionario Selecionado\n");
                CadastroFuncionario f = new CadastroFuncionario();
       
                System.out.println("\nDigita o Número da sua Carteira: ");
                f.carteiraTrabalho = S.nextInt();
            
                System.out.println("Digita o seu Horario: ");
                f.horario = S.nextFloat();
            
                System.out.println("Digita a sua Área: ");
                f.área = S.next();
            
                System.out.println("\n---------- Funcionario Cadastrado com Sucesso ----------");
                
                System.out.println(c.toString());
                System.out.println(f.toString());
            
                System.out.println("-----------------------------------------------------------");
                
            break;
                
              

            default:
                System.out.print("\nOpção Inválida!\n");
                break;
        }
    }
 }
}