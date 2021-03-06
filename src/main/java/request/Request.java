package request;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(id, request.id) && Objects.equals(donationType, request.donationType) && Objects.equals(quantity_needed, request.quantity_needed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, donationType, quantity_needed);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", donationType='" + donationType + '\'' +
                ", quantity_needed=" + quantity_needed +
                '}';


    }
}
