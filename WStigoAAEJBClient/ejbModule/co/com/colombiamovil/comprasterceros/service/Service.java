/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class Service  implements java.io.Serializable {
    private co.com.colombiamovil.comprasterceros.service.Category category;

    private java.lang.String createUser;

    private java.util.Calendar creationDate;

    private java.lang.String dealerPoid;

    private java.lang.String description;

    private java.lang.String eventType;

    private java.lang.Long glid;

    private java.lang.Integer id;

    private java.lang.String partNum;

    private java.lang.String productName;

    private java.lang.String productPoid;

    private java.lang.String providerCode;

    private java.lang.String ratePlan;

    private java.lang.Integer resourceId;

    private java.lang.Double scaledAmount;

    private java.lang.Integer status;

    private java.lang.String taxCode;

    private java.lang.String xmlOut;

    public Service() {
    }

    public Service(
           co.com.colombiamovil.comprasterceros.service.Category category,
           java.lang.String createUser,
           java.util.Calendar creationDate,
           java.lang.String dealerPoid,
           java.lang.String description,
           java.lang.String eventType,
           java.lang.Long glid,
           java.lang.Integer id,
           java.lang.String partNum,
           java.lang.String productName,
           java.lang.String productPoid,
           java.lang.String providerCode,
           java.lang.String ratePlan,
           java.lang.Integer resourceId,
           java.lang.Double scaledAmount,
           java.lang.Integer status,
           java.lang.String taxCode,
           java.lang.String xmlOut) {
           this.category = category;
           this.createUser = createUser;
           this.creationDate = creationDate;
           this.dealerPoid = dealerPoid;
           this.description = description;
           this.eventType = eventType;
           this.glid = glid;
           this.id = id;
           this.partNum = partNum;
           this.productName = productName;
           this.productPoid = productPoid;
           this.providerCode = providerCode;
           this.ratePlan = ratePlan;
           this.resourceId = resourceId;
           this.scaledAmount = scaledAmount;
           this.status = status;
           this.taxCode = taxCode;
           this.xmlOut = xmlOut;
    }


    /**
     * Gets the category value for this Service.
     * 
     * @return category
     */
    public co.com.colombiamovil.comprasterceros.service.Category getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Service.
     * 
     * @param category
     */
    public void setCategory(co.com.colombiamovil.comprasterceros.service.Category category) {
        this.category = category;
    }


    /**
     * Gets the createUser value for this Service.
     * 
     * @return createUser
     */
    public java.lang.String getCreateUser() {
        return createUser;
    }


    /**
     * Sets the createUser value for this Service.
     * 
     * @param createUser
     */
    public void setCreateUser(java.lang.String createUser) {
        this.createUser = createUser;
    }


    /**
     * Gets the creationDate value for this Service.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this Service.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the dealerPoid value for this Service.
     * 
     * @return dealerPoid
     */
    public java.lang.String getDealerPoid() {
        return dealerPoid;
    }


    /**
     * Sets the dealerPoid value for this Service.
     * 
     * @param dealerPoid
     */
    public void setDealerPoid(java.lang.String dealerPoid) {
        this.dealerPoid = dealerPoid;
    }


    /**
     * Gets the description value for this Service.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Service.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the eventType value for this Service.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this Service.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the glid value for this Service.
     * 
     * @return glid
     */
    public java.lang.Long getGlid() {
        return glid;
    }


    /**
     * Sets the glid value for this Service.
     * 
     * @param glid
     */
    public void setGlid(java.lang.Long glid) {
        this.glid = glid;
    }


    /**
     * Gets the id value for this Service.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Service.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the partNum value for this Service.
     * 
     * @return partNum
     */
    public java.lang.String getPartNum() {
        return partNum;
    }


    /**
     * Sets the partNum value for this Service.
     * 
     * @param partNum
     */
    public void setPartNum(java.lang.String partNum) {
        this.partNum = partNum;
    }


    /**
     * Gets the productName value for this Service.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this Service.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productPoid value for this Service.
     * 
     * @return productPoid
     */
    public java.lang.String getProductPoid() {
        return productPoid;
    }


    /**
     * Sets the productPoid value for this Service.
     * 
     * @param productPoid
     */
    public void setProductPoid(java.lang.String productPoid) {
        this.productPoid = productPoid;
    }


    /**
     * Gets the providerCode value for this Service.
     * 
     * @return providerCode
     */
    public java.lang.String getProviderCode() {
        return providerCode;
    }


    /**
     * Sets the providerCode value for this Service.
     * 
     * @param providerCode
     */
    public void setProviderCode(java.lang.String providerCode) {
        this.providerCode = providerCode;
    }


    /**
     * Gets the ratePlan value for this Service.
     * 
     * @return ratePlan
     */
    public java.lang.String getRatePlan() {
        return ratePlan;
    }


    /**
     * Sets the ratePlan value for this Service.
     * 
     * @param ratePlan
     */
    public void setRatePlan(java.lang.String ratePlan) {
        this.ratePlan = ratePlan;
    }


    /**
     * Gets the resourceId value for this Service.
     * 
     * @return resourceId
     */
    public java.lang.Integer getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this Service.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Integer resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the scaledAmount value for this Service.
     * 
     * @return scaledAmount
     */
    public java.lang.Double getScaledAmount() {
        return scaledAmount;
    }


    /**
     * Sets the scaledAmount value for this Service.
     * 
     * @param scaledAmount
     */
    public void setScaledAmount(java.lang.Double scaledAmount) {
        this.scaledAmount = scaledAmount;
    }


    /**
     * Gets the status value for this Service.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Service.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the taxCode value for this Service.
     * 
     * @return taxCode
     */
    public java.lang.String getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this Service.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the xmlOut value for this Service.
     * 
     * @return xmlOut
     */
    public java.lang.String getXmlOut() {
        return xmlOut;
    }


    /**
     * Sets the xmlOut value for this Service.
     * 
     * @param xmlOut
     */
    public void setXmlOut(java.lang.String xmlOut) {
        this.xmlOut = xmlOut;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.createUser==null && other.getCreateUser()==null) || 
             (this.createUser!=null &&
              this.createUser.equals(other.getCreateUser()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.dealerPoid==null && other.getDealerPoid()==null) || 
             (this.dealerPoid!=null &&
              this.dealerPoid.equals(other.getDealerPoid()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.glid==null && other.getGlid()==null) || 
             (this.glid!=null &&
              this.glid.equals(other.getGlid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.partNum==null && other.getPartNum()==null) || 
             (this.partNum!=null &&
              this.partNum.equals(other.getPartNum()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productPoid==null && other.getProductPoid()==null) || 
             (this.productPoid!=null &&
              this.productPoid.equals(other.getProductPoid()))) &&
            ((this.providerCode==null && other.getProviderCode()==null) || 
             (this.providerCode!=null &&
              this.providerCode.equals(other.getProviderCode()))) &&
            ((this.ratePlan==null && other.getRatePlan()==null) || 
             (this.ratePlan!=null &&
              this.ratePlan.equals(other.getRatePlan()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.scaledAmount==null && other.getScaledAmount()==null) || 
             (this.scaledAmount!=null &&
              this.scaledAmount.equals(other.getScaledAmount()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.xmlOut==null && other.getXmlOut()==null) || 
             (this.xmlOut!=null &&
              this.xmlOut.equals(other.getXmlOut())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCreateUser() != null) {
            _hashCode += getCreateUser().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDealerPoid() != null) {
            _hashCode += getDealerPoid().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getGlid() != null) {
            _hashCode += getGlid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPartNum() != null) {
            _hashCode += getPartNum().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductPoid() != null) {
            _hashCode += getProductPoid().hashCode();
        }
        if (getProviderCode() != null) {
            _hashCode += getProviderCode().hashCode();
        }
        if (getRatePlan() != null) {
            _hashCode += getRatePlan().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getScaledAmount() != null) {
            _hashCode += getScaledAmount().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getXmlOut() != null) {
            _hashCode += getXmlOut().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "service"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerPoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dealerPoid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "glid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productPoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productPoid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "providerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratePlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scaledAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scaledAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
