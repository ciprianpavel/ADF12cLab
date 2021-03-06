package pts.adf.summit.model.entities;

import java.math.BigDecimal;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 14 14:12:28 EEST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SProductImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Name,
        ShortDesc,
        LongtextId,
        ImageId,
        CategoryId,
        SuggestedWhlslPrice,
        WhlslUnits,
        SItem,
        SInventory,
        SImage,
        SLongtext,
        SProductCategories;
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
    public static final int NAME = AttributesEnum.Name.index();
    public static final int SHORTDESC = AttributesEnum.ShortDesc.index();
    public static final int LONGTEXTID = AttributesEnum.LongtextId.index();
    public static final int IMAGEID = AttributesEnum.ImageId.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int SUGGESTEDWHLSLPRICE = AttributesEnum.SuggestedWhlslPrice.index();
    public static final int WHLSLUNITS = AttributesEnum.WhlslUnits.index();
    public static final int SITEM = AttributesEnum.SItem.index();
    public static final int SINVENTORY = AttributesEnum.SInventory.index();
    public static final int SIMAGE = AttributesEnum.SImage.index();
    public static final int SLONGTEXT = AttributesEnum.SLongtext.index();
    public static final int SPRODUCTCATEGORIES = AttributesEnum.SProductCategories.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SProductImpl() {
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public Integer getId() {
        return (Integer) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(Integer value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for ShortDesc, using the alias name ShortDesc.
     * @return the value of ShortDesc
     */
    public String getShortDesc() {
        return (String) getAttributeInternal(SHORTDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShortDesc.
     * @param value value to set the ShortDesc
     */
    public void setShortDesc(String value) {
        setAttributeInternal(SHORTDESC, value);
    }

    /**
     * Gets the attribute value for LongtextId, using the alias name LongtextId.
     * @return the value of LongtextId
     */
    public Integer getLongtextId() {
        return (Integer) getAttributeInternal(LONGTEXTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LongtextId.
     * @param value value to set the LongtextId
     */
    public void setLongtextId(Integer value) {
        setAttributeInternal(LONGTEXTID, value);
    }

    /**
     * Gets the attribute value for ImageId, using the alias name ImageId.
     * @return the value of ImageId
     */
    public Integer getImageId() {
        return (Integer) getAttributeInternal(IMAGEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ImageId.
     * @param value value to set the ImageId
     */
    public void setImageId(Integer value) {
        setAttributeInternal(IMAGEID, value);
    }

    /**
     * Gets the attribute value for CategoryId, using the alias name CategoryId.
     * @return the value of CategoryId
     */
    public Integer getCategoryId() {
        return (Integer) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryId.
     * @param value value to set the CategoryId
     */
    public void setCategoryId(Integer value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the attribute value for SuggestedWhlslPrice, using the alias name SuggestedWhlslPrice.
     * @return the value of SuggestedWhlslPrice
     */
    public BigDecimal getSuggestedWhlslPrice() {
        return (BigDecimal) getAttributeInternal(SUGGESTEDWHLSLPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuggestedWhlslPrice.
     * @param value value to set the SuggestedWhlslPrice
     */
    public void setSuggestedWhlslPrice(BigDecimal value) {
        setAttributeInternal(SUGGESTEDWHLSLPRICE, value);
    }

    /**
     * Gets the attribute value for WhlslUnits, using the alias name WhlslUnits.
     * @return the value of WhlslUnits
     */
    public String getWhlslUnits() {
        return (String) getAttributeInternal(WHLSLUNITS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WhlslUnits.
     * @param value value to set the WhlslUnits
     */
    public void setWhlslUnits(String value) {
        setAttributeInternal(WHLSLUNITS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSItem() {
        return (RowIterator) getAttributeInternal(SITEM);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSInventory() {
        return (RowIterator) getAttributeInternal(SINVENTORY);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSImage() {
        return (EntityImpl) getAttributeInternal(SIMAGE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSImage(EntityImpl value) {
        setAttributeInternal(SIMAGE, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSLongtext() {
        return (EntityImpl) getAttributeInternal(SLONGTEXT);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSLongtext(EntityImpl value) {
        setAttributeInternal(SLONGTEXT, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSProductCategories() {
        return (EntityImpl) getAttributeInternal(SPRODUCTCATEGORIES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSProductCategories(EntityImpl value) {
        setAttributeInternal(SPRODUCTCATEGORIES, value);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("pts.adf.summit.model.entities.SProduct");
    }
}

