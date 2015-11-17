package calc;

public class CalculadoraProxy implements calc.Calculadora {
  private String _endpoint = null;
  private calc.Calculadora calculadora = null;
  
  public CalculadoraProxy() {
    _initCalculadoraProxy();
  }
  
  public CalculadoraProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraProxy();
  }
  
  private void _initCalculadoraProxy() {
    try {
      calculadora = (new calc.CalculadoraServiceLocator()).getCalculadoraPort();
      if (calculadora != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadora)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadora != null)
      ((javax.xml.rpc.Stub)calculadora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public calc.Calculadora getCalculadora() {
    if (calculadora == null)
      _initCalculadoraProxy();
    return calculadora;
  }
  
  public int add(int arg0, int arg1) throws java.rmi.RemoteException{
    if (calculadora == null)
      _initCalculadoraProxy();
    return calculadora.add(arg0, arg1);
  }
  
  
}