package listaligada;

public class Celula {
    private Object elemento;
    private Celula anterior;
    private Celula proximo;

    public Celula(Object elemento) {
        this(elemento, null);
    }
    public Celula(Object elemento, Celula proxima) {
        this.elemento = elemento;
        this.proximo = proxima;
    }

    public Celula  getAnterior(){
        return anterior;
    }
    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula  proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }
}
