import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int op=0;
        while (op !=4){
            System.out.println("Qual opção você deseja?");
            System.out.println("1- Gerente\n2-Administrativo\n3- Estagiário\n4- Sair");
            op = Integer.parseInt(entrada.nextLine());
        }
        if (op == 1) {
            Gerente g = new Gerente();
            System.out.println("Informe o nome do Gerente: ");
            g.setNome(entrada.nextLine());
            System.out.println("Informe o bairro do Gerente: ");
            g.setBairro(entrada.nextLine());
            System.out.println("Informe a idade do Gerente: ");
            g.setIdade(Integer.parseInt(entrada.nextLine()));
            System.out.println("Informe quantas horas foram trabalhadas: ");
            g.setHorasTrab(Integer.parseInt(entrada.nextLine()));
            System.out.println("Informe quantas horas extras foram trabalhadas: ");
            g.setHorasMais(Integer.parseInt(entrada.nextLine()));

            System.out.println("Funcionário: " + g.getNome() + "\nHoras trabalhadas a mais: " + g.calcularHoras());
        } else if (op == 2) {
            Administrativo adm = new Administrativo();
            System.out.println("Informe o nome do Administrador: ");
            adm.setNome(entrada.nextLine());
            System.out.println("Informe o bairro do Administrador: ");
            adm.setBairro(entrada.nextLine());
            System.out.println("Informe a idade do Administrador: ");
            adm.setIdade(Integer.parseInt(entrada.nextLine()));
            System.out.println("Informe quantas horas foram trabalhadas: ");
            adm.setHorasTrab(Integer.parseInt(entrada.nextLine()));
            System.out.println("Informe quantas horas extras foram trabalhadas: ");
            adm.setHorasExt(Integer.parseInt(entrada.nextLine()));
            System.out.println("Informe o valor da hora: ");
            adm.setHorasExt(Integer.parseInt(entrada.nextLine()));

            System.out.println("Funcionário: " + adm.getNome() + "\nSalário: " + adm.calcularSalario());

        } else if (op == 3) {
            Estagiario e = new Estagiario();
            System.out.println("Informe o nome do Estagiário: ");
            e.setNome(entrada.nextLine());
            System.out.println("Informe o bairro do Estagiário: ");
            e.setBairro(entrada.nextLine());
            System.out.println("Informe a idade do Estagiário: ");
            e.setIdade(Integer.parseInt(entrada.nextLine()));
            System.out.println("Informe quantas horas foram estagiadas: ");
            e.setHorasEst(Integer.parseInt(entrada.nextLine()));
            System.out.println("Informe quantos meses foram estagiados: ");
            e.setMesesEst(entrada.nextInt());

            System.out.println("Funcionário: " + e.getNome() + "\nTotal de horas: " + e.calcularHorasEst());
        } else if (op == 4){
            System.out.println("Encerrando o programa.");
        } else {
            System.out.println("Insira uma opção válida.");
        }
    }
}