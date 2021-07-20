package arvore;

public class NoArvoreBinaria<T extends Comparable<T>> {

    private T conteudo;
    private NoArvoreBinaria<T> noEsquerdo;
    private NoArvoreBinaria<T> noDireito;

    public NoArvoreBinaria(T conteudo) {
        noEsquerdo = null;
        noDireito = null;
        this.conteudo = conteudo;
    }

    public NoArvoreBinaria() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoArvoreBinaria<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoArvoreBinaria<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoArvoreBinaria<T> getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(NoArvoreBinaria<T> noDireito) {
        this.noDireito = noDireito;
    }

    @Override
    public String toString() {
        return "NoArvoreBinaria{" +
                "conteudo=" + conteudo +
                '}';
    }
}

