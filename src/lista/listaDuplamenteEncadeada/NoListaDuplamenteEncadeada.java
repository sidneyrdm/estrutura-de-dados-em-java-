package lista.listaDuplamenteEncadeada;

public class NoListaDuplamenteEncadeada<T> {

    private T conteudo;
    private NoListaDuplamenteEncadeada<T> proximoNo;
    private NoListaDuplamenteEncadeada<T> previoNo;

    public NoListaDuplamenteEncadeada(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaDuplamenteEncadeada<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListaDuplamenteEncadeada<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoListaDuplamenteEncadeada<T> getPrevioNo() {
        return previoNo;
    }

    public void setPrevioNo(NoListaDuplamenteEncadeada<T> previoNo) {
        this.previoNo = previoNo;
    }

    @Override
    public String toString() {
        return "NoListaDuplamenteEncadeada{" +
                "conteudo=" + conteudo +
                '}';
    }
}
