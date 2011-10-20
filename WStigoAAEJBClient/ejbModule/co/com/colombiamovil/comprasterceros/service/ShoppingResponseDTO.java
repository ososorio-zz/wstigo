/**
 * ShoppingResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class ShoppingResponseDTO  implements java.io.Serializable {
    private java.lang.String answer;

    private java.lang.String txCode;

    private java.lang.String txStatus;

    private java.lang.String userMessage;

    public ShoppingResponseDTO() {
    }

    public ShoppingResponseDTO(
           java.lang.String answer,
           java.lang.String txCode,
           java.lang.String txStatus,
           java.lang.String userMessage) {
           this.answer = answer;
           this.txCode = txCode;
           this.txStatus = txStatus;
           this.userMessage = userMessage;
    }


    /**
     * Gets the answer value for this ShoppingResponseDTO.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this ShoppingResponseDTO.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the txCode value for this ShoppingResponseDTO.
     * 
     * @return txCode
     */
    public java.lang.String getTxCode() {
        return txCode;
    }


    /**
     * Sets the txCode value for this ShoppingResponseDTO.
     * 
     * @param txCode
     */
    public void setTxCode(java.lang.String txCode) {
        this.txCode = txCode;
    }


    /**
     * Gets the txStatus value for this ShoppingResponseDTO.
     * 
     * @return txStatus
     */
    public java.lang.String getTxStatus() {
        return txStatus;
    }


    /**
     * Sets the txStatus value for this ShoppingResponseDTO.
     * 
     * @param txStatus
     */
    public void setTxStatus(java.lang.String txStatus) {
        this.txStatus = txStatus;
    }


    /**
     * Gets the userMessage value for this ShoppingResponseDTO.
     * 
     * @return userMessage
     */
    public java.lang.String getUserMessage() {
        return userMessage;
    }


    /**
     * Sets the userMessage value for this ShoppingResponseDTO.
     * 
     * @param userMessage
     */
    public void setUserMessage(java.lang.String userMessage) {
        this.userMessage = userMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingResponseDTO)) return false;
        ShoppingResponseDTO other = (ShoppingResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.txCode==null && other.getTxCode()==null) || 
             (this.txCode!=null &&
              this.txCode.equals(other.getTxCode()))) &&
            ((this.txStatus==null && other.getTxStatus()==null) || 
             (this.txStatus!=null &&
              this.txStatus.equals(other.getTxStatus()))) &&
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
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getTxCode() != null) {
            _hashCode += getTxCode().hashCode();
        }
        if (getTxStatus() != null) {
            _hashCode += getTxStatus().hashCode();
        }
        if (getUserMessage() != null) {
            _hashCode += getUserMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "shoppingResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

}
