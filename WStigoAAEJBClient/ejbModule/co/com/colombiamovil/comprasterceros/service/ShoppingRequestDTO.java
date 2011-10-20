/**
 * ShoppingRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class ShoppingRequestDTO  implements java.io.Serializable {
    private co.com.colombiamovil.comprasterceros.service.ProcessActionEnum action;

    private java.lang.String mobileNumber;

    private co.com.colombiamovil.comprasterceros.service.ParamDTO[] parameters;

    private java.lang.Integer purchasedProductId;

    private java.lang.String reason;

    private java.lang.String userSeller;

    public ShoppingRequestDTO() {
    }

    public ShoppingRequestDTO(
           co.com.colombiamovil.comprasterceros.service.ProcessActionEnum action,
           java.lang.String mobileNumber,
           co.com.colombiamovil.comprasterceros.service.ParamDTO[] parameters,
           java.lang.Integer purchasedProductId,
           java.lang.String reason,
           java.lang.String userSeller) {
           this.action = action;
           this.mobileNumber = mobileNumber;
           this.parameters = parameters;
           this.purchasedProductId = purchasedProductId;
           this.reason = reason;
           this.userSeller = userSeller;
    }


    /**
     * Gets the action value for this ShoppingRequestDTO.
     * 
     * @return action
     */
    public co.com.colombiamovil.comprasterceros.service.ProcessActionEnum getAction() {
        return action;
    }


    /**
     * Sets the action value for this ShoppingRequestDTO.
     * 
     * @param action
     */
    public void setAction(co.com.colombiamovil.comprasterceros.service.ProcessActionEnum action) {
        this.action = action;
    }


    /**
     * Gets the mobileNumber value for this ShoppingRequestDTO.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this ShoppingRequestDTO.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the parameters value for this ShoppingRequestDTO.
     * 
     * @return parameters
     */
    public co.com.colombiamovil.comprasterceros.service.ParamDTO[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ShoppingRequestDTO.
     * 
     * @param parameters
     */
    public void setParameters(co.com.colombiamovil.comprasterceros.service.ParamDTO[] parameters) {
        this.parameters = parameters;
    }

    public co.com.colombiamovil.comprasterceros.service.ParamDTO getParameters(int i) {
        return this.parameters[i];
    }

    public void setParameters(int i, co.com.colombiamovil.comprasterceros.service.ParamDTO _value) {
        this.parameters[i] = _value;
    }


    /**
     * Gets the purchasedProductId value for this ShoppingRequestDTO.
     * 
     * @return purchasedProductId
     */
    public java.lang.Integer getPurchasedProductId() {
        return purchasedProductId;
    }


    /**
     * Sets the purchasedProductId value for this ShoppingRequestDTO.
     * 
     * @param purchasedProductId
     */
    public void setPurchasedProductId(java.lang.Integer purchasedProductId) {
        this.purchasedProductId = purchasedProductId;
    }


    /**
     * Gets the reason value for this ShoppingRequestDTO.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ShoppingRequestDTO.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the userSeller value for this ShoppingRequestDTO.
     * 
     * @return userSeller
     */
    public java.lang.String getUserSeller() {
        return userSeller;
    }


    /**
     * Sets the userSeller value for this ShoppingRequestDTO.
     * 
     * @param userSeller
     */
    public void setUserSeller(java.lang.String userSeller) {
        this.userSeller = userSeller;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingRequestDTO)) return false;
        ShoppingRequestDTO other = (ShoppingRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.purchasedProductId==null && other.getPurchasedProductId()==null) || 
             (this.purchasedProductId!=null &&
              this.purchasedProductId.equals(other.getPurchasedProductId()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.userSeller==null && other.getUserSeller()==null) || 
             (this.userSeller!=null &&
              this.userSeller.equals(other.getUserSeller())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchasedProductId() != null) {
            _hashCode += getPurchasedProductId().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getUserSeller() != null) {
            _hashCode += getUserSeller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "shoppingRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "processActionEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "paramDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasedProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasedProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSeller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userSeller"));
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
