package sistema;
import java.util.Random;
public class TestDijkstra {
	
	    private Linked_List<Vertice> nodes;
	    private Linked_List<Arista> edges;

	    public void testExcute() {
	    	Random generador = new Random();
	        nodes = new Linked_List<Vertice>();
	        edges = new Linked_List<Arista>();
	        Vertice Vidriera = new Vertice("1","Vidriera");
	        nodes.append(Vidriera);
	        Vertice Puente = new Vertice("2","Puente de Taras");
	        nodes.append(Puente);
	        Vertice Taras = new Vertice("3","Taras");
	        nodes.append(Taras);
	        Vertice Metrocentro = new Vertice("4","Metrocentro");
	        nodes.append(Metrocentro);
	        Vertice Cementerio = new Vertice("5","Cementerio");
	        nodes.append(Cementerio);
	        Vertice Padres = new Vertice("6","Padres Salesianos");
	        nodes.append(Padres);
	        Vertice Figueres = new Vertice("7","Figueres");
	        nodes.append(Figueres);
	        Vertice Fatima = new Vertice("8","Fatima");
	        nodes.append(Fatima);
	        Vertice Mercado = new Vertice("9","Mercado");
	        nodes.append(Mercado);
	        Vertice Jasec = new Vertice("10","Jasec");
	        nodes.append(Jasec);
	        Vertice Ferreteria = new Vertice("11","Ferreteria");
	        nodes.append(Ferreteria);
	        Vertice Biblioteca = new Vertice("12","Biblioteca");
	        nodes.append(Biblioteca);
	        Vertice SanLuis = new Vertice("13","San Luis");
	        nodes.append(SanLuis);
	        Vertice MOPT = new Vertice("14","MOPT");
	        nodes.append(MOPT);
	        Vertice IMAS = new Vertice("15","IMAS");
	        nodes.append(IMAS);
	        Vertice ICE = new Vertice("16","ICE");
	        nodes.append(ICE);
	        Vertice Ruinas = new Vertice("17","Ruinas");
	        nodes.append(Ruinas);
	        Vertice Estadio = new Vertice("18","Estadio");
	        nodes.append(Estadio);
	        Vertice Carmen = new Vertice("19","El Carmen");
	        nodes.append(Carmen);
	        Vertice Mini = new Vertice("20","Mini super");
	        nodes.append(Mini);
	        Vertice Farmacia = new Vertice("21","Farmacia");
	        nodes.append(Farmacia);
	        Vertice Banco = new Vertice("22","Banco");
	        nodes.append(Banco);
	        Vertice Tribunales = new Vertice("23","Tribunales");
	        nodes.append(Tribunales);
	        Vertice Sony = new Vertice("24","Sony");
	        nodes.append(Sony);
	        Vertice SanRafael = new Vertice("25","San Rafael");
	        nodes.append(SanRafael);
	        Vertice Pali = new Vertice("26","Pali");
	        nodes.append(Pali);
	        Vertice Angeles = new Vertice("27","Los Angeles");
	        nodes.append(Angeles);
	        Vertice Twins = new Vertice("28","Twins");
	        nodes.append(Twins);
	        Vertice Residecias = new Vertice("29","Residecias");
	        nodes.append(Residecias);
	        Vertice TEC = new Vertice("30","TEC");
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

	        // Lets check from location Loc_1 to Loc_10
	        Grafo graph = new Grafo(nodes, edges);
	        Dijkstra dijkstra = new Dijkstra(graph);
	        
	        Linked_List listaamigos=new Linked_List();
	        Estudiante est1=new Estudiante();
	        est1.setPosicion(nodes.getNode(17).getData());
	        listaamigos.append(est1);
	        Conductor conductor1=new Conductor();
	        conductor1.setAmigos_est(listaamigos);
	        conductor1.setPosicion(nodes.getNode(0).getData());
	        Linked_List<Vertice> path=pasarp_amigo(conductor1,dijkstra);
	        
	     
	        
	        
	        int distotal=dijkstra.DistanciaTotal(path, dijkstra);
	        //int distotal=dijkstra.getDistance(path.getNode(1).getData(), path.getNode(2).getData());
	        System.out.println(distotal);

	        for (int i=0; i<path.getLenght(); i++) {
	        	Vertice vertex=path.getNode(i).getData();
	            System.out.println(vertex);
	        }




	    }

	    private void addLane(String laneId, int sourceLocNo, int destLocNo,
	            int duration) {
	        Arista lane = new Arista(laneId,nodes.getNode(sourceLocNo).getData(), nodes.getNode(destLocNo).getData(), duration );
	        edges.append(lane);
	    }
	    public Linked_List<Vertice> pasarp_amigo(Conductor conduc,Dijkstra dijkstra) {
	    	Estudiante estudiante=conduc.getAmigos_est().getNode(0).getData();
	    	Vertice pos=estudiante.getPosicion();
	    	Linked_List camino1=dijkstra.caminocorto(conduc.getPosicion(),pos);
	    	Linked_List camino2=dijkstra.caminocorto(pos,nodes.getNode(29).getData());
	    	for (int i=0;i<=camino2.getLenght();i++) {
	    		camino1.append(camino2.getNode(i).getData());
	    	}
	    	return camino1;
	    }
	
	public static void main(String args[]) {
		TestDijkstra prueb=new TestDijkstra();
		prueb.testExcute();
	
	}
}