package pilha;

public class NoPilha {

    private int dado;
    private NoPilha RefNo = null;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getRefNo() {
        return RefNo;
    }

    public void setRefNo(NoPilha refNo) {
        this.RefNo = refNo;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
