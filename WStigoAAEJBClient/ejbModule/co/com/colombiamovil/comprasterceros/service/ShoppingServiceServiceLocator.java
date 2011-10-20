/**
 * ShoppingServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class ShoppingServiceServiceLocator extends org.apache.axis.client.Service implements co.com.colombiamovil.comprasterceros.service.ShoppingServiceService {

    public ShoppingServiceServiceLocator() {
    }


    public ShoppingServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShoppingServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ShoppingServicePort
    private java.lang.String ShoppingServicePort_address = "http://10.69.38.15:8080/ComprasTercerosEAR-ComprasTercerosEJB/ShoppingService";

    public java.lang.String getShoppingServicePortAddress() {
        return ShoppingServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ShoppingServicePortWSDDServiceName = "ShoppingServicePort";

    public java.lang.String getShoppingServicePortWSDDServiceName() {
        return ShoppingServicePortWSDDServiceName;
    }

    public void setShoppingServicePortWSDDServiceName(java.lang.String name) {
        ShoppingServicePortWSDDServiceName = name;
    }

    public co.com.colombiamovil.comprasterceros.service.ShoppingService getShoppingServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ShoppingServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getShoppingServicePort(endpoint);
    }

    public co.com.colombiamovil.comprasterceros.service.ShoppingService getShoppingServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.com.colombiamovil.comprasterceros.service.ShoppingServiceBindingStub _stub = new co.com.colombiamovil.comprasterceros.service.ShoppingServiceBindingStub(portAddress, this);
            _stub.setPortName(getShoppingServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setShoppingServicePortEndpointAddress(java.lang.String address) {
        ShoppingServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.com.colombiamovil.comprasterceros.service.ShoppingService.class.isAssignableFrom(serviceEndpointInterface)) {
                co.com.colombiamovil.comprasterceros.service.ShoppingServiceBindingStub _stub = new co.com.colombiamovil.comprasterceros.service.ShoppingServiceBindingStub(new java.net.URL(ShoppingServicePort_address), this);
                _stub.setPortName(getShoppingServicePortWSDDServiceName());
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
        if ("ShoppingServicePort".equals(inputPortName)) {
            return getShoppingServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ShoppingServicePort".equals(portName)) {
            setShoppingServicePortEndpointAddress(address);
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
