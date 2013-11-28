/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author home
 */
public class Graph {
    /**
     * look for the constructor for the shape of this sample graph
     */
    final static int size = 5;
    public int adj[][];
    public int visited[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph();
       
        g.dfs(0);
    }
    
    public Graph() {
        /*
         * the sample graph has five nodes, 0,1,2,3,4
         * 0 -> 1
         * 1 -> 2
         * 1 -> 3
         * 2 -> 4
         * 
         * a dfs() traversal from 0 should result in a path 0->1->2->4 (back
         * out then) 1->3
         */
        int i, j;
        
        adj = new int[size][size];
        
        for (i = 0; i < 5; i ++) {
            for (j = 0; j < 5; j ++) {
            adj[i][j] = 0;
            }
        }
        adj[0][1] = 1;
        adj[1][2] = 1;
        adj[1][3] = 1;
        adj[2][4] = 1;

        visited = new int[size];
        for (i = 0; i < 5; i ++) {
            visited[i] = 0;
         }

    }  // end of setGraph()
    
    public void visit(int k) {

      System.out.println("visit " + k);
    } // end of visit()

    void dfs(int node) {
      visit(node);
      visited[node] = 1;
      int i;
      for (i = 0; i < 5; i ++) {
        if (adj[node][i] == 1 && visited[i] == 0)
          dfs(i);
      }
    }  // end of dfs()

}
