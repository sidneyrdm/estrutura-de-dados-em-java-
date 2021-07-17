package lista.listaEncadeada;

public class ListaEncadeada<T> {
    NoLista<T> refEntrada;
    public ListaEncadeada(){
       this.refEntrada = null;
    }
    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }

    public int size(){
        int tamanhoLista = 0;
        NoLista<T> refAuxiliar = refEntrada;
        while (true){
            if(refAuxiliar != null){
                tamanhoLista++;
                if(refAuxiliar.getProximoNo() != null){
                    refAuxiliar = refAuxiliar.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo){
        NoLista<T> novoNo = new NoLista<>(conteudo);
         if(this.isEmpty()){
             refEntrada = novoNo;
             return;
         }
         NoLista<T> noAuxiliar = refEntrada;
         for(int i = 0; i < this.size() -1; i++){
             noAuxiliar = noAuxiliar.getProximoNo();
         }
         noAuxiliar.setProximoNo((novoNo));
    }


    private NoLista<T> getNoLista(int index){
        validaIndice(index);
        NoLista<T> noAuxiliar = refEntrada;
        NoLista<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index){
        if(index >= size()) {
            throw new IndexOutOfBoundsException
                    ("Não existe conteúdo no Indice "+index+" desta lista, " +
                            "esta lista só vai até o Indice "+(size() - 1)+".");
        }
    }

    public T get(int index){
        return getNoLista(index).getConteudo();
    }

    public T remove(int index){
        NoLista<T> noPivor = this.getNoLista(index);
        if(index == 0){
            refEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        NoLista<T> noAnterior = getNoLista(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }


    @Override
    public String toString() {
        String stringRetorno = "";

        NoLista<T> noAuxiliar = refEntrada;
        for(int i = 0; i < this.size(); i++){
            stringRetorno+= "[No{Conteudo=" +noAuxiliar.getConteudo()+"}]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringRetorno+= "null";


       return stringRetorno;
    }
}
