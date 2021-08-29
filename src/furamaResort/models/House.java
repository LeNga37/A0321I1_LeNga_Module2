package furamaResort.models;

public class House extends Facility {
    private String roomStandard;//tieu chuan phong
    private String totalFloor;//so tang

    public House() {

    }

    public House(String roomStandard, String totalFloor) {
        this.roomStandard = roomStandard;
        this.totalFloor = totalFloor;
    }

    public House(String id, String serviceName, String usableArea, String costRent, String maxCapacity, String rentType, String roomStandard, String totalFloor) {
        super(id, serviceName, usableArea, costRent, maxCapacity, rentType);
        this.roomStandard = roomStandard;
        this.totalFloor = totalFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
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
                this.getRenType() + "," + this.roomStandard + "," + this.totalFloor;
//                "House{" +
//                super.toString() +
//                "roomStandard='" + roomStandard + '\'' +
//                ", totalFloor=" + totalFloor +
//                '}';
    }
}
