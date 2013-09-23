package de.rwth.idsg.steve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.rwth.idsg.sensor.inform.InformParkingRequest;
import de.rwth.idsg.sensor.inform.InformParkingResponse;
import de.rwth.idsg.sensor.inform.InformService;


/**
 * This class was generated by Apache CXF 2.3.1
 * Tue Sep 17 23:39:24 CEST 2013
 * Generated source version: 2.3.1
 * 
 */

@javax.jws.WebService(
		serviceName = "InformService",
		portName = "InformServiceSOAP12",
		targetNamespace = "http://idsg.informatik.rwth-aachen.de/",
		wsdlLocation = "file:/Users/sgokay/git/steve/src/main/webapp/SensorInformService.wsdl",
		endpointInterface = "de.rwth_aachen.informatik.idsg.InformService")

public class InformService_Impl implements InformService {

	private static final Logger LOG = LoggerFactory.getLogger(InformService_Impl.class);

	public InformParkingResponse informParking(InformParkingRequest parameters,java.lang.String chargeBoxIdentity) { 
		LOG.info("[SENSOR] Executing operation informParking");

		int connectorId = parameters.getConnectorId();
		String parkingStatus = parameters.getStatus().toString();

		System.out.println(chargeBoxIdentity);

		InformParkingResponse _return = new InformParkingResponse();
		return _return;

	}

}
