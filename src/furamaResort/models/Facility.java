package furamaResort.models;

public abstract class Facility {
    private String serviceName;
    private float usableArea;//dien tich su dung
    private double costRent;//chi phi thue
    private int maxCapacity;//so nguoi toi da
    private String rentType;//kieu thue


    public Facility() {

    }

    public Facility(String nameService, float usableArea, double costRent, int maximum, String rentType) {
        this.serviceName = nameService;
        this.usableArea = usableArea;
        this.costRent = costRent;
        this.maxCapacity = maximum;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(float usableArea) {
        this.usableArea = usableArea;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRenType() {
        return rentType;
    }

    public void setRenType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", costRent=" + costRent +
                ", maximum=" + maxCapacity +
                ", typeRent='" + rentType + '\'' +
                '}';
    }
}

