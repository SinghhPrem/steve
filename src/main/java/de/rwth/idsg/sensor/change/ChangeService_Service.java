
/*
 * 
 */

package de.rwth.idsg.sensor.change;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Sep 18 17:45:53 CEST 2013
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "ChangeService", 
                  wsdlLocation = "file:/Users/sgokay/git/steve/src/main/webapp/SensorChangeService.wsdl",
                  targetNamespace = "urn://de/rwth/idsg/sensor/change") 
public class ChangeService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn://de/rwth/idsg/sensor/change", "ChangeService");
    public final static QName ChangeServiceSOAP12 = new QName("urn://de/rwth/idsg/sensor/change", "ChangeServiceSOAP12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/sgokay/git/steve/src/main/webapp/SensorChangeService.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/Users/sgokay/git/steve/src/main/webapp/SensorChangeService.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public ChangeService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ChangeService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChangeService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ChangeService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public ChangeService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ChangeService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChangeService
     */
    @WebEndpoint(name = "ChangeServiceSOAP12")
    public ChangeService getChangeServiceSOAP12() {
        return super.getPort(ChangeServiceSOAP12, ChangeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChangeService
     */
    @WebEndpoint(name = "ChangeServiceSOAP12")
    public ChangeService getChangeServiceSOAP12(WebServiceFeature... features) {
        return super.getPort(ChangeServiceSOAP12, ChangeService.class, features);
    }

}
