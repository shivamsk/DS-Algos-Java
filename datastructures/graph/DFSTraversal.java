package graph;

import java.util.LinkedList;

/**
 * Created by siva on 14/5/16.
 * http://www.geeksforgeeks.org/depth-first-traversal-for-a-graph/
 * Lecture 31 in IIT KGP Lectures . Dr.Chakraborty
 */
// This class represents a directed graph using adjacency list
// representation
public class DFSTraversal {

    private int V; // No. of vertices
    // Array of Lists for Adjacency List Represenation
    private LinkedList<Integer>[] adj ;

    public DFSTraversal(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }

    /**
     * Function to add edge to graph
     * @param v - Vertex
     * @param w
     */
    private void addEdge(int v,int w){
        adj[v].add(w);
    }

    private void dfsUtil(int v,boolean visited[]){

        visited[v] =true;
        System.out.print(v+ " ");

        for(int i: adj[v]){
            if(!visited[i]) dfsUtil(i,visited);
        }

    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFSTraverseMethod(){
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i]) dfsUtil(i,visited);
        }

    }

    boolean isCyclicUtil(int v,boolean visited[],boolean recursionStack[]){
        if(visited[v] == false)
        {
            // Mark the current node as visited and part of recursion stack
            visited[v] = true;
            recursionStack[v] = true;

            // Recur for all the vertices adjacent to this vertex

            for(int i: adj[v])
            {
                if ( !visited[i] && isCyclicUtil(i, visited, recursionStack) )
                return true;
                else if (recursionStack[i])
                return true;
            }

        }
        recursionStack[v] = false;  // remove the vertex from recursion stack
        return false;
    }
    int isCyclic()
    {
        // Mark all the vertices as not visited and not part of recursion
        // stack
        boolean visited[] = new boolean[V];
        boolean recStack[] = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            visited[i] = false;
            recStack[i] = false;
        }

        int noOfCycles = 0;
        // Call the recursive helper function to detect cycle in different
        // DFS trees
        for(int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack)){
                noOfCycles++;
                //return true;
            }

        System.out.println("Cycles "+noOfCycles);
        return noOfCycles;
    }


    public static void main(String args[]){
        DFSTraversal g = new DFSTraversal(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("Depth First Traversal :");
        //graph.DFSTraverseMethod();
        System.out.println("Graph contains cycle: "+g.isCyclic());

    }


}


























