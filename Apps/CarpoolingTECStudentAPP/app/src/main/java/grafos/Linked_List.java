package grafos;


public class Linked_List<T> {
private Node<T> root;
private int lenght = 0;

public Node<T> getRoot() {
 return root;
}
public void setRoot(Node<T> root) {
 this.root = root;
}
public int getLenght() {
 return lenght;
}
public void setLenght(int lenght) {
 this.lenght = lenght;
}
public void append(T new_data) {
 Node<T> new_node = new Node<T>(new_data);
 if(root == null) {
  root = new_node;
  root.setNext(null);
  ++this.lenght;
  return;
 }
 Node<T> last = root;
 while(last.getNext() != null) {
  last = last.getNext();
 }
 new_node.setNext(null);
 last.setNext(new_node);
 ++this.lenght;
 return;
}
public void printList() {
 Node<T> n = root;
 for(int i = 0 ; i<this.lenght;i++) {
  System.out.println(n.getData());
  n = n.getNext();
 }
}
public Node<T> getNode(int n){
 Node<T> current = this.root;
 int counter = 0;
 while(counter != n) {
  current = current.getNext();
  ++counter;
 }
 return current;
}
public void delete(int n) {
 Node<T> temp = root;
 if (lenght==1) {
  root=null;
 }
 else{
  
 if (n>=lenght) {
  throw new IllegalArgumentException("Error");
 }
 else {
  if (n==0) {
   root = root.getNext();
   lenght = lenght-1;
  }
  else {
   if (n==lenght-1) {
    int counter=0;
    while(counter!=n-1) {
     temp= temp.getNext();
     counter+=1;
    }
    temp.setNext(null);
    lenght = lenght-1;
   }
   else {
     int counter=0;
     while(counter != n-1) {
      temp = temp.getNext();
      counter+=1;
     }
     temp.setNext(temp.getNext().getNext());
     lenght = lenght-1;
    }
   }

  }
 }
 }

 
public boolean contains(Linked_List conex, Linked_List listaconex) {
            Linked_List conexx = new Linked_List();
 for(int i = 0; i < listaconex.lenght; i++) {
  if(conexx.isequal(conex, listaconex)) {
   return true;
  }
 }
 return false;
}

        public void interseccion(Linked_List lista1,Linked_List lista2,Linked_List lista3){
                Node temp1 =  null;
                temp1 = lista1.root;
                while (temp1.getNext() != null){
                    if (contains((Linked_List) temp1.getData(),lista2)){
                        lista3.append(temp1.getData());
                        temp1 = temp1.getNext();
                    }else{
                        temp1 = temp1.getNext();
                    }
                        
                }return ;
        }
        public boolean isequal(Linked_List conex1, Linked_List conex2){
            if ((conex1.getNode(0).getData() == conex2.getNode(0).getData()) &&(conex1.getNode(1).getData() == conex2.getNode(1).getData())){
                return true;
            }else{ if((conex1.getNode(0).getData() == conex2.getNode(1).getData()) &&(conex1.getNode(1).getData() == conex2.getNode(0).getData())){
                return true;
            }else{
                return false;
            }
            
                
            }
            
            
        }
        public Linked_List reverse(Linked_List lista) {
        	Linked_List lista2=new Linked_List();
        	for (int i=lista.getLenght()-1; i>=0; i--) {
        		lista2.append(lista.getNode(i).getData());
        		
        	}
        	return lista2;
        	
        }
        public void QuickSort(Linked_List<Conductor> arr, int low, int high) 
        { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            QuickSort(arr, low, pi-1); 
            QuickSort(arr, pi+1, high); 
        } 
    }
        int partition(Linked_List<Conductor> arr, int low, int high) 
        { 
            int pivot = arr.getNode(high).getData().getCant_viajes();  
            int i = (low-1); // index of smaller element 
            for (int j=low; j<high; j++) 
            { 
                // If current element is smaller than or 
                // equal to pivot 
                if (arr.getNode(j).getData().getCant_viajes() <= pivot) 
                { 
                    i++; 
      
                    // swap arr[i] and arr[j] 
                    switchCond(arr, i, j);
                } 
            } 
      
            // swap arr[i+1] and arr[high] (or pivot) 
            switchCond(arr, i+1, high);
            
      
            return i+1; 
        }
public Linked_List<Conductor> switchCond(Linked_List<Conductor> lista,int a,int b) {
            
            Conductor conduc1 = lista.getNode(a).getData();
            Conductor conduc2 = lista.getNode(b).getData();
            Vertice vert=new Vertice("a","b");
            Conductor temp = new Conductor("Juan",1,201864475,vert);
            temp.setNom(conduc1.getNom());
            temp.setCant_viajes(conduc1.getCant_viajes());
            
           
            
            
            lista.append(temp);
                                 
            conduc1.setNom(conduc2.getNom());
            conduc1.setCant_viajes(conduc2.getCant_viajes());
            
            conduc2.setNom(temp.getNom());
            conduc2.setCant_viajes(temp.getCant_viajes());
            
            lista.delete(lista.getLenght()-1);

            return lista;
        } 
        
}