package lista.listaCircular;

public class ListaCircular<T> {

    private NoListaCircular<T> cabeca;
    private NoListaCircular<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    private NoListaCircular<T> getNo(int index){
        if(this.isEmpty()) throw  new IndexOutOfBoundsException("A lista está vazia!");
        if(index == 0){
            return this.cauda;
        }
        NoListaCircular<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void remove(int index){
        if(index >= this.tamanhoLista) throw new IndexOutOfBoundsException("O índice informado é maior do que o tamanho da lista");

        NoListaCircular<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cauda.setProximoNo(this.cauda);
        }else if(index == 1){
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        }else{
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo){
        NoListaCircular<T> novoNo = new NoListaCircular<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(cauda);
        }else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoListaCircular<T> noAuxiliar = this.cauda;

        for (int i = 0; i < this.size(); i++) {
            stringRetorno+= "[No{conteudo="+ noAuxiliar.getConteudo()+"}]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringRetorno+= this.size() != 0 ? "(Retorna ao início)" : "[]";

        return stringRetorno;
    }
}
