package furamaResort.models;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private String id;
    private String serviceName;
    private String usableArea;//dien tich su dung
    private String costRent;//chi phi thue
    private String maxCapacity;//so nguoi toi da
    private String rentType;//kieu thue: năm, tháng, ngày, giờ.


    public Facility() {

    }

    public Facility(String id, String serviceName, String usableArea, String costRent, String maxCapacity, String rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.costRent = costRent;
        this.maxCapacity = maxCapacity;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getCostRent() {
        return costRent;
    }

    public void setCostRent(String costRent) {
        this.costRent = costRent;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
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
        return id + "," + serviceName + "," + usableArea + "," + costRent + "," + maxCapacity + "," + rentType;
//                "Facility{" +
//                "id=" + id +
//                "serviceName='" + serviceName + '\'' +
//                ", usableArea=" + usableArea +
//                ", costRent=" + costRent +
//                ", maximum=" + maxCapacity +
//                ", typeRent='" + rentType + '\'' +
//                '}';
    }
}

