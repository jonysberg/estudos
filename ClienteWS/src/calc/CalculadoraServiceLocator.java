/**
 * CalculadoraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package calc;

public class CalculadoraServiceLocator extends org.apache.axis.client.Service implements calc.CalculadoraService {

    public CalculadoraServiceLocator() {
    }


    public CalculadoraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraPort
    private java.lang.String CalculadoraPort_address = "http://localhost:8080/TesteServer/CalculadoraService";

    public java.lang.String getCalculadoraPortAddress() {
        return CalculadoraPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraPortWSDDServiceName = "CalculadoraPort";

    public java.lang.String getCalculadoraPortWSDDServiceName() {
        return CalculadoraPortWSDDServiceName;
    }

    public void setCalculadoraPortWSDDServiceName(java.lang.String name) {
        CalculadoraPortWSDDServiceName = name;
    }

    public calc.Calculadora getCalculadoraPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraPort(endpoint);
    }

    public calc.Calculadora getCalculadoraPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            calc.CalculadoraServiceSoapBindingStub _stub = new calc.CalculadoraServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraPortEndpointAddress(java.lang.String address) {
        CalculadoraPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (calc.Calculadora.class.isAssignableFrom(serviceEndpointInterface)) {
                calc.CalculadoraServiceSoapBindingStub _stub = new calc.CalculadoraServiceSoapBindingStub(new java.net.URL(CalculadoraPort_address), this);
                _stub.setPortName(getCalculadoraPortWSDDServiceName());
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
        if ("CalculadoraPort".equals(inputPortName)) {
            return getCalculadoraPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://calc/", "CalculadoraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://calc/", "CalculadoraPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraPort".equals(portName)) {
            setCalculadoraPortEndpointAddress(address);
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
