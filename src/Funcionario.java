public class Funcionario {
    String nome;
    int idade;
    String cargo;
    boolean situacao = true; //(ativo/inativo)

    public boolean demitirFuncionario() {
        System.out.println(nome + " não faz mais parte da empresa.");
        return situacao = false;
    }

    public void pagarSalario() {
        if(situacao == true) {
            System.out.println("O salário do colaborador " + nome + " foi pago!");
        }
    }

    public int aniversaio(){
        return idade++;
    }

    public String trocarCargoFuncionario(String cargoNovo) {
        return cargo = cargoNovo;

    }

    public Funcionario(String nome, int idade, String cargo, boolean situacao) {
        this.nome =nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

}
