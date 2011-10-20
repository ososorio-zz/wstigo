/**
 * Param.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class Param  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Integer paramId;

    private java.lang.Integer size;

    private co.com.colombiamovil.comprasterceros.service.TransParamValue[] transParamValues;

    private java.lang.String value;

    public Param() {
    }

    public Param(
           java.lang.String name,
           java.lang.Integer paramId,
           java.lang.Integer size,
           co.com.colombiamovil.comprasterceros.service.TransParamValue[] transParamValues,
           java.lang.String value) {
           this.name = name;
           this.paramId = paramId;
           this.size = size;
           this.transParamValues = transParamValues;
           this.value = value;
    }


    /**
     * Gets the name value for this Param.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Param.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the paramId value for this Param.
     * 
     * @return paramId
     */
    public java.lang.Integer getParamId() {
        return paramId;
    }


    /**
     * Sets the paramId value for this Param.
     * 
     * @param paramId
     */
    public void setParamId(java.lang.Integer paramId) {
        this.paramId = paramId;
    }


    /**
     * Gets the size value for this Param.
     * 
     * @return size
     */
    public java.lang.Integer getSize() {
        return size;
    }


    /**
     * Sets the size value for this Param.
     * 
     * @param size
     */
    public void setSize(java.lang.Integer size) {
        this.size = size;
    }


    /**
     * Gets the transParamValues value for this Param.
     * 
     * @return transParamValues
     */
    public co.com.colombiamovil.comprasterceros.service.TransParamValue[] getTransParamValues() {
        return transParamValues;
    }


    /**
     * Sets the transParamValues value for this Param.
     * 
     * @param transParamValues
     */
    public void setTransParamValues(co.com.colombiamovil.comprasterceros.service.TransParamValue[] transParamValues) {
        this.transParamValues = transParamValues;
    }

    public co.com.colombiamovil.comprasterceros.service.TransParamValue getTransParamValues(int i) {
        return this.transParamValues[i];
    }

    public void setTransParamValues(int i, co.com.colombiamovil.comprasterceros.service.TransParamValue _value) {
        this.transParamValues[i] = _value;
    }


    /**
     * Gets the value value for this Param.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Param.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Param)) return false;
        Param other = (Param) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.paramId==null && other.getParamId()==null) || 
             (this.paramId!=null &&
              this.paramId.equals(other.getParamId()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.transParamValues==null && other.getTransParamValues()==null) || 
             (this.transParamValues!=null &&
              java.util.Arrays.equals(this.transParamValues, other.getTransParamValues()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParamId() != null) {
            _hashCode += getParamId().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getTransParamValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransParamValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransParamValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Param.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "param"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transParamValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transParamValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "transParamValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
