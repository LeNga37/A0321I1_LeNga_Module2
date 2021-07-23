package furamaResort.models;

public class Booking {
    private String bookingId;
    private String firstDay;
    private String lastDay;
    private String customerId;
    private String serviceName;
    private String serviceType;

    public Booking() {

    }

    public Booking(String bookingId, String firstDay, String lastDay, String customerId, String serviceName, String serviceType){
        this.bookingId=bookingId;
        this.firstDay=firstDay;
        this.lastDay=lastDay;
        this.customerId=customerId;
        this.serviceName=serviceName;
        this.serviceType=serviceType;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDay() {
        return lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", firstDay='" + firstDay + '\'' +
                ", lastDay='" + lastDay + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
