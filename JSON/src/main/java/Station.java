public class Station {
    public String id;
    public String name;
    public Object score;
    public Coordinate coordinate;
    public Object distance;

    public Station(String id, String name, Object score, Coordinate coordinate, Object distance) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.coordinate = coordinate;
        this.distance = distance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Object getDistance() {
        return distance;
    }

    public void setDistance(Object distance) {
        this.distance = distance;
    }
}
