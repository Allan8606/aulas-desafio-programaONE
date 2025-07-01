import java.util.LinkedList;

public class ListaNinja <T>{

    private LinkedList<T> lista;

    public ListaNinja() {
        lista = new LinkedList<>();
    }



    public void adicionar(T item) {
        lista.add(item);
    }
    public void remover(T item) {
        lista.remove(item);
    }
    public void adicionarNoInicio(T item) {
        lista.addFirst(item);
    }
    public void adicionarNoFim(T item) {
        lista.addLast(item);
    }
    public void removerDoInicio() {
        if (!lista.isEmpty()) {
            lista.removeFirst();
        }
    }
    public void removerDoFim() {
        if (!lista.isEmpty()) {
            lista.removeLast();
        }
    }
    public void acessarItem(int index){
        System.out.println(lista.get(index));
    }
    public void mostrarItens(){
        for (T item : lista) {
            System.out.println(item);
        }
    }






    public LinkedList<T> getLista() {
        return lista;
    }

    public void setLista(LinkedList<T> lista) {
        this.lista = lista;
    }
}
