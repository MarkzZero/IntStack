package Pilha;

public class Pilha {
	No topo;
	
	public Pilha() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int e) {
	    No novo = new No();
	    novo.dado = e;
	    novo.proximo = topo;
	    topo = novo;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos para desempilhar.");
		}
		
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Não há elementos na pilha.");
		}
		
		int valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int i = 0;
		if(isEmpty()) {
			No auxiliar = topo;
			i = 1;
			while(auxiliar.proximo != null) {
				i = i++;
				auxiliar = auxiliar.proximo;
			}
		}
		return i;
	}
	
	public int max() throws Exception {
	    if (isEmpty()) {
	        throw new Exception("Pilha vazia");
	    }

	    Pilha auxiliar = new Pilha();
	    int max = Integer.MIN_VALUE;

	    while (!isEmpty()) {
	        int valor = this.pop();
	        if (valor > max) {
	            max = valor;
	        }
	        auxiliar.push(valor);
	    }

	    while (!auxiliar.isEmpty()) {
	        this.push(auxiliar.pop());
	    }

	    return max;
	}
	

}
