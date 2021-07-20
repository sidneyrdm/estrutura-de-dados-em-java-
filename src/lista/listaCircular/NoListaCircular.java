package lista.listaCircular;

public class NoListaCircular<T> {

    private T conteudo;
    private NoListaCircular<T> proximoNo;

    public NoListaCircular(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaCircular<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListaCircular<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoListaCircular{" +
                "conteudo=" + conteudo +
                '}';
    }
}
