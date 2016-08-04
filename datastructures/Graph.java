import java.util.ArrayList;
import java.util.List;

/**
 * Created by siva on 14/6/16.
 */
public class Graph {

    int V;
    List<Integer> adjacentLists;

    Graph(int V){
        this.V = V;
        adjacentLists = new ArrayList<>(V);
    }

    void addEdge(int v,int w){
        adjacentLists.add(w);
    }


}
