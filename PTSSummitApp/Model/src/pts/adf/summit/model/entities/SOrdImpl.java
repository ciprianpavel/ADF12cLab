package pts.adf.summit.model.entities;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 14 14:12:52 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SOrdImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        CustomerId,
        DateOrdered,
        DateShipped,
        SalesRepId,
        Total,
        PaymentTypeId,
        PaymentOptionId,
        OrderFilled,
        SItem,
        SCustomer,
        SEmp,
        SPaymentType,
        PaymentOptionsVA;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int ID = AttributesEnum.Id.index();
    public static final int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static final int DATEORDERED = AttributesEnum.DateOrdered.index();
    public static final int DATESHIPPED = AttributesEnum.DateShipped.index();
    public static final int SALESREPID = AttributesEnum.SalesRepId.index();
    public static final int TOTAL = AttributesEnum.Total.index();
    public static final int PAYMENTTYPEID = AttributesEnum.PaymentTypeId.index();
    public static final int PAYMENTOPTIONID = AttributesEnum.PaymentOptionId.index();
    public static final int ORDERFILLED = AttributesEnum.OrderFilled.index();
    public static final int SITEM = AttributesEnum.SItem.index();
    public static final int SCUSTOMER = AttributesEnum.SCustomer.index();
    public static final int SEMP = AttributesEnum.SEmp.index();
    public static final int SPAYMENTTYPE = AttributesEnum.SPaymentType.index();
    public static final int PAYMENTOPTIONSVA = AttributesEnum.PaymentOptionsVA.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SOrdImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("pts.adf.summit.model.entities.SOrd");
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public DBSequence getId() {
        return (DBSequence) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(DBSequence value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for CustomerId, using the alias name CustomerId.
     * @return the value of CustomerId
     */
    public Integer getCustomerId() {
        return (Integer) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerId.
     * @param value value to set the CustomerId
     */
    public void setCustomerId(Integer value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for DateOrdered, using the alias name DateOrdered.
     * @return the value of DateOrdered
     */
    public Timestamp getDateOrdered() {
        return (Timestamp) getAttributeInternal(DATEORDERED);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateOrdered.
     * @param value value to set the DateOrdered
     */
    public void setDateOrdered(Timestamp value) {
        setAttributeInternal(DATEORDERED, value);
    }

    /**
     * Gets the attribute value for DateShipped, using the alias name DateShipped.
     * @return the value of DateShipped
     */
    public Timestamp getDateShipped() {
        return (Timestamp) getAttributeInternal(DATESHIPPED);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateShipped.
     * @param value value to set the DateShipped
     */
    public void setDateShipped(Timestamp value) {
        setAttributeInternal(DATESHIPPED, value);
    }

    /**
     * Gets the attribute value for SalesRepId, using the alias name SalesRepId.
     * @return the value of SalesRepId
     */
    public Integer getSalesRepId() {
        return (Integer) getAttributeInternal(SALESREPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesRepId.
     * @param value value to set the SalesRepId
     */
    public void setSalesRepId(Integer value) {
        setAttributeInternal(SALESREPID, value);
    }

    /**
     * Gets the attribute value for Total, using the alias name Total.
     * @return the value of Total
     */
    public BigDecimal getTotal() {
        return (BigDecimal) getAttributeInternal(TOTAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Total.
     * @param value value to set the Total
     */
    public void setTotal(BigDecimal value) {
        setAttributeInternal(TOTAL, value);
    }

    /**
     * Gets the attribute value for PaymentTypeId, using the alias name PaymentTypeId.
     * @return the value of PaymentTypeId
     */
    public Integer getPaymentTypeId() {
        return (Integer) getAttributeInternal(PAYMENTTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PaymentTypeId.
     * @param value value to set the PaymentTypeId
     */
    public void setPaymentTypeId(Integer value) {
        setAttributeInternal(PAYMENTTYPEID, value);
    }

    /**
     * Gets the attribute value for PaymentOptionId, using the alias name PaymentOptionId.
     * @return the value of PaymentOptionId
     */
    public Integer getPaymentOptionId() {
        return (Integer) getAttributeInternal(PAYMENTOPTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PaymentOptionId.
     * @param value value to set the PaymentOptionId
     */
    public void setPaymentOptionId(Integer value) {
        setAttributeInternal(PAYMENTOPTIONID, value);
    }

    /**
     * Gets the attribute value for OrderFilled, using the alias name OrderFilled.
     * @return the value of OrderFilled
     */
    public String getOrderFilled() {
        return (String) getAttributeInternal(ORDERFILLED);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderFilled.
     * @param value value to set the OrderFilled
     */
    public void setOrderFilled(String value) {
        setAttributeInternal(ORDERFILLED, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSItem() {
        return (RowIterator) getAttributeInternal(SITEM);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSCustomer() {
        return (EntityImpl) getAttributeInternal(SCUSTOMER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSCustomer(EntityImpl value) {
        setAttributeInternal(SCUSTOMER, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSEmp() {
        return (EntityImpl) getAttributeInternal(SEMP);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSEmp(EntityImpl value) {
        setAttributeInternal(SEMP, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSPaymentType() {
        return (EntityImpl) getAttributeInternal(SPAYMENTTYPE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSPaymentType(EntityImpl value) {
        setAttributeInternal(SPAYMENTTYPE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PaymentOptionsVA.
     */
    public RowSet getPaymentOptionsVA() {
        return (RowSet) getAttributeInternal(PAYMENTOPTIONSVA);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence id) {
        return new Key(new Object[] { id });
    }

}
