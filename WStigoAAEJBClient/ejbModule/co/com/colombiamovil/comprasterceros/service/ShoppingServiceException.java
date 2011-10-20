/**
 * ShoppingServiceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class ShoppingServiceException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String errorCode;

    private java.lang.String message1;

    private java.lang.String platformMessage;

    private java.lang.String platformName;

    private co.com.colombiamovil.comprasterceros.service.BussinesExceptionType type;

    private java.lang.String userMessage;

    public ShoppingServiceException() {
    }

    public ShoppingServiceException(
           java.lang.String errorCode,
           java.lang.String message1,
           java.lang.String platformMessage,
           java.lang.String platformName,
           co.com.colombiamovil.comprasterceros.service.BussinesExceptionType type,
           java.lang.String userMessage) {
        this.errorCode = errorCode;
        this.message1 = message1;
        this.platformMessage = platformMessage;
        this.platformName = platformName;
        this.type = type;
        this.userMessage = userMessage;
    }


    /**
     * Gets the errorCode value for this ShoppingServiceException.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this ShoppingServiceException.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the message1 value for this ShoppingServiceException.
     * 
     * @return message1
     */
    public java.lang.String getMessage1() {
        return message1;
    }


    /**
     * Sets the message1 value for this ShoppingServiceException.
     * 
     * @param message1
     */
    public void setMessage1(java.lang.String message1) {
        this.message1 = message1;
    }


    /**
     * Gets the platformMessage value for this ShoppingServiceException.
     * 
     * @return platformMessage
     */
    public java.lang.String getPlatformMessage() {
        return platformMessage;
    }


    /**
     * Sets the platformMessage value for this ShoppingServiceException.
     * 
     * @param platformMessage
     */
    public void setPlatformMessage(java.lang.String platformMessage) {
        this.platformMessage = platformMessage;
    }


    /**
     * Gets the platformName value for this ShoppingServiceException.
     * 
     * @return platformName
     */
    public java.lang.String getPlatformName() {
        return platformName;
    }


    /**
     * Sets the platformName value for this ShoppingServiceException.
     * 
     * @param platformName
     */
    public void setPlatformName(java.lang.String platformName) {
        this.platformName = platformName;
    }


    /**
     * Gets the type value for this ShoppingServiceException.
     * 
     * @return type
     */
    public co.com.colombiamovil.comprasterceros.service.BussinesExceptionType getType() {
        return type;
    }


    /**
     * Sets the type value for this ShoppingServiceException.
     * 
     * @param type
     */
    public void setType(co.com.colombiamovil.comprasterceros.service.BussinesExceptionType type) {
        this.type = type;
    }


    /**
     * Gets the userMessage value for this ShoppingServiceException.
     * 
     * @return userMessage
     */
    public java.lang.String getUserMessage() {
        return userMessage;
    }


    /**
     * Sets the userMessage value for this ShoppingServiceException.
     * 
     * @param userMessage
     */
    public void setUserMessage(java.lang.String userMessage) {
        this.userMessage = userMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingServiceException)) return false;
        ShoppingServiceException other = (ShoppingServiceException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.message1==null && other.getMessage1()==null) || 
             (this.message1!=null &&
              this.message1.equals(other.getMessage1()))) &&
            ((this.platformMessage==null && other.getPlatformMessage()==null) || 
             (this.platformMessage!=null &&
              this.platformMessage.equals(other.getPlatformMessage()))) &&
            ((this.platformName==null && other.getPlatformName()==null) || 
             (this.platformName!=null &&
              this.platformName.equals(other.getPlatformName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userMessage==null && other.getUserMessage()==null) || 
             (this.userMessage!=null &&
              this.userMessage.equals(other.getUserMessage())));
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
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMessage1() != null) {
            _hashCode += getMessage1().hashCode();
        }
        if (getPlatformMessage() != null) {
            _hashCode += getPlatformMessage().hashCode();
        }
        if (getPlatformName() != null) {
            _hashCode += getPlatformName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserMessage() != null) {
            _hashCode += getUserMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingServiceException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "platformMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platformName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "platformName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "bussinesExceptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userMessage"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
