package org.my.enterprise;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-03-13T21:56:13.168-04:00
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://org/my/enterprise", name = "MyService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MyService {

    @WebMethod(action = "http://org/my/enterprise/1.0/getOperation")
    @WebResult(name = "parammeters", targetNamespace = "", partName = "parammeters")
    public GetOperationResponse processOperation(
        @WebParam(partName = "parameters", name = "parameters", targetNamespace = "")
        GetOperationRequest parameters
    );
}