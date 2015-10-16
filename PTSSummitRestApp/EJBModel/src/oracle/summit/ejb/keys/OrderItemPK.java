package oracle.summit.ejb.keys;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import java.io.Serializable;

public class OrderItemPK implements Serializable{
    @SuppressWarnings("compatibility:-253903861695185378")
    private static final long serialVersionUID = 1L;

    private Integer ordId;
    private Integer itemId;

    public OrderItemPK() {
    }
    
    @Override
    public boolean equals (Object obj){
        
        if (obj instanceof OrderItemPK){
            OrderItemPK orderItemPK = (OrderItemPK)obj;
            if(!orderItemPK.getOrdId().equals(ordId)) {
                return false;
            }
            if(!orderItemPK.getItemId().equals(itemId)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode(){
        return ordId.hashCode() + itemId.hashCode();
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }
}
