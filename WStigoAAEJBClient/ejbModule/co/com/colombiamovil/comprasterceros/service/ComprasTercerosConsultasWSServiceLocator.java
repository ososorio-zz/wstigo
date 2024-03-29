/**
 * ComprasTercerosConsultasWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

import java.util.ResourceBundle;

public class ComprasTercerosConsultasWSServiceLocator extends org.apache.axis.client.Service implements co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSService {

	ResourceBundle rb = ResourceBundle.getBundle("com.aa.business.ejb.interfaces.properties.conf");
	
    public ComprasTercerosConsultasWSServiceLocator() {
    }


    public ComprasTercerosConsultasWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ComprasTercerosConsultasWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ComprasTercerosConsultasWSPort
    private java.lang.String ComprasTercerosConsultasWSPort_address = rb.getString("ipWebServiceConsulta");

    public java.lang.String getComprasTercerosConsultasWSPortAddress() {
        return ComprasTercerosConsultasWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ComprasTercerosConsultasWSPortWSDDServiceName = "ComprasTercerosConsultasWSPort";

    public java.lang.String getComprasTercerosConsultasWSPortWSDDServiceName() {
        return ComprasTercerosConsultasWSPortWSDDServiceName;
    }

    public void setComprasTercerosConsultasWSPortWSDDServiceName(java.lang.String name) {
        ComprasTercerosConsultasWSPortWSDDServiceName = name;
    }

    public co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWS getComprasTercerosConsultasWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ComprasTercerosConsultasWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getComprasTercerosConsultasWSPort(endpoint);
    }

    public co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWS getComprasTercerosConsultasWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSBindingStub _stub = new co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSBindingStub(portAddress, this);
            _stub.setPortName(getComprasTercerosConsultasWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setComprasTercerosConsultasWSPortEndpointAddress(java.lang.String address) {
        ComprasTercerosConsultasWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWS.class.isAssignableFrom(serviceEndpointInterface)) {
                co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSBindingStub _stub = new co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSBindingStub(new java.net.URL(ComprasTercerosConsultasWSPort_address), this);
                _stub.setPortName(getComprasTercerosConsultasWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ComprasTercerosConsultasWSPort".equals(inputPortName)) {
            return getComprasTercerosConsultasWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ComprasTercerosConsultasWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ComprasTercerosConsultasWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ComprasTercerosConsultasWSPort".equals(portName)) {
            setComprasTercerosConsultasWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
