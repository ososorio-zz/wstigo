/**
 * BussinesExceptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class BussinesExceptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BussinesExceptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_ERROR_FOUND = "NO_ERROR_FOUND";
    public static final java.lang.String _DAO_EXCEPTION = "DAO_EXCEPTION";
    public static final java.lang.String _INVALID_EMAIL_FORMAT = "INVALID_EMAIL_FORMAT";
    public static final java.lang.String _ERROR_SENDING_EMAIL = "ERROR_SENDING_EMAIL";
    public static final java.lang.String _ALREADY_REGISTERED = "ALREADY_REGISTERED";
    public static final java.lang.String _NOT_ACQUIRED = "NOT_ACQUIRED";
    public static final java.lang.String _USER_NOTFOUND_EXCEPTION = "USER_NOTFOUND_EXCEPTION";
    public static final java.lang.String _PLATFORM_EXCEPTION = "PLATFORM_EXCEPTION";
    public static final java.lang.String _NORESULT_EXCEPTION = "NORESULT_EXCEPTION";
    public static final java.lang.String _SELECTS_EXCEPTION = "SELECTS_EXCEPTION";
    public static final java.lang.String _DUPLICATE_SERVICE = "DUPLICATE_SERVICE";
    public static final java.lang.String _INVALID_SERVICE = "INVALID_SERVICE";
    public static final java.lang.String _CONNECTION_EXCEPTION = "CONNECTION_EXCEPTION";
    public static final java.lang.String _FORBIDDEN = "FORBIDDEN";
    public static final java.lang.String _UNEXPECTED_EXCEPTION = "UNEXPECTED_EXCEPTION";
    public static final java.lang.String _BAD_PARAMETERS = "BAD_PARAMETERS";
    public static final java.lang.String _INVALID_IP_ADDRESS = "INVALID_IP_ADDRESS";
    public static final BussinesExceptionType NO_ERROR_FOUND = new BussinesExceptionType(_NO_ERROR_FOUND);
    public static final BussinesExceptionType DAO_EXCEPTION = new BussinesExceptionType(_DAO_EXCEPTION);
    public static final BussinesExceptionType INVALID_EMAIL_FORMAT = new BussinesExceptionType(_INVALID_EMAIL_FORMAT);
    public static final BussinesExceptionType ERROR_SENDING_EMAIL = new BussinesExceptionType(_ERROR_SENDING_EMAIL);
    public static final BussinesExceptionType ALREADY_REGISTERED = new BussinesExceptionType(_ALREADY_REGISTERED);
    public static final BussinesExceptionType NOT_ACQUIRED = new BussinesExceptionType(_NOT_ACQUIRED);
    public static final BussinesExceptionType USER_NOTFOUND_EXCEPTION = new BussinesExceptionType(_USER_NOTFOUND_EXCEPTION);
    public static final BussinesExceptionType PLATFORM_EXCEPTION = new BussinesExceptionType(_PLATFORM_EXCEPTION);
    public static final BussinesExceptionType NORESULT_EXCEPTION = new BussinesExceptionType(_NORESULT_EXCEPTION);
    public static final BussinesExceptionType SELECTS_EXCEPTION = new BussinesExceptionType(_SELECTS_EXCEPTION);
    public static final BussinesExceptionType DUPLICATE_SERVICE = new BussinesExceptionType(_DUPLICATE_SERVICE);
    public static final BussinesExceptionType INVALID_SERVICE = new BussinesExceptionType(_INVALID_SERVICE);
    public static final BussinesExceptionType CONNECTION_EXCEPTION = new BussinesExceptionType(_CONNECTION_EXCEPTION);
    public static final BussinesExceptionType FORBIDDEN = new BussinesExceptionType(_FORBIDDEN);
    public static final BussinesExceptionType UNEXPECTED_EXCEPTION = new BussinesExceptionType(_UNEXPECTED_EXCEPTION);
    public static final BussinesExceptionType BAD_PARAMETERS = new BussinesExceptionType(_BAD_PARAMETERS);
    public static final BussinesExceptionType INVALID_IP_ADDRESS = new BussinesExceptionType(_INVALID_IP_ADDRESS);
    public java.lang.String getValue() { return _value_;}
    public static BussinesExceptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BussinesExceptionType enumeration = (BussinesExceptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BussinesExceptionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BussinesExceptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "bussinesExceptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
