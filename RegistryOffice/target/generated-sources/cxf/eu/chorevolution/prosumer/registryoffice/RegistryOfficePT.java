package eu.chorevolution.prosumer.registryoffice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2018-05-02T15:44:11.895+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", name = "RegistryOfficePT")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface RegistryOfficePT {

    @WebMethod
    @WebResult(name = "receiveFarmRegistrationResponseElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public ReceiveFarmRegistrationResponseReturnType receiveFarmRegistrationResponse(
        @WebParam(partName = "parameters", name = "receiveFarmRegistrationResponseElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        ReceiveFarmRegistrationResponseType parameters
    );

    @WebMethod
    @WebResult(name = "sendFarmBusinessCodeStartupNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmBusinessCodeStartupNotificationReturnType sendFarmBusinessCodeStartupNotification(
        @WebParam(partName = "parameters", name = "sendFarmBusinessCodeStartupNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "sendFarmRegistrationNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmRegistrationNotificationReturnType sendFarmRegistrationNotification(
        @WebParam(partName = "parameters", name = "sendFarmRegistrationNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "sendFarmRegistrationRequestElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmRegistrationRequestReturnType sendFarmRegistrationRequest(
        @WebParam(partName = "parameters", name = "sendFarmRegistrationRequestElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        SendRequestType parameters
    );

    @WebMethod
    @WebResult(name = "farmOpeningNotificationElementResponse", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice", partName = "parameters")
    public FarmOpeningNotificationReturnType farmOpening(
        @WebParam(partName = "parameters", name = "farmOpeningNotificationElementRequest", targetNamespace = "http://eu.chorevolution.farmbusinessstartup/registryoffice")
        FarmOpeningNotificationType parameters
    );
}
