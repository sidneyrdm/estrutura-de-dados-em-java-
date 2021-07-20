package arvore;

public class ArvoreBinaria<T extends Comparable<T>> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo){
        NoArvoreBinaria<T> novoNo = new NoArvoreBinaria<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private NoArvoreBinaria<T> inserir(NoArvoreBinaria<T> atual, NoArvoreBinaria<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsquerdo(inserir(atual.getNoEsquerdo(), novoNo));
        }else{
            atual.setNoDireito(inserir(atual.getNoDireito(), novoNo));
        }
        return atual;
    }
}
