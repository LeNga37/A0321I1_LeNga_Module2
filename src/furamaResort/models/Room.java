package furamaResort.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, String usableArea, String costRent, String maxCapacity, String rentType, String freeService) {
        super(id, serviceName, usableArea, costRent, maxCapacity, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return this.getId() + "," + this.getServiceName() + "," + this.getUsableArea() + "," + this.getCostRent() + "," + this.getMaxCapacity() + "," +
                this.getRenType() + "," + this.freeService;
//                "Room{" +
//                super.toString() +
//                "freeService='" + freeService + '\'' +
//                '}';
    }
}
