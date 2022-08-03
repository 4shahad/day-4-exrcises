package T2B3;

public class InvoceItem {
    String Id;
    String desc;
    int qty;
    double unitPrice;

    public String getId() {
        return Id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double Total() {
      double c=  unitPrice*qty;
        return c;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public InvoceItem(String id, String desc, int qty, double unitPrice) {
        Id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "InvoceItem{" +
                "Id='" + Id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
