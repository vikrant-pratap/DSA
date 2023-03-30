import java.util.LinkedList;
import java.util.Queue;



/*Creating BFS implementation*/

public class BFSImpl {
    LinkedList<Integer>[] adj;

    int V;  //no of vertex
    int E; //no of edges

    BFSImpl(int nodes){
        this.V=nodes;
        this.E=0;
        this.adj=new LinkedList[nodes];   //this assigns linked-list to each of the nodes
        for(int v =0; v<V ;v++){    //
            adj[v]=new LinkedList<>();  //For each vertex there will be a linkedList associated
        }
    }

    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V + "Vertices" + E +"Edges" +"\n");
        for(int v=0;v<V;v++){
            sb.append(v +" ");
            for(int w :adj[v]){
                sb.append( w +" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s){
        boolean visited[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.offer(s);


        while(!q.isEmpty()){
            int u=q.poll();
            System.out.println(u);

            for(int v :adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }

    }
    public static void main(String[] args) {

        BFSImpl g=new BFSImpl(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.bfs(0);
        System.out.println(g);
    }
}

