/**
 * ConsultaProveedoresResponseDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class ConsultaProveedoresResponseDTO  implements java.io.Serializable {
    private java.lang.String accion;

    private java.lang.String categoria;

    private java.lang.String estado;

    private java.util.Calendar fecha;

    private java.lang.Integer idTransaccion;

    private java.lang.String identificacion;

    private java.lang.String movil;

    private java.lang.String nombreProveedor;

    private java.lang.String resultado;

    private java.lang.String servicio;

    private java.lang.String tipoIdentificacion;

    public ConsultaProveedoresResponseDTO() {
    }

    public ConsultaProveedoresResponseDTO(
           java.lang.String accion,
           java.lang.String categoria,
           java.lang.String estado,
           java.util.Calendar fecha,
           java.lang.Integer idTransaccion,
           java.lang.String identificacion,
           java.lang.String movil,
           java.lang.String nombreProveedor,
           java.lang.String resultado,
           java.lang.String servicio,
           java.lang.String tipoIdentificacion) {
           this.accion = accion;
           this.categoria = categoria;
           this.estado = estado;
           this.fecha = fecha;
           this.idTransaccion = idTransaccion;
           this.identificacion = identificacion;
           this.movil = movil;
           this.nombreProveedor = nombreProveedor;
           this.resultado = resultado;
           this.servicio = servicio;
           this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the accion value for this ConsultaProveedoresResponseDTO.
     * 
     * @return accion
     */
    public java.lang.String getAccion() {
        return accion;
    }


    /**
     * Sets the accion value for this ConsultaProveedoresResponseDTO.
     * 
     * @param accion
     */
    public void setAccion(java.lang.String accion) {
        this.accion = accion;
    }


    /**
     * Gets the categoria value for this ConsultaProveedoresResponseDTO.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this ConsultaProveedoresResponseDTO.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the estado value for this ConsultaProveedoresResponseDTO.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ConsultaProveedoresResponseDTO.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the fecha value for this ConsultaProveedoresResponseDTO.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this ConsultaProveedoresResponseDTO.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the idTransaccion value for this ConsultaProveedoresResponseDTO.
     * 
     * @return idTransaccion
     */
    public java.lang.Integer getIdTransaccion() {
        return idTransaccion;
    }


    /**
     * Sets the idTransaccion value for this ConsultaProveedoresResponseDTO.
     * 
     * @param idTransaccion
     */
    public void setIdTransaccion(java.lang.Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }


    /**
     * Gets the identificacion value for this ConsultaProveedoresResponseDTO.
     * 
     * @return identificacion
     */
    public java.lang.String getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this ConsultaProveedoresResponseDTO.
     * 
     * @param identificacion
     */
    public void setIdentificacion(java.lang.String identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the movil value for this ConsultaProveedoresResponseDTO.
     * 
     * @return movil
     */
    public java.lang.String getMovil() {
        return movil;
    }


    /**
     * Sets the movil value for this ConsultaProveedoresResponseDTO.
     * 
     * @param movil
     */
    public void setMovil(java.lang.String movil) {
        this.movil = movil;
    }


    /**
     * Gets the nombreProveedor value for this ConsultaProveedoresResponseDTO.
     * 
     * @return nombreProveedor
     */
    public java.lang.String getNombreProveedor() {
        return nombreProveedor;
    }


    /**
     * Sets the nombreProveedor value for this ConsultaProveedoresResponseDTO.
     * 
     * @param nombreProveedor
     */
    public void setNombreProveedor(java.lang.String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }


    /**
     * Gets the resultado value for this ConsultaProveedoresResponseDTO.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this ConsultaProveedoresResponseDTO.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the servicio value for this ConsultaProveedoresResponseDTO.
     * 
     * @return servicio
     */
    public java.lang.String getServicio() {
        return servicio;
    }


    /**
     * Sets the servicio value for this ConsultaProveedoresResponseDTO.
     * 
     * @param servicio
     */
    public void setServicio(java.lang.String servicio) {
        this.servicio = servicio;
    }


    /**
     * Gets the tipoIdentificacion value for this ConsultaProveedoresResponseDTO.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this ConsultaProveedoresResponseDTO.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaProveedoresResponseDTO)) return false;
        ConsultaProveedoresResponseDTO other = (ConsultaProveedoresResponseDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accion==null && other.getAccion()==null) || 
             (this.accion!=null &&
              this.accion.equals(other.getAccion()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.idTransaccion==null && other.getIdTransaccion()==null) || 
             (this.idTransaccion!=null &&
              this.idTransaccion.equals(other.getIdTransaccion()))) &&
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.movil==null && other.getMovil()==null) || 
             (this.movil!=null &&
              this.movil.equals(other.getMovil()))) &&
            ((this.nombreProveedor==null && other.getNombreProveedor()==null) || 
             (this.nombreProveedor!=null &&
              this.nombreProveedor.equals(other.getNombreProveedor()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.servicio==null && other.getServicio()==null) || 
             (this.servicio!=null &&
              this.servicio.equals(other.getServicio()))) &&
            ((this.tipoIdentificacion==null && other.getTipoIdentificacion()==null) || 
             (this.tipoIdentificacion!=null &&
              this.tipoIdentificacion.equals(other.getTipoIdentificacion())));
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
        if (getAccion() != null) {
            _hashCode += getAccion().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getIdTransaccion() != null) {
            _hashCode += getIdTransaccion().hashCode();
        }
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getMovil() != null) {
            _hashCode += getMovil().hashCode();
        }
        if (getNombreProveedor() != null) {
            _hashCode += getNombreProveedor().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getServicio() != null) {
            _hashCode += getServicio().hashCode();
        }
        if (getTipoIdentificacion() != null) {
            _hashCode += getTipoIdentificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaProveedoresResponseDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "consultaProveedoresResponseDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTransaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTransaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "movil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoIdentificacion"));
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
