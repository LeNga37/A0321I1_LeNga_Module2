package furamaResort.models;

public class House extends Facility {
    private String roomStandard;//tieu chuan phong
    private int totalFloor;//so tang

    public House() {

    }

    public House(String roomStandard, int totalFloor) {
        this.roomStandard = roomStandard;
        this.totalFloor = totalFloor;
    }

    public House(String serviceName, float usableArea, double costRent, int maximum, String rentType, String roomStandard, int totalFloor) {
        super(serviceName, usableArea, costRent, maximum, rentType);
        this.roomStandard = roomStandard;
        this.totalFloor = totalFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        this.totalFloor = totalFloor;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", totalFloor=" + totalFloor +
                '}';
    }
}
