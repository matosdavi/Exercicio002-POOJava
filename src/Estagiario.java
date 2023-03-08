public class Estagiario extends Funcionario {

    private int horasEst;
    private int mesesEst;

    public int getHorasEst() {
        return horasEst;
    }

    public void setHorasEst(int horasEst) {
        this.horasEst = horasEst;
    }

    public int getMesesEst() {
        return mesesEst;
    }

    public void setMesesEst(int mesesEst) {
        this.mesesEst = mesesEst;
    }
    public int calcularHorasEst() {
        int totalHoras = horasEst * mesesEst;
        return totalHoras;
    }
}