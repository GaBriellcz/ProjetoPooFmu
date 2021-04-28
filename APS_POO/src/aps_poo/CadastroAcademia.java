package aps_poo;

public class CadastroAcademia {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int cpf;
    protected int rg;
    protected String endereço;
    protected int telefone;
    protected String email;
    
    
    public void cadastrar(){
        System.out.println("------ Usuario Cadastrado com Sucesso! ------ \n");
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return   " Nome = " + nome +  "\n Idade = " + idade + " Anos" + "\n Sexo = " + sexo + "\n CPF = " + cpf + "\n RG = " + rg + "\n Endereço = " + endereço + "\n Telefone = " + telefone + "\n Email = " + email ;
    }
  
    
    
}
