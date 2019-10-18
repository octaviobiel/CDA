
public class PruebaNodo {
	
	public static int cantidadDeElementos(ListaEnlazada listina){
		int contador = 0;
		Nodo pos = listina.getHead();
		while(pos != null) {
			contador++;
			pos = pos.getSig();
		}
		return contador;
	}
	
	public static Nodo insertarNodo(ListaEnlazada listina, Nodo nodin) {
		Nodo insertado = listina.getHead();
		nodin.setSig(null);
		if(insertado == null) {
			listina.setHead(nodin);
			} else { 
				while(insertado.getSig()!=null) {
					insertado = insertado.getSig();
				}
				insertado.setSig(nodin);
			}
		return insertado;
		}
		
	
	public static void main(String[] args) {
		
		ListaEnlazada listita = new ListaEnlazada();
		int pruebita;
		
		for(int i=0; i<4; i++) {
		Nodo nodito = new Nodo(i);
		listita.setTail(insertarNodo(listita, nodito));
		}
		
		System.out.println(cantidadDeElementos(listita));
	}

}
