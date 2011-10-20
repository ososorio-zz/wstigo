/**
 * Provider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class Provider  implements java.io.Serializable {
    private java.util.Calendar createDate;

    private java.lang.String createUser;

    private java.lang.Integer id;

    private java.lang.String name;

    private java.lang.Integer perfil;

    private java.lang.String userName;

    private java.lang.String userPwd;

    private java.lang.String wsName;

    private java.lang.String wsNamespace;

    private java.lang.String wsWsdl;

    public Provider() {
    }

    public Provider(
           java.util.Calendar createDate,
           java.lang.String createUser,
           java.lang.Integer id,
           java.lang.String name,
           java.lang.Integer perfil,
           java.lang.String userName,
           java.lang.String userPwd,
           java.lang.String wsName,
           java.lang.String wsNamespace,
           java.lang.String wsWsdl) {
           this.createDate = createDate;
           this.createUser = createUser;
           this.id = id;
           this.name = name;
           this.perfil = perfil;
           this.userName = userName;
           this.userPwd = userPwd;
           this.wsName = wsName;
           this.wsNamespace = wsNamespace;
           this.wsWsdl = wsWsdl;
    }


    /**
     * Gets the createDate value for this Provider.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Provider.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the createUser value for this Provider.
     * 
     * @return createUser
     */
    public java.lang.String getCreateUser() {
        return createUser;
    }


    /**
     * Sets the createUser value for this Provider.
     * 
     * @param createUser
     */
    public void setCreateUser(java.lang.String createUser) {
        this.createUser = createUser;
    }


    /**
     * Gets the id value for this Provider.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Provider.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Provider.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Provider.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the perfil value for this Provider.
     * 
     * @return perfil
     */
    public java.lang.Integer getPerfil() {
        return perfil;
    }


    /**
     * Sets the perfil value for this Provider.
     * 
     * @param perfil
     */
    public void setPerfil(java.lang.Integer perfil) {
        this.perfil = perfil;
    }


    /**
     * Gets the userName value for this Provider.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Provider.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPwd value for this Provider.
     * 
     * @return userPwd
     */
    public java.lang.String getUserPwd() {
        return userPwd;
    }


    /**
     * Sets the userPwd value for this Provider.
     * 
     * @param userPwd
     */
    public void setUserPwd(java.lang.String userPwd) {
        this.userPwd = userPwd;
    }


    /**
     * Gets the wsName value for this Provider.
     * 
     * @return wsName
     */
    public java.lang.String getWsName() {
        return wsName;
    }


    /**
     * Sets the wsName value for this Provider.
     * 
     * @param wsName
     */
    public void setWsName(java.lang.String wsName) {
        this.wsName = wsName;
    }


    /**
     * Gets the wsNamespace value for this Provider.
     * 
     * @return wsNamespace
     */
    public java.lang.String getWsNamespace() {
        return wsNamespace;
    }


    /**
     * Sets the wsNamespace value for this Provider.
     * 
     * @param wsNamespace
     */
    public void setWsNamespace(java.lang.String wsNamespace) {
        this.wsNamespace = wsNamespace;
    }


    /**
     * Gets the wsWsdl value for this Provider.
     * 
     * @return wsWsdl
     */
    public java.lang.String getWsWsdl() {
        return wsWsdl;
    }


    /**
     * Sets the wsWsdl value for this Provider.
     * 
     * @param wsWsdl
     */
    public void setWsWsdl(java.lang.String wsWsdl) {
        this.wsWsdl = wsWsdl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Provider)) return false;
        Provider other = (Provider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.createUser==null && other.getCreateUser()==null) || 
             (this.createUser!=null &&
              this.createUser.equals(other.getCreateUser()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.perfil==null && other.getPerfil()==null) || 
             (this.perfil!=null &&
              this.perfil.equals(other.getPerfil()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPwd==null && other.getUserPwd()==null) || 
             (this.userPwd!=null &&
              this.userPwd.equals(other.getUserPwd()))) &&
            ((this.wsName==null && other.getWsName()==null) || 
             (this.wsName!=null &&
              this.wsName.equals(other.getWsName()))) &&
            ((this.wsNamespace==null && other.getWsNamespace()==null) || 
             (this.wsNamespace!=null &&
              this.wsNamespace.equals(other.getWsNamespace()))) &&
            ((this.wsWsdl==null && other.getWsWsdl()==null) || 
             (this.wsWsdl!=null &&
              this.wsWsdl.equals(other.getWsWsdl())));
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getCreateUser() != null) {
            _hashCode += getCreateUser().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPerfil() != null) {
            _hashCode += getPerfil().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPwd() != null) {
            _hashCode += getUserPwd().hashCode();
        }
        if (getWsName() != null) {
            _hashCode += getWsName().hashCode();
        }
        if (getWsNamespace() != null) {
            _hashCode += getWsNamespace().hashCode();
        }
        if (getWsWsdl() != null) {
            _hashCode += getWsWsdl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Provider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "provider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("perfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsWsdl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsWsdl"));
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
