package co.com.colombiamovil.comprasterceros.service;

public class ComprasTercerosConsultasWSProxy implements co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWS {
  private String _endpoint = null;
  private co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWS comprasTercerosConsultasWS = null;
  
  public ComprasTercerosConsultasWSProxy() {
    _initComprasTercerosConsultasWSProxy();
  }
  
  public ComprasTercerosConsultasWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initComprasTercerosConsultasWSProxy();
  }
  
  private void _initComprasTercerosConsultasWSProxy() {
    try {
      comprasTercerosConsultasWS = (new co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWSServiceLocator()).getComprasTercerosConsultasWSPort();
      if (comprasTercerosConsultasWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)comprasTercerosConsultasWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)comprasTercerosConsultasWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (comprasTercerosConsultasWS != null)
      ((javax.xml.rpc.Stub)comprasTercerosConsultasWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.colombiamovil.comprasterceros.service.ComprasTercerosConsultasWS getComprasTercerosConsultasWS() {
    if (comprasTercerosConsultasWS == null)
      _initComprasTercerosConsultasWSProxy();
    return comprasTercerosConsultasWS;
  }
  
  public co.com.colombiamovil.comprasterceros.service.ConsultaProveedoresResponseDTO[] consultaProveedores(int codigoProveedor, java.lang.String fechaInicial, java.lang.String fechaFinal) throws java.rmi.RemoteException{
    if (comprasTercerosConsultasWS == null)
      _initComprasTercerosConsultasWSProxy();
    return comprasTercerosConsultasWS.consultaProveedores(codigoProveedor, fechaInicial, fechaFinal);
  }
  
  
}