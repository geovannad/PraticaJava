public class PilhaEstatica {


    private int topo;
    private double[] container;

    public PilhaEstatica(int capacidade) {
        this.topo = -1;
        this.container = new double[capacidade];
    }

    //nome padrão, nome que todo mundo uso
    //add elemneto na pilha
    public boolean push(double x){
        if(this.topo + 1 == container.length){
            return false;
        }else{
            this.topo += 1;
            this.container[this.topo] = x;
            return true;
        }
    }

    //remover elemento do topo
    // não precisa tirar um item do vetor, vc precisa so diminuir o tamanho do topo
    public double pop(){
        int temp = this.topo;
        this.topo--;
        return this.container[temp];
    }

    //retornar oq ta no topo
    public double peek(){
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
        return s;
    }

}
