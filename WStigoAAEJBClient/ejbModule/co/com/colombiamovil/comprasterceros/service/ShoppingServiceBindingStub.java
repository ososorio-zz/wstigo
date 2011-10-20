/**
 * ShoppingServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.colombiamovil.comprasterceros.service;

public class ShoppingServiceBindingStub extends org.apache.axis.client.Stub implements co.com.colombiamovil.comprasterceros.service.ShoppingService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("availableServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "msisdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "categoryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "service"));
        oper.setReturnClass(co.com.colombiamovil.comprasterceros.service.Service[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException"),
                      "co.com.colombiamovil.comprasterceros.service.ShoppingServiceException",
                      new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "shoppingRequestDTO"), co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "shoppingResponseDTO"));
        oper.setReturnClass(co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException"),
                      "co.com.colombiamovil.comprasterceros.service.ShoppingServiceException",
                      new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("purchasedServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "msisdn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "service"));
        oper.setReturnClass(co.com.colombiamovil.comprasterceros.service.Service[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException"),
                      "co.com.colombiamovil.comprasterceros.service.ShoppingServiceException",
                      new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException"), 
                      true
                     ));
        _operations[2] = oper;

    }

    public ShoppingServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ShoppingServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ShoppingServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "bussinesExceptionType");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.BussinesExceptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "category");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.Category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "param");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.Param.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "paramDTO");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.ParamDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "postsaleAction");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.PostsaleAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "processActionEnum");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.ProcessActionEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "provider");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.Provider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "service");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.Service.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "shoppingRequestDTO");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "shoppingResponseDTO");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "ShoppingServiceException");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.ShoppingServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "transParamValue");
            cachedSerQNames.add(qName);
            cls = co.com.colombiamovil.comprasterceros.service.TransParamValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public co.com.colombiamovil.comprasterceros.service.Service[] availableServices(java.lang.String msisdn, java.lang.Integer categoryId) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "availableServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {msisdn, categoryId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.colombiamovil.comprasterceros.service.Service[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.colombiamovil.comprasterceros.service.Service[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.colombiamovil.comprasterceros.service.Service[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.colombiamovil.comprasterceros.service.ShoppingServiceException) {
              throw (co.com.colombiamovil.comprasterceros.service.ShoppingServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO processService(co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO request) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "processService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.colombiamovil.comprasterceros.service.ShoppingServiceException) {
              throw (co.com.colombiamovil.comprasterceros.service.ShoppingServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public co.com.colombiamovil.comprasterceros.service.Service[] purchasedServices(java.lang.String msisdn) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://service.comprasterceros.colombiamovil.com.co/", "purchasedServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {msisdn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (co.com.colombiamovil.comprasterceros.service.Service[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (co.com.colombiamovil.comprasterceros.service.Service[]) org.apache.axis.utils.JavaUtils.convert(_resp, co.com.colombiamovil.comprasterceros.service.Service[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof co.com.colombiamovil.comprasterceros.service.ShoppingServiceException) {
              throw (co.com.colombiamovil.comprasterceros.service.ShoppingServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
