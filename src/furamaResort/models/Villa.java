package furamaResort.models;

public class Villa extends Facility {
    private String roomStandard; //tieu chuan phong
    private String poolArea;//dien tich ho boi
    private String totalFloor;//so tang

    public Villa() {

    }

    public Villa(String roomStandard, String poolArea, String totalFloor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.totalFloor = totalFloor;
    }

    public Villa(String id, String serviceName, String usableArea, String costRent, String maxCapacity, String rentType, String roomStandard, String poolArea, String totalFloor) {
        super(id, serviceName, usableArea, costRent, maxCapacity, rentType);
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(String totalFloor) {
        this.totalFloor = totalFloor;
    }

    @Override
    public String toString() {
        return this.getId() + "," + this.getServiceName() + "," + this.getUsableArea() + "," + this.getCostRent() + "," + this.getMaxCapacity() + "," +
                this.getRenType() + "," + this.roomStandard + "," + this.poolArea + "," + this.totalFloor;
//                "Villa{" +
//                super.toString() +
//                "roomStandard='" + roomStandard + '\'' +
//                ", poolArea=" + poolArea +
//                ", totalFloor=" + totalFloor +
//                '}';
    }
}
