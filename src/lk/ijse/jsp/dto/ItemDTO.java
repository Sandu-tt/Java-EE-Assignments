package lk.ijse.jsp.dto;

/**
 * @author : SANDU
 * @created 20/08/2023
 * @project Java-EE-Assignments
 */
public class ItemDTO {
    private String code;
    private String name;
    private String qty;
    private String price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "code='" + code + '\'' +
                ", description='" + name + '\'' +
                ", qty='" + qty + '\'' +
                ", unitPrice='" + price + '\'' +
                '}';
    }
}
