public class Administrativo extends Funcionario {

    private int horasTrab;
    private int horasExt;
    private int valorHora;

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public int getHorasExt() {
        return horasExt;
    }

    public void setHorasExt(int horasExt) {
        this.horasExt = horasExt;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    public int calcularSalario() {
        int salario;
        salario = (horasTrab * valorHora) + (horasExt * valorHora);
        return salario;
    }
}