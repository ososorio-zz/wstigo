/**
 * ProcessActionEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class ProcessActionEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProcessActionEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACQUIRE = "ACQUIRE";
    public static final java.lang.String _CANCEL = "CANCEL";
    public static final java.lang.String _ACQUIRE_MASSIVE = "ACQUIRE_MASSIVE";
    public static final java.lang.String _CANCEL_MASSIVE = "CANCEL_MASSIVE";
    public static final ProcessActionEnum ACQUIRE = new ProcessActionEnum(_ACQUIRE);
    public static final ProcessActionEnum CANCEL = new ProcessActionEnum(_CANCEL);
    public static final ProcessActionEnum ACQUIRE_MASSIVE = new ProcessActionEnum(_ACQUIRE_MASSIVE);
    public static final ProcessActionEnum CANCEL_MASSIVE = new ProcessActionEnum(_CANCEL_MASSIVE);
    public java.lang.String getValue() { return _value_;}
    public static ProcessActionEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProcessActionEnum enumeration = (ProcessActionEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProcessActionEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessActionEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "processActionEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
