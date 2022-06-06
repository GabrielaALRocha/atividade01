public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos",24, "Atendente",true);
        Funcionario f2 = new Funcionario("Maria",22, "Atendente",true);
        Funcionario f3 = new Funcionario("João",30, "Supervisor",true);
        Funcionario f4 = new Funcionario("Magali",27, "Gerente",true);

        f1.demitirFuncionario();

        f2.trocarCargoFuncionario("Supervisor");
        System.out.println(f2.getNome() + " foi promovida(o) para " + f2.getCargo());
        f3.aniversaio();
        System.out.println(f3.getIdade());
        f4.pagarSalario();


    }
}
