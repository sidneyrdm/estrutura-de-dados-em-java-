package lista.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoListaDuplamenteEncadeada<T> primeiroNo;
    private NoListaDuplamenteEncadeada<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    private NoListaDuplamenteEncadeada<T> getNo(int index){
        NoListaDuplamenteEncadeada<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoListaDuplamenteEncadeada novoNo = new NoListaDuplamenteEncadeada<>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setPrevioNo(ultimoNo);

        if(primeiroNo == null){
            primeiroNo = novoNo;
        }

        if(ultimoNo != null){
            ultimoNo.setProximoNo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
         NoListaDuplamenteEncadeada<T> noAuxiliar = getNo(index);
         NoListaDuplamenteEncadeada<T> novoNo = new NoListaDuplamenteEncadeada<>(elemento);
         novoNo.setProximoNo(noAuxiliar);


          if(novoNo.getProximoNo() != null){
              novoNo.setPrevioNo(noAuxiliar.getPrevioNo());
              novoNo.getProximoNo().setPrevioNo(novoNo);
          }else{
              novoNo.setPrevioNo(ultimoNo);
              ultimoNo = novoNo;
          }

          if(index == 0){
              primeiroNo = novoNo;
          }else{
              novoNo.getPrevioNo().setProximoNo(novoNo);
          }

          tamanhoLista++;

    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setPrevioNo(null);
            }
        }else{
            NoListaDuplamenteEncadeada<T> noAuxiliar = getNo(index);
            noAuxiliar.getPrevioNo().setProximoNo(noAuxiliar.getProximoNo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getProximoNo().setPrevioNo(noAuxiliar.getPrevioNo());
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoListaDuplamenteEncadeada<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < size(); i++) {
            stringRetorno+= "[No{conteudo=" + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringRetorno+= "null";
        return stringRetorno;
    }
}
