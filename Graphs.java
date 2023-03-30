

/*Creation of Adjaceny Matrix for Undiredted Graph */

public class Graphs {
    private int vertex;
    private int edge;
    private int adjMatrix[][]; //creating adjaceny matrix for undirected graph
    Graphs(int nodes){
        this.vertex=nodes;
        this.edge=0;
        this.adjMatrix=new int[nodes][nodes];
    }

    public void addEdge(int node1,int node2){  //Created method to add Edge between two nodes
        adjMatrix[node1][node2]=1;
        adjMatrix[node2][node1]=1;    //Being an Undirected Graph both sides will have connections
        edge++;                        //increasing edge value after adding node
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(vertex +"Vertices"+ edge +"edges" + "\n");
        for(int v=0;v<vertex;v++){
            sb.append(v+":");
            for(int w:adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Graphs g=new Graphs(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
