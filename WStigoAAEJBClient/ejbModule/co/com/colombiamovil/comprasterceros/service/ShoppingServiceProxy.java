package co.com.colombiamovil.comprasterceros.service;

public class ShoppingServiceProxy implements co.com.colombiamovil.comprasterceros.service.ShoppingService {
  private String _endpoint = null;
  private co.com.colombiamovil.comprasterceros.service.ShoppingService shoppingService = null;
  
  public ShoppingServiceProxy() {
    _initShoppingServiceProxy();
  }
  
  public ShoppingServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initShoppingServiceProxy();
  }
  
  private void _initShoppingServiceProxy() {
    try {
      shoppingService = (new co.com.colombiamovil.comprasterceros.service.ShoppingServiceServiceLocator()).getShoppingServicePort();
      if (shoppingService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shoppingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shoppingService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shoppingService != null)
      ((javax.xml.rpc.Stub)shoppingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.colombiamovil.comprasterceros.service.ShoppingService getShoppingService() {
    if (shoppingService == null)
      _initShoppingServiceProxy();
    return shoppingService;
  }
  
  public co.com.colombiamovil.comprasterceros.service.Service[] availableServices(java.lang.String msisdn, java.lang.Integer categoryId) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException{
    if (shoppingService == null)
      _initShoppingServiceProxy();
    return shoppingService.availableServices(msisdn, categoryId);
  }
  
  public co.com.colombiamovil.comprasterceros.service.ShoppingResponseDTO processService(co.com.colombiamovil.comprasterceros.service.ShoppingRequestDTO request) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException{
    if (shoppingService == null)
      _initShoppingServiceProxy();
    return shoppingService.processService(request);
  }
  
  public co.com.colombiamovil.comprasterceros.service.Service[] purchasedServices(java.lang.String msisdn) throws java.rmi.RemoteException, co.com.colombiamovil.comprasterceros.service.ShoppingServiceException{
    if (shoppingService == null)
      _initShoppingServiceProxy();
    return shoppingService.purchasedServices(msisdn);
  }
  
  
}