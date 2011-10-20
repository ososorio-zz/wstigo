/**
 * PostsaleAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class PostsaleAction  implements java.io.Serializable {
    private java.lang.Integer actionId;

    private java.lang.String actionName;

    private java.lang.Integer actionTypeId;

    private java.lang.String description;

    private co.com.colombiamovil.comprasterceros.service.Param[] params;

    public PostsaleAction() {
    }

    public PostsaleAction(
           java.lang.Integer actionId,
           java.lang.String actionName,
           java.lang.Integer actionTypeId,
           java.lang.String description,
           co.com.colombiamovil.comprasterceros.service.Param[] params) {
           this.actionId = actionId;
           this.actionName = actionName;
           this.actionTypeId = actionTypeId;
           this.description = description;
           this.params = params;
    }


    /**
     * Gets the actionId value for this PostsaleAction.
     * 
     * @return actionId
     */
    public java.lang.Integer getActionId() {
        return actionId;
    }


    /**
     * Sets the actionId value for this PostsaleAction.
     * 
     * @param actionId
     */
    public void setActionId(java.lang.Integer actionId) {
        this.actionId = actionId;
    }


    /**
     * Gets the actionName value for this PostsaleAction.
     * 
     * @return actionName
     */
    public java.lang.String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this PostsaleAction.
     * 
     * @param actionName
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the actionTypeId value for this PostsaleAction.
     * 
     * @return actionTypeId
     */
    public java.lang.Integer getActionTypeId() {
        return actionTypeId;
    }


    /**
     * Sets the actionTypeId value for this PostsaleAction.
     * 
     * @param actionTypeId
     */
    public void setActionTypeId(java.lang.Integer actionTypeId) {
        this.actionTypeId = actionTypeId;
    }


    /**
     * Gets the description value for this PostsaleAction.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PostsaleAction.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the params value for this PostsaleAction.
     * 
     * @return params
     */
    public co.com.colombiamovil.comprasterceros.service.Param[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this PostsaleAction.
     * 
     * @param params
     */
    public void setParams(co.com.colombiamovil.comprasterceros.service.Param[] params) {
        this.params = params;
    }

    public co.com.colombiamovil.comprasterceros.service.Param getParams(int i) {
        return this.params[i];
    }

    public void setParams(int i, co.com.colombiamovil.comprasterceros.service.Param _value) {
        this.params[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostsaleAction)) return false;
        PostsaleAction other = (PostsaleAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionId==null && other.getActionId()==null) || 
             (this.actionId!=null &&
              this.actionId.equals(other.getActionId()))) &&
            ((this.actionName==null && other.getActionName()==null) || 
             (this.actionName!=null &&
              this.actionName.equals(other.getActionName()))) &&
            ((this.actionTypeId==null && other.getActionTypeId()==null) || 
             (this.actionTypeId!=null &&
              this.actionTypeId.equals(other.getActionTypeId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              java.util.Arrays.equals(this.params, other.getParams())));
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
        if (getActionId() != null) {
            _hashCode += getActionId().hashCode();
        }
        if (getActionName() != null) {
            _hashCode += getActionName().hashCode();
        }
        if (getActionTypeId() != null) {
            _hashCode += getActionTypeId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostsaleAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "postsaleAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("params");
        elemField.setXmlName(new javax.xml.namespace.QName("", "params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "param"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
