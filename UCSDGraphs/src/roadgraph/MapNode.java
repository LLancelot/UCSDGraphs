package roadgraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import geography.GeographicPoint;

public class MapNode implements Comparable<MapNode>{
	private GeographicPoint location;
	private double length = 0;	
	private double predictedLength = 0;	
	private HashSet<MapEdge> edgeList;
	
	public MapNode(GeographicPoint location) {
		this.location = location;
		edgeList = new HashSet<>();
	}

	public GeographicPoint getLocation() {
		return location;
	}

//	public void setLocation(GeographicPoint location) {
//		this.location = location;
//	}

	public HashSet<MapEdge> getEdgeList() {
		return edgeList;
	}

	public void addEdge(MapEdge newEdge) {
		edgeList.add(newEdge);
	}
	
	public void addEdge(GeographicPoint toLoc, String roadName, String roadType, double distance) {
		MapEdge newEdge = new MapEdge(location, toLoc, roadName, roadType, distance);
		edgeList.add(newEdge);
	}
	
	public List<GeographicPoint> getNeighbors() {
		List<GeographicPoint> neighbors = new ArrayList<>();
		for(MapEdge e : edgeList){
			neighbors.add(e.getTo());
		}
		return neighbors;
	}

	public int compareTo(MapNode node) {
		return Double.compare(this.getLength(), node.getLength());
	}
	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getPredictedLength() {
		return predictedLength;
	}

	public void setPredictedLength(double predictedLength) {
		this.predictedLength = predictedLength;
	}

}
