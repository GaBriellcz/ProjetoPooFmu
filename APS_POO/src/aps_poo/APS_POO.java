package aps_poo;

import java.util.Scanner;
        
public class APS_POO {

    public static void main(String[] args) {
        CadastroAcademia c = new CadastroAcademia();
        Scanner K = new Scanner (System.in);
        
        System.out.println("Cadastro de Usuario");
        
        System.out.println("Digita o seu Nome: ");
        c.nome = K.next();
        
        System.out.println("Digite o seu CPF:");
        c.cpf = K.nextInt();
        
        System.out.println("Digite o seu RG: ");
        c.rg  = K.nextInt();
       
        System.out.println("Digita a sua Idade: ");
        c.idade = K.nextInt();
       
        System.out.println("Digite o seu Telefone:");
        c.teleefone = K.nextInt();
       
        System.out.println("Digite o seu Endereço: ");
        c.endereço = K.next();
        
       
        
        
      
      // System.out.println("Cadastro");
       //c.nome = "Pedro";
      // c.idade = 21; 
       //c.endereço = "Rua Emilio Retrosi";
      // c.teleefone = 1199999;
       //c.cpf = 88787878;
      // c.rg  = 24242424;
      // c.Cadastro();
       
       
       CadastroFuncionario f = new CadastroFuncionario();
       //System.out.println("Cadastro Funcionario");
       f.carteiraTrabalho = 0001;
       f.horario = 0800f;
       f.área = " Professor";
       f.Cadastro();
    }
    
}