package sistema;

public class TestDijkstra {

	    private Linked_List<Vertice> nodes;
	    private Linked_List<Arista> edges;

	    public void testExcute() {
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
	        addLane("Edge_0", 0, 1, 85);
	        addLane("Edge_1", 0, 6, 85);
	        addLane("Edge_2", 1, 0, 85);
	        addLane("Edge_3", 1, 7, 85);
	        addLane("Edge_4", 1, 2, 85);
	        addLane("Edge_5", 2, 1, 85);
	        addLane("Edge_6", 2, 8, 85);
	        addLane("Edge_7", 2, 3, 85);
	        addLane("Edge_8", 3, 2, 85);
	        addLane("Edge_9", 3, 9, 85);
	        addLane("Edge_10", 3, 4, 85);
	        addLane("Edge_11", 4, 3, 85);
	        addLane("Edge_12", 4, 11, 85);
	        addLane("Edge_13", 4, 5, 85);
	        addLane("Edge_14", 5, 4, 85);
	        addLane("Edge_15", 5, 11, 85);
	        addLane("Edge_16", 5, 12, 85);
	        addLane("Edge_17", 6, 0, 85);
	        addLane("Edge_18", 6, 7, 85);
	        addLane("Edge_19", 6, 13, 85);
	        addLane("Edge_20", 7, 1, 85);
	        addLane("Edge_21", 7, 6, 85);
	        addLane("Edge_22", 7, 8, 85);
	        addLane("Edge_23", 7, 13, 85);
	        addLane("Edge_24", 8, 2, 85);
	        addLane("Edge_25", 8, 7, 85);
	        addLane("Edge_26", 8, 14, 85);
	        addLane("Edge_27", 8, 9, 85);
	        addLane("Edge_28", 9, 3, 85);
	        addLane("Edge_29", 9, 8, 85);
	        addLane("Edge_30", 9, 15, 85);
	        addLane("Edge_31", 9, 10, 85);
	        addLane("Edge_32", 10, 3, 85);
	        addLane("Edge_33", 10, 9, 85);
	        addLane("Edge_34", 10, 11, 85);
	        addLane("Edge_35", 10, 16, 85);
	        addLane("Edge_36", 11, 5, 85);
	        addLane("Edge_37", 11, 11, 85);
	        addLane("Edge_38", 11, 17, 85);
	        addLane("Edge_39", 11, 10, 85);
	        addLane("Edge_40", 12, 5, 85);
	        addLane("Edge_41", 12, 11, 85);
	        addLane("Edge_42", 12, 17, 85);
	        addLane("Edge_43", 13, 7, 85);
	        addLane("Edge_44", 13, 6, 85);
	        addLane("Edge_45", 13, 18, 85);
	        addLane("Edge_46", 14, 8, 85);
	        addLane("Edge_47", 14, 18, 85);
	        addLane("Edge_48", 14, 19, 85);
	        addLane("Edge_49", 15, 9, 85);
	        addLane("Edge_50", 15, 16, 85);
	        addLane("Edge_51", 15, 20, 85);
	        addLane("Edge_52", 15, 14, 85);
	        addLane("Edge_53", 16, 10, 85);
	        addLane("Edge_54", 16, 15, 85);
	        addLane("Edge_55", 16, 21, 85);
	        addLane("Edge_56", 16, 17, 85);
	        addLane("Edge_57", 17, 11, 85);
	        addLane("Edge_58", 17, 12, 85);
	        addLane("Edge_59", 17, 23, 85);
	        addLane("Edge_60", 18, 13, 85);
	        addLane("Edge_61", 18, 14, 85);
	        addLane("Edge_62", 18, 24, 85);
	        addLane("Edge_63", 19, 14, 85);
	        addLane("Edge_64", 19, 18, 85);
	        addLane("Edge_65", 19, 25, 85);
	        addLane("Edge_66", 19, 20, 85);
	        addLane("Edge_67", 20, 15, 85);
	        addLane("Edge_68", 20, 19, 85);
	        addLane("Edge_69", 20, 26, 85);
	        addLane("Edge_70", 20, 21, 85);
	        addLane("Edge_71", 21, 16, 85);
	        addLane("Edge_72", 21, 20, 85);
	        addLane("Edge_73", 21, 27, 85);
	        addLane("Edge_74", 21, 22, 85);
	        addLane("Edge_75", 22, 16, 85);
	        addLane("Edge_76", 22, 21, 85);
	        addLane("Edge_77", 22, 28, 85);
	        addLane("Edge_78", 22, 23, 85);
	        addLane("Edge_79", 23, 17, 85);
	        addLane("Edge_80", 23, 22, 85);
	        addLane("Edge_81", 23, 29, 85);
	        addLane("Edge_82", 24, 18, 85);
	        addLane("Edge_83", 24, 25, 85);
	        addLane("Edge_84", 25, 19, 85);
	        addLane("Edge_85", 25, 24, 85);
	        addLane("Edge_86", 25, 26, 85);
	        addLane("Edge_87", 26, 27, 85);
	        addLane("Edge_88", 26, 20, 85);
	        addLane("Edge_89", 26, 25, 85);
	        addLane("Edge_87", 26, 27, 85);
	        addLane("Edge_88", 26, 20, 85);
	        addLane("Edge_89", 26, 25, 85);
	        addLane("Edge_93", 28, 10, 29);
	        addLane("Edge_94", 28, 10, 22);
	        addLane("Edge_95", 28, 10, 27);
	        

	        // Lets check from location Loc_1 to Loc_10
	        Grafo graph = new Grafo(nodes, edges);
	        Dijkstra dijkstra = new Dijkstra(graph);
	        dijkstra.execute(nodes.getNode(18).getData());
	        Linked_List<Vertice> path = dijkstra.getPath(nodes.getNode(29).getData());
	        //int distancia=dijkstra.getDistance(nodes.getNode(2).getData(),nodes.getNode(6).getData());

	        //assertNotNull(path);
	        //assertTrue(path.size() > 0);
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
	
	public static void main(String args[]) {
		TestDijkstra prueb=new TestDijkstra();
		prueb.testExcute();
	
	}
}
