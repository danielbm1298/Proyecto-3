package sistema;
import java.util.Random;
public class TestDijkstra {
	
	    private Linked_List<Vertice> nodes;
	    private Linked_List<Arista> edges;

	    public void testExcute() {
	    	Random generador = new Random();
	        nodes = new Linked_List<Vertice>();
	        edges = new Linked_List<Arista>();
	        Vertice Vidriera = new Vertice("_1","Vidriera");
	        nodes.append(Vidriera);
	        Vertice Puente = new Vertice("_2","Puente de Taras");
	        nodes.append(Puente);
	        Vertice Taras = new Vertice("_3","Taras");
	        nodes.append(Taras);
	        Vertice Metrocentro = new Vertice("_4","Metrocentro");
	        nodes.append(Metrocentro);
	        Vertice Cementerio = new Vertice("_5","Cementerio");
	        nodes.append(Cementerio);
	        Vertice Padres = new Vertice("_6","Padres Salesianos");
	        nodes.append(Padres);
	        Vertice Figueres = new Vertice("_7","Figueres");
	        nodes.append(Figueres);
	        Vertice Fatima = new Vertice("_8","Fatima");
	        nodes.append(Fatima);
	        Vertice Mercado = new Vertice("_9","Mercado");
	        nodes.append(Mercado);
	        Vertice Jasec = new Vertice("_10","Jasec");
	        nodes.append(Jasec);
	        Vertice Ferreteria = new Vertice("_11","Ferreteria");
	        nodes.append(Ferreteria);
	        Vertice Biblioteca = new Vertice("_12","Biblioteca");
	        nodes.append(Biblioteca);
	        Vertice SanLuis = new Vertice("_13","San Luis");
	        nodes.append(SanLuis);
	        Vertice MOPT = new Vertice("_14","MOPT");
	        nodes.append(MOPT);
	        Vertice IMAS = new Vertice("_15","IMAS");
	        nodes.append(IMAS);
	        Vertice ICE = new Vertice("_16","ICE");
	        nodes.append(ICE);
	        Vertice Ruinas = new Vertice("_17","Ruinas");
	        nodes.append(Ruinas);
	        Vertice Estadio = new Vertice("_18","Estadio");
	        nodes.append(Estadio);
	        Vertice Carmen = new Vertice("_19","El Carmen");
	        nodes.append(Carmen);
	        Vertice Mini = new Vertice("_20","Mini super");
	        nodes.append(Mini);
	        Vertice Farmacia = new Vertice("_21","Farmacia");
	        nodes.append(Farmacia);
	        Vertice Banco = new Vertice("_22","Banco");
	        nodes.append(Banco);
	        Vertice Tribunales = new Vertice("_23","Tribunales");
	        nodes.append(Tribunales);
	        Vertice Sony = new Vertice("_24","Sony");
	        nodes.append(Sony);
	        Vertice SanRafael = new Vertice("_25","San Rafael");
	        nodes.append(SanRafael);
	        Vertice Pali = new Vertice("_26","Pali");
	        nodes.append(Pali);
	        Vertice Angeles = new Vertice("_27","Los Angeles");
	        nodes.append(Angeles);
	        Vertice Twins = new Vertice("_28","Twins");
	        nodes.append(Twins);
	        Vertice Residecias = new Vertice("_29","Residecias");
	        nodes.append(Residecias);
	        Vertice TEC = new Vertice("_30","TEC");
	        nodes.append(TEC);

	        //Conexiones
	        addLane("Edge_0", 0, 1, generador.nextInt(10));
	        addLane("Edge_1", 0, 6, generador.nextInt(10));
	        addLane("Edge_2", 1, 0, generador.nextInt(10));
	        addLane("Edge_3", 1, 7, generador.nextInt(10));
	        addLane("Edge_4", 1, 2, generador.nextInt(10));
	        addLane("Edge_5", 2, 1, generador.nextInt(10));
	        addLane("Edge_6", 2, 8, generador.nextInt(10));
	        addLane("Edge_7", 2, 3, generador.nextInt(10));
	        addLane("Edge_8", 3, 2, generador.nextInt(10));
	        addLane("Edge_9", 3, 9, generador.nextInt(10));
	        addLane("Edge_10", 3, 4, generador.nextInt(10));
	        addLane("Edge_11", 4, 3, generador.nextInt(10));
	        addLane("Edge_12", 4, 11, generador.nextInt(10));
	        addLane("Edge_13", 4, 5, generador.nextInt(10));
	        addLane("Edge_14", 5, 4, generador.nextInt(10));
	        addLane("Edge_15", 5, 11, generador.nextInt(10));
	        addLane("Edge_16", 5, 12, generador.nextInt(10));
	        addLane("Edge_17", 6, 0, generador.nextInt(10));
	        addLane("Edge_18", 6, 7, generador.nextInt(10));
	        addLane("Edge_19", 6, 13, generador.nextInt(10));
	        addLane("Edge_20", 7, 1, generador.nextInt(10));
	        addLane("Edge_21", 7, 6, generador.nextInt(10));
	        addLane("Edge_22", 7, 8, generador.nextInt(10));
	        addLane("Edge_23", 7, 13, generador.nextInt(10));
	        addLane("Edge_24", 8, 2, generador.nextInt(10));
	        addLane("Edge_25", 8, 7, generador.nextInt(10));
	        addLane("Edge_26", 8, 14, generador.nextInt(10));
	        addLane("Edge_27", 8, 9, generador.nextInt(10));
	        addLane("Edge_28", 9, 3, generador.nextInt(10));
	        addLane("Edge_29", 9, 8, generador.nextInt(10));
	        addLane("Edge_30", 9, 15, generador.nextInt(10));
	        addLane("Edge_31", 9, 10, generador.nextInt(10));
	        addLane("Edge_32", 10, 3, generador.nextInt(10));
	        addLane("Edge_33", 10, 9, generador.nextInt(10));
	        addLane("Edge_34", 10, 11, generador.nextInt(10));
	        addLane("Edge_35", 10, 16, generador.nextInt(10));
	        addLane("Edge_36", 11, 5, generador.nextInt(10));
	        addLane("Edge_37", 11, 11, generador.nextInt(10));
	        addLane("Edge_38", 11, 17, generador.nextInt(10));
	        addLane("Edge_39", 11, 10, generador.nextInt(10));
	        addLane("Edge_40", 12, 5, generador.nextInt(10));
	        addLane("Edge_41", 12, 11, generador.nextInt(10));
	        addLane("Edge_42", 12, 17, generador.nextInt(10));
	        addLane("Edge_43", 13, 7, generador.nextInt(10));
	        addLane("Edge_44", 13, 6, generador.nextInt(10));
	        addLane("Edge_45", 13, 18, generador.nextInt(10));
	        addLane("Edge_46", 14, 8, generador.nextInt(10));
	        addLane("Edge_47", 14, 18, generador.nextInt(10));
	        addLane("Edge_48", 14, 19, generador.nextInt(10));
	        addLane("Edge_49", 15, 9, generador.nextInt(10));
	        addLane("Edge_50", 15, 16, generador.nextInt(10));
	        addLane("Edge_51", 15, 20, generador.nextInt(10));
	        addLane("Edge_52", 15, 14, generador.nextInt(10));
	        addLane("Edge_53", 16, 10, generador.nextInt(10));
	        addLane("Edge_54", 16, 15, generador.nextInt(10));
	        addLane("Edge_55", 16, 21, generador.nextInt(10));
	        addLane("Edge_56", 16, 17, generador.nextInt(10));
	        addLane("Edge_57", 17, 11, generador.nextInt(10));
	        addLane("Edge_58", 17, 12, generador.nextInt(10));
	        addLane("Edge_59", 17, 23, generador.nextInt(10));
	        addLane("Edge_60", 18, 13, generador.nextInt(10));
	        addLane("Edge_61", 18, 14, generador.nextInt(10));
	        addLane("Edge_62", 18, 24, generador.nextInt(10));
	        addLane("Edge_63", 19, 14, generador.nextInt(10));
	        addLane("Edge_64", 19, 18, generador.nextInt(10));
	        addLane("Edge_65", 19, 25, generador.nextInt(10));
	        addLane("Edge_66", 19, 20, generador.nextInt(10));
	        addLane("Edge_67", 20, 15, generador.nextInt(10));
	        addLane("Edge_68", 20, 19, generador.nextInt(10));
	        addLane("Edge_69", 20, 26, generador.nextInt(10));
	        addLane("Edge_70", 20, 21, generador.nextInt(10));
	        addLane("Edge_71", 21, 16, generador.nextInt(10));
	        addLane("Edge_72", 21, 20, generador.nextInt(10));
	        addLane("Edge_73", 21, 27, generador.nextInt(10));
	        addLane("Edge_74", 21, 22, generador.nextInt(10));
	        addLane("Edge_75", 22, 16, generador.nextInt(10));
	        addLane("Edge_76", 22, 21, generador.nextInt(10));
	        addLane("Edge_77", 22, 28, generador.nextInt(10));
	        addLane("Edge_78", 22, 23, generador.nextInt(10));
	        addLane("Edge_79", 23, 17, generador.nextInt(10));
	        addLane("Edge_80", 23, 22, generador.nextInt(10));
	        addLane("Edge_81", 23, 29, generador.nextInt(10));
	        addLane("Edge_82", 24, 18, generador.nextInt(10));
	        addLane("Edge_83", 24, 25, generador.nextInt(10));
	        addLane("Edge_84", 25, 19, generador.nextInt(10));
	        addLane("Edge_85", 25, 24, generador.nextInt(10));
	        addLane("Edge_86", 25, 26, generador.nextInt(10));
	        addLane("Edge_87", 26, 27, generador.nextInt(10));
	        addLane("Edge_88", 26, 20, generador.nextInt(10));
	        addLane("Edge_89", 26, 25, generador.nextInt(10));
	        addLane("Edge_87", 26, 27, generador.nextInt(10));
	        addLane("Edge_88", 26, 20, generador.nextInt(10));
	        addLane("Edge_89", 26, 25, generador.nextInt(10));
	        addLane("Edge_93", 28, 10, generador.nextInt(10));
	        addLane("Edge_94", 28, 10, generador.nextInt(10));
	        addLane("Edge_95", 28, 10, generador.nextInt(10));
	        //Lista Conductores
	        
	        Conductor JuanCon=new Conductor("Juan",201864475,7,nodes.getNode(21).getData());     
	        Conductor DanielCon=new Conductor("Daniel",2018227475,12,nodes.getNode(7).getData());
	        Conductor PedroCon=new Conductor("Pedro",201848793,5,nodes.getNode(9).getData());
	        Conductor ArmandoCon=new Conductor("Armando",201878127,2,nodes.getNode(14).getData());
	        Conductor MelissaCon=new Conductor("Melissa",201878934,16,nodes.getNode(24).getData());
	        Conductor HugoCon=new Conductor("Hugo",201789314,16,nodes.getNode(9).getData());
	        Conductor IanCon=new Conductor("Ian",201842301,20,nodes.getNode(7).getData());
	        Conductor FranciscoCon=new Conductor("Francisco",201879830,5,nodes.getNode(5).getData());
	        Conductor BrandonCon=new Conductor("Brandon",201876824,8,nodes.getNode(18).getData());
	        Conductor JenniferCon=new Conductor("Jennifer",201878935,14,nodes.getNode(23).getData());
	        Linked_List<Conductor> conductores= new Linked_List();

	        conductores.append(JuanCon);
	        conductores.append(DanielCon);
	        conductores.append(PedroCon);
	        conductores.append(ArmandoCon);
	        conductores.append(MelissaCon);
	        conductores.append(HugoCon);
	        conductores.append(IanCon);
	        conductores.append(FranciscoCon);
	        conductores.append(BrandonCon);
	        conductores.append(JenniferCon);
	        
	        conductores=top5(conductores);
	        
	        //Lista Estudiantes
	        Estudiante Oscar=new Estudiante("Oscar", 201899546, nodes.getNode(28).getData());
	        Estudiante Armando=new Estudiante("Armando", 201848763, nodes.getNode(27).getData());
	        Estudiante Manuel=new Estudiante("Manuel", 201897894, nodes.getNode(17).getData());
	        Estudiante Cristan=new Estudiante("Cristian", 201875345, nodes.getNode(15).getData());
	        Linked_List<Estudiante> estudiantes=new Linked_List();
	        estudiantes.append(Oscar);
	        estudiantes.append(Armando);
	        estudiantes.append(Manuel);
	        estudiantes.append(Cristan);

	       
	        // Pruebas
	        Grafo graph = new Grafo(nodes, edges);
	        Dijkstra dijkstra = new Dijkstra(graph);
	        
	        Linked_List listaamigos=new Linked_List();
	        Estudiante Andrey=new Estudiante("Andrey",201759634,nodes.getNode(15).getData());
	        listaamigos.append(JuanCon);
	        Conductor conductor1=new Conductor("Hector",201864475,7,nodes.getNode(21).getData());
	        Andrey.setAmigos_conduc(listaamigos);
	        conductor1.setPosicion(nodes.getNode(21).getData());
	        Linked_List<Vertice> path=est_pasarp_amigo(Andrey, dijkstra);
	        //Pruebas top 5


	        

	        
	        //conductores.QuickSort(conductores, 0, conductores.getLenght()-1);
	        //Imprime el top 5
	        System.out.println("el top 5 de conductores es");
	        for (int i=0;i<4;i++) {
	        	
	        	System.out.println(conductores.getNode(i).getData().getNom()+" con "+conductores.getNode(i).getData().getCant_viajes()+" viajes");
	        }   
	        
	        int distotal=dijkstra.DistanciaTotal(path, dijkstra);
	        //int distotal=dijkstra.getDistance(path.getNode(1).getData(), path.getNode(2).getData());
	        System.out.println(distotal);

	        for (int i=0; i<path.getLenght(); i++) {
	        	String tipo=path.getNode(i).getData().getClass().getSimpleName();
	        	if ("Vertice".equals(tipo)) {
		        	String vertex=path.getNode(i).getData().getname();
		            System.out.println(vertex);
	        	}else {
	        		System.out.println("pasa por");

	        	}
	        }
	        
	        
	    }
	    private void addLane(String laneId, int sourceLocNo, int destLocNo,
	            int duration) {
	        Arista lane = new Arista(laneId,nodes.getNode(sourceLocNo).getData(), nodes.getNode(destLocNo).getData(), duration );
	        edges.append(lane);
	    }
	    //FUNCIONES DE CARPOOLING PARA CONDUCTOR    
	    //Funcion que permite que un conductor pase por un amigo AA
	    public Linked_List<Vertice> cond_pasarp_amigo(Conductor conduc,Dijkstra dijkstra) {
	    	Estudiante estudiante=conduc.getAmigos_est().getNode(0).getData();
	    	Vertice pos=estudiante.getPosicion();
	    	Linked_List camino1=dijkstra.caminocorto(conduc.getPosicion(),pos);
	    	Vertice amigo= new Vertice("","");
	    	amigo.SetName("Pasa por "+estudiante.getNombre());
	    	camino1.append(amigo);
	    	Linked_List<Vertice> camino2=dijkstra.caminocorto(pos,nodes.getNode(29).getData());
	    	for (int i=1;i<camino2.getLenght();i++) {
	    		camino1.append(camino2.getNode(i).getData());
	    	}
	    	return camino1;
	    }
	    //Funcion que le permite a un conductor hacer un viaje sin desvios y recoger a un estudiante AA
	    public Linked_List<Vertice> sin_desv(Conductor conduc,Linked_List<Estudiante> est_totales,Dijkstra dijkstra){
	    	Linked_List camino=dijkstra.caminocorto(conduc.getPosicion(),nodes.getNode(29).getData());
	    	for (int i=0;i<camino.getLenght();i++) {
	    		for(int j=0;j<est_totales.getLenght();j++) {
	    			if (camino.getNode(i).getData()==est_totales.getNode(j).getData().getPosicion()) {
	    				Vertice pasa =new Vertice("","");
	    				pasa.SetName("Pasando por "+est_totales.getNode(j).getData().getNombre());
	    				camino.append(pasa);

	    			}
	    		}
	    	}
	    	return camino;
	    	
	    }
	    //FUNCIONES DE CARPOOLING PARA ESTUDIANTE
	    //Funcion que permite que un amigo de un estudiante pase por el AA
	    public Linked_List<Vertice> est_pasarp_amigo(Estudiante estudiant,Dijkstra dijkstra) {
	    	Conductor conductor=estudiant.getAmigos_conduc().getNode(0).getData();
	    	Vertice pos=conductor.getPosicion();
	    	Linked_List camino1=dijkstra.caminocorto(pos,estudiant.getPosicion());
	    	Vertice amigo= new Vertice("","");
	    	amigo.SetName("Te recoge "+estudiant.getNombre());
	    	camino1.append(amigo);
	    	Linked_List<Vertice> camino2=dijkstra.caminocorto(estudiant.getPosicion(),nodes.getNode(29).getData());
	    	for (int i=1;i<camino2.getLenght();i++) {
	    		camino1.append(camino2.getNode(i).getData());
	    	}
	    	camino1=choque(camino1);
	    	return camino1;
	    }
	    
	    
	    
	    public Linked_List<Conductor> top5(Linked_List<Conductor> lista){
	    	lista.QuickSort(lista,0, lista.getLenght()-1);
	    	lista=lista.reverse(lista);
	    	Linked_List<Conductor> lista2= new Linked_List<Conductor>();
	    	for (int i=0;i<5;i++){
	    		lista2.append(lista.getNode(i).getData());
	    	}
	    	return lista2;
	    	
	    	
	    }
	    public void agregar_amigo(Conductor conduc,int carne,Linked_List<Conductor> conductores) {
	    	for (int i=0;i>conductores.getLenght()-1;i++) {
	    		if (conductores.getNode(i).getData().getCarne()==carne) {
	    			conduc.getAmigos_cond().append(conductores.getNode(i).getData());
	    			conduc.setAmigos_cond(conduc.getAmigos_cond());
	    			return;
	    			
	    			
	    		}
	    	}
	    }
	    public Linked_List<Vertice> choque(Linked_List<Vertice> lista) {
	    	System.out.println("entro");
	    	Random generador = new Random();
	    	int numero=generador.nextInt(2);
    		Linked_List<Vertice> lista2=new Linked_List();


	    	if (numero==1) {
	    		System.out.println("choco");
	    	//lista=lista.reverse(lista);
	    	for(int i=0;i<lista.getLenght();i++) {
	    		if (i==lista.getLenght()-3) {
	    	    	System.out.println("si llega al penul");

	    			Vertice choque=new Vertice("","");
	    			choque.SetName("Hay un choque cercade "+lista.getNode(lista.getLenght()-3).getData().getname()+" ,se redirecciona la ruta");
	    			lista2.append(choque);
	    			lista2.append(lista.getNode(i+1).getData());
	    			i++;
	    		}else {
	    	lista2.append(lista.getNode(i).getData());;
	    
	    	}
	    	}
	    	System.out.println(lista2.getLenght());
	    	return lista2;
	    }else {
			return lista;
	    }
	    }
	    
	
	public static void main(String args[]) {
		TestDijkstra prueb=new TestDijkstra();
		prueb.testExcute();
	
	}
}
