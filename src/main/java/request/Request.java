package request;

public class Request {

    private Integer id;
    private String donationType;
    private Integer quantity_needed;

    public Request(Integer id, String donationType, Integer quantity_needed) {
        this.id = id;
        this.donationType = donationType;
        this.quantity_needed = quantity_needed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonationType() {
        return donationType;
    }

    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }

    public Integer getQuantity_needed() {
        return quantity_needed;
    }

    public void setQuantity_needed(Integer quantity_needed) {
        this.quantity_needed = quantity_needed;
    }
}
