package graph;

import java.util.LinkedList;

/**
 * Created by siva on 14/5/16.
 */
public class DFS {

    private int V;
    private LinkedList<Integer>[] adj;

    public DFS(int v){
        V=v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]= new LinkedList<>();
        }
    }

    private void addEdge(int v,int w){
        adj[v].add(w);
    }

    


}
