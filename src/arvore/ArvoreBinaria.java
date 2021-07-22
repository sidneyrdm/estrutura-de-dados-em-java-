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

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        this.exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(NoArvoreBinaria<T> atual) {
        if(atual != null){
            exibirInOrdem(atual.getNoEsquerdo());
            System.out.print(atual.getConteudo()+", ");
            exibirInOrdem(atual.getNoDireito());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        this.exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(NoArvoreBinaria<T> atual) {
        if(atual != null){
            exibirPosOrdem(atual.getNoEsquerdo());
            exibirPosOrdem(atual.getNoDireito());
            System.out.print(atual.getConteudo()+", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        this.exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(NoArvoreBinaria<T> atual) {
        if(atual != null){
            System.out.print(atual.getConteudo()+", ");
            exibirPreOrdem(atual.getNoEsquerdo());
            exibirPreOrdem(atual.getNoDireito());
        }
    }


    public void remover(T conteudo){

        try{
            NoArvoreBinaria<T> atual = this.raiz;
            NoArvoreBinaria<T> pai = null;
            NoArvoreBinaria<T> filho = null;
            NoArvoreBinaria<T> temporario = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                     atual = atual.getNoEsquerdo();
                }else{
                    atual = atual.getNoDireito();
                }

                if(atual == null){
                    System.out.println("Conteudo nao encontrado. Bloco Try");
                }

                if(pai == null){
                    if(atual.getNoDireito() == null){
                        this.raiz = atual.getNoEsquerdo();
                    }else if(atual.getNoEsquerdo() == null){
                        this.raiz = atual.getNoDireito();
                    }else{
                        for(temporario = atual, filho = atual.getNoEsquerdo();
                        filho.getNoDireito() != null;
                        temporario = filho, filho = filho.getNoEsquerdo()){
                            if(filho != atual.getNoEsquerdo()){
                                temporario.setNoDireito(filho.getNoEsquerdo());
                                filho.setNoEsquerdo(raiz.getNoEsquerdo());
                            }
                            filho.setNoDireito(raiz.getNoDireito());
                            raiz = filho;
                        }
                    }
                }else if(atual.getNoDireito() == null){
                    if(pai.getNoEsquerdo() == atual){
                        pai.setNoEsquerdo(atual.getNoEsquerdo());
                    }else{
                        pai.setNoDireito(atual.getNoEsquerdo());
                    }
                }
                else if(atual.getNoEsquerdo() == null){
                    if(pai.getNoEsquerdo() == atual){
                        pai.setNoEsquerdo(atual.getNoDireito());
                    }else{
                        pai.setNoDireito(atual.getNoDireito());
                    }
                }else{
                    for(
                            temporario = atual, filho = atual.getNoEsquerdo();
                            filho.getNoDireito() != null;
                            temporario = filho, filho = filho.getNoDireito()
                    ){
                        if(filho!= atual.getNoEsquerdo()){
                            temporario.setNoDireito(filho.getNoEsquerdo());
                            filho.setNoEsquerdo(filho.getNoEsquerdo());
                        }
                        filho.setNoDireito(atual.getNoDireito());
                        if(pai.getNoEsquerdo() == atual){
                            pai.setNoEsquerdo(filho);
                        }else{
                            pai.setNoDireito(filho);
                        }
                    }
                }


            }

        }catch(NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }

    }

}
