package furamaResort.models;

public class Villa extends Facility {
    private String roomStandard; //tieu chuan phong
    private float poolArea;//dien tich ho boi
    private int totalFloor;//so tang

    public Villa() {

    }

    public Villa(String roomStandard, float poolArea, int totalFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.totalFloor = totalFloor;
    }

    public Villa(String serviceName, float usableArea, double costRent, int maximum, String rentType, String roomStandard, float poolArea, int totalFloor) {
        super(serviceName, usableArea, costRent, maximum, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.totalFloor = totalFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        this.totalFloor = totalFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", totalFloor=" + totalFloor +
                '}';
    }
}
