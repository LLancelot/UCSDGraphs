package roadgraph;
import geography.GeographicPoint;

/*
	the class Road describes the relationship and information
	of start point and end point of the streets, not only contains
	these two points, but also tells the length, name and type 
	of streets. All these info are capsulated.
*/

public class MapEdge {
	private GeographicPoint from;
	private GeographicPoint to;
	private String roadName;
	private String roadType;
	private double distance;
	
	// constructor for Road class
	public MapEdge(GeographicPoint from, GeographicPoint to, String roadName, String roadType, double distance) {
		this.setFrom(from);
		this.setTo(to);
		this.setRoadName(roadName);
		this.setRoadType(roadType);
		this.setDistance(distance);
	}
	
	public GeographicPoint getFrom() {
		return from;
	}
	public void setFrom(GeographicPoint from) {
		this.from = from;
	}
	public GeographicPoint getTo() {
		return to;
	}
	public void setTo(GeographicPoint to) {
		this.to = to;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getRoadType() {
		return roadType;
	}
	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
}
