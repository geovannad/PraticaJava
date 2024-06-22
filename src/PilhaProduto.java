public class PilhaProduto {


    private int topo;
    private Produto[] container;

    public PilhaProduto(int capacidade) {
        this.topo = -1;
        this.container = new Produto[capacidade];
    }

    //nome padrão, nome que todo mundo uso
    //add elemneto na pilha
    public boolean push(double preco, String nome, int codigo){
        if(this.topo + 1 == this.container.length){
            return false;
        }else{
            this.topo += 1;
            this.container[this.topo] = new Produto(codigo, nome, preco);
            return true;
        }
    }

    //remover elemento do topo
    // não precisa tirar um item do vetor, vc precisa so diminuir o tamanho do topo
    public Produto pop(){
        int temp = this.topo;
        this.topo--;
        return this.container[temp];
    }

    //retornar oq ta no topo
    public Produto peek(){
        return this.container[this.topo];
    }

    //verificar se a pilha está vazia
    public boolean isEmpty(){
        if(this.topo == -1){
            return true;
        }
        else{
            return false;
        }
    }



    //mostrar pilha
    public String toString(){
        String s = " ";
        for(int c = 0; c <= this.topo; c++){
            s += String.valueOf(this.container[c] + " ");
        }
        return "\n" + s;
    }
}
