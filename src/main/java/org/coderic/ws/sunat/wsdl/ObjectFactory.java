
package org.coderic.ws.sunat.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.coderic.ws.sunat.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetStatus_QNAME = new QName("http://service.sunat.gob.pe", "getStatus");
    private static final QName _GetStatusResponse_QNAME = new QName("http://service.sunat.gob.pe", "getStatusResponse");
    private static final QName _SendBill_QNAME = new QName("http://service.sunat.gob.pe", "sendBill");
    private static final QName _SendBillResponse_QNAME = new QName("http://service.sunat.gob.pe", "sendBillResponse");
    private static final QName _SendPack_QNAME = new QName("http://service.sunat.gob.pe", "sendPack");
    private static final QName _SendPackResponse_QNAME = new QName("http://service.sunat.gob.pe", "sendPackResponse");
    private static final QName _SendSummary_QNAME = new QName("http://service.sunat.gob.pe", "sendSummary");
    private static final QName _SendSummaryResponse_QNAME = new QName("http://service.sunat.gob.pe", "sendSummaryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.coderic.ws.sunat.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     * @return
     *     the new instance of {@link GetStatus }
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetStatusResponse }
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link SendBill }
     * 
     * @return
     *     the new instance of {@link SendBill }
     */
    public SendBill createSendBill() {
        return new SendBill();
    }

    /**
     * Create an instance of {@link SendBillResponse }
     * 
     * @return
     *     the new instance of {@link SendBillResponse }
     */
    public SendBillResponse createSendBillResponse() {
        return new SendBillResponse();
    }

    /**
     * Create an instance of {@link SendPack }
     * 
     * @return
     *     the new instance of {@link SendPack }
     */
    public SendPack createSendPack() {
        return new SendPack();
    }

    /**
     * Create an instance of {@link SendPackResponse }
     * 
     * @return
     *     the new instance of {@link SendPackResponse }
     */
    public SendPackResponse createSendPackResponse() {
        return new SendPackResponse();
    }

    /**
     * Create an instance of {@link SendSummary }
     * 
     * @return
     *     the new instance of {@link SendSummary }
     */
    public SendSummary createSendSummary() {
        return new SendSummary();
    }

    /**
     * Create an instance of {@link SendSummaryResponse }
     * 
     * @return
     *     the new instance of {@link SendSummaryResponse }
     */
    public SendSummaryResponse createSendSummaryResponse() {
        return new SendSummaryResponse();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     * @return
     *     the new instance of {@link StatusResponse }
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendBill }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendBill }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "sendBill")
    public JAXBElement<SendBill> createSendBill(SendBill value) {
        return new JAXBElement<>(_SendBill_QNAME, SendBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendBillResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendBillResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "sendBillResponse")
    public JAXBElement<SendBillResponse> createSendBillResponse(SendBillResponse value) {
        return new JAXBElement<>(_SendBillResponse_QNAME, SendBillResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPack }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPack }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "sendPack")
    public JAXBElement<SendPack> createSendPack(SendPack value) {
        return new JAXBElement<>(_SendPack_QNAME, SendPack.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPackResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendPackResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "sendPackResponse")
    public JAXBElement<SendPackResponse> createSendPackResponse(SendPackResponse value) {
        return new JAXBElement<>(_SendPackResponse_QNAME, SendPackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSummary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendSummary }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "sendSummary")
    public JAXBElement<SendSummary> createSendSummary(SendSummary value) {
        return new JAXBElement<>(_SendSummary_QNAME, SendSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSummaryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendSummaryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sunat.gob.pe", name = "sendSummaryResponse")
    public JAXBElement<SendSummaryResponse> createSendSummaryResponse(SendSummaryResponse value) {
        return new JAXBElement<>(_SendSummaryResponse_QNAME, SendSummaryResponse.class, null, value);
    }

}
