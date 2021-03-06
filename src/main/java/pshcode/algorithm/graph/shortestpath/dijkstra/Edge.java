package pshcode.algorithm.graph.shortestpath.dijkstra;

import lombok.Data;

/**
 * 간선 Model.
 * 
 * @author SungHoon, Park
 */
@Data
public class Edge {
	int toNode;
	int weight;

	public Edge(int toNode, int weight) {
		this.toNode = toNode;
		this.weight = weight;
	}
}
