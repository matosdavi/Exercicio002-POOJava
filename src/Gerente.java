public class Gerente extends Funcionario{

    int horasMais;
    int horasTrab;

    public int getHorasMais() {
        return horasMais;
    }

    public void setHorasMais(int horasMais) {
        this.horasMais = horasMais;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public int calcularHoras() {
        horasMais = horasTrab - 44;
        return horasMais;
    }
}