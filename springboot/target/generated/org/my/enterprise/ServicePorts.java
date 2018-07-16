package org.my.enterprise;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-03-13T21:56:06.364-04:00
 * Generated source version: 3.1.9
 * 
 */
@WebServiceClient(name = "ServicePorts", 
                  wsdlLocation = "file:/D:/workspace/Testing/springboot/src/main/resources/service/hello_world.wsdl",
                  targetNamespace = "http://org/my/enterprise") 
public class ServicePorts extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://org/my/enterprise", "ServicePorts");
    public final static QName MyService = new QName("http://org/my/enterprise", "MyService");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/workspace/Testing/springboot/src/main/resources/service/hello_world.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServicePorts.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/workspace/Testing/springboot/src/main/resources/service/hello_world.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServicePorts(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServicePorts(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicePorts() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ServicePorts(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ServicePorts(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ServicePorts(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyService")
    public MyService getMyService() {
        return super.getPort(MyService, MyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MyService
     */
    @WebEndpoint(name = "MyService")
    public MyService getMyService(WebServiceFeature... features) {
        return super.getPort(MyService, MyService.class, features);
    }

}