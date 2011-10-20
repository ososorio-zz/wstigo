/**
 * Category.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class Category  implements java.io.Serializable {
    private co.com.colombiamovil.comprasterceros.service.PostsaleAction activateProcess;

    private java.lang.String alias;

    private co.com.colombiamovil.comprasterceros.service.PostsaleAction cancelProcess;

    private java.lang.String createUser;

    private java.util.Calendar createdDate;

    private java.lang.Integer exclusive;

    private java.lang.Integer id;

    private java.lang.Integer masivo;

    private co.com.colombiamovil.comprasterceros.service.PostsaleAction modifyProcess;

    private java.lang.String name;

    private co.com.colombiamovil.comprasterceros.service.Provider provider;

    private java.lang.Integer status;

    public Category() {
    }

    public Category(
           co.com.colombiamovil.comprasterceros.service.PostsaleAction activateProcess,
           java.lang.String alias,
           co.com.colombiamovil.comprasterceros.service.PostsaleAction cancelProcess,
           java.lang.String createUser,
           java.util.Calendar createdDate,
           java.lang.Integer exclusive,
           java.lang.Integer id,
           java.lang.Integer masivo,
           co.com.colombiamovil.comprasterceros.service.PostsaleAction modifyProcess,
           java.lang.String name,
           co.com.colombiamovil.comprasterceros.service.Provider provider,
           java.lang.Integer status) {
           this.activateProcess = activateProcess;
           this.alias = alias;
           this.cancelProcess = cancelProcess;
           this.createUser = createUser;
           this.createdDate = createdDate;
           this.exclusive = exclusive;
           this.id = id;
           this.masivo = masivo;
           this.modifyProcess = modifyProcess;
           this.name = name;
           this.provider = provider;
           this.status = status;
    }


    /**
     * Gets the activateProcess value for this Category.
     * 
     * @return activateProcess
     */
    public co.com.colombiamovil.comprasterceros.service.PostsaleAction getActivateProcess() {
        return activateProcess;
    }


    /**
     * Sets the activateProcess value for this Category.
     * 
     * @param activateProcess
     */
    public void setActivateProcess(co.com.colombiamovil.comprasterceros.service.PostsaleAction activateProcess) {
        this.activateProcess = activateProcess;
    }


    /**
     * Gets the alias value for this Category.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this Category.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the cancelProcess value for this Category.
     * 
     * @return cancelProcess
     */
    public co.com.colombiamovil.comprasterceros.service.PostsaleAction getCancelProcess() {
        return cancelProcess;
    }


    /**
     * Sets the cancelProcess value for this Category.
     * 
     * @param cancelProcess
     */
    public void setCancelProcess(co.com.colombiamovil.comprasterceros.service.PostsaleAction cancelProcess) {
        this.cancelProcess = cancelProcess;
    }


    /**
     * Gets the createUser value for this Category.
     * 
     * @return createUser
     */
    public java.lang.String getCreateUser() {
        return createUser;
    }


    /**
     * Sets the createUser value for this Category.
     * 
     * @param createUser
     */
    public void setCreateUser(java.lang.String createUser) {
        this.createUser = createUser;
    }


    /**
     * Gets the createdDate value for this Category.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Category.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the exclusive value for this Category.
     * 
     * @return exclusive
     */
    public java.lang.Integer getExclusive() {
        return exclusive;
    }


    /**
     * Sets the exclusive value for this Category.
     * 
     * @param exclusive
     */
    public void setExclusive(java.lang.Integer exclusive) {
        this.exclusive = exclusive;
    }


    /**
     * Gets the id value for this Category.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Category.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the masivo value for this Category.
     * 
     * @return masivo
     */
    public java.lang.Integer getMasivo() {
        return masivo;
    }


    /**
     * Sets the masivo value for this Category.
     * 
     * @param masivo
     */
    public void setMasivo(java.lang.Integer masivo) {
        this.masivo = masivo;
    }


    /**
     * Gets the modifyProcess value for this Category.
     * 
     * @return modifyProcess
     */
    public co.com.colombiamovil.comprasterceros.service.PostsaleAction getModifyProcess() {
        return modifyProcess;
    }


    /**
     * Sets the modifyProcess value for this Category.
     * 
     * @param modifyProcess
     */
    public void setModifyProcess(co.com.colombiamovil.comprasterceros.service.PostsaleAction modifyProcess) {
        this.modifyProcess = modifyProcess;
    }


    /**
     * Gets the name value for this Category.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Category.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the provider value for this Category.
     * 
     * @return provider
     */
    public co.com.colombiamovil.comprasterceros.service.Provider getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this Category.
     * 
     * @param provider
     */
    public void setProvider(co.com.colombiamovil.comprasterceros.service.Provider provider) {
        this.provider = provider;
    }


    /**
     * Gets the status value for this Category.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Category.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Category)) return false;
        Category other = (Category) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activateProcess==null && other.getActivateProcess()==null) || 
             (this.activateProcess!=null &&
              this.activateProcess.equals(other.getActivateProcess()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.cancelProcess==null && other.getCancelProcess()==null) || 
             (this.cancelProcess!=null &&
              this.cancelProcess.equals(other.getCancelProcess()))) &&
            ((this.createUser==null && other.getCreateUser()==null) || 
             (this.createUser!=null &&
              this.createUser.equals(other.getCreateUser()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.exclusive==null && other.getExclusive()==null) || 
             (this.exclusive!=null &&
              this.exclusive.equals(other.getExclusive()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.masivo==null && other.getMasivo()==null) || 
             (this.masivo!=null &&
              this.masivo.equals(other.getMasivo()))) &&
            ((this.modifyProcess==null && other.getModifyProcess()==null) || 
             (this.modifyProcess!=null &&
              this.modifyProcess.equals(other.getModifyProcess()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              this.provider.equals(other.getProvider()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getActivateProcess() != null) {
            _hashCode += getActivateProcess().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getCancelProcess() != null) {
            _hashCode += getCancelProcess().hashCode();
        }
        if (getCreateUser() != null) {
            _hashCode += getCreateUser().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getExclusive() != null) {
            _hashCode += getExclusive().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMasivo() != null) {
            _hashCode += getMasivo().hashCode();
        }
        if (getModifyProcess() != null) {
            _hashCode += getModifyProcess().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProvider() != null) {
            _hashCode += getProvider().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Category.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "category"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activateProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "postsaleAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "postsaleAction"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("masivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "postsaleAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provider");
        elemField.setXmlName(new javax.xml.namespace.QName("", "provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "provider"));
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
