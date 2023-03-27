
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private static final QName _Compte_QNAME = new QName("http://services/", "compte");
    private static final QName _ConvertEuroToDh_QNAME = new QName("http://services/", "convertEuroToDh");
    private static final QName _ConvertEuroToDhResponse_QNAME = new QName("http://services/", "convertEuroToDhResponse");
    private static final QName _GetCompte_QNAME = new QName("http://services/", "getCompte");
    private static final QName _GetCompteList_QNAME = new QName("http://services/", "getCompteList");
    private static final QName _GetCompteListResponse_QNAME = new QName("http://services/", "getCompteListResponse");
    private static final QName _GetCompteResponse_QNAME = new QName("http://services/", "getCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ConvertEuroToDh }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDh }
     */
    public ConvertEuroToDh createConvertEuroToDh() {
        return new ConvertEuroToDh();
    }

    /**
     * Create an instance of {@link ConvertEuroToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDhResponse }
     */
    public ConvertEuroToDhResponse createConvertEuroToDhResponse() {
        return new ConvertEuroToDhResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteList }
     * 
     * @return
     *     the new instance of {@link GetCompteList }
     */
    public GetCompteList createGetCompteList() {
        return new GetCompteList();
    }

    /**
     * Create an instance of {@link GetCompteListResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteListResponse }
     */
    public GetCompteListResponse createGetCompteListResponse() {
        return new GetCompteListResponse();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "convertEuroToDh")
    public JAXBElement<ConvertEuroToDh> createConvertEuroToDh(ConvertEuroToDh value) {
        return new JAXBElement<>(_ConvertEuroToDh_QNAME, ConvertEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "convertEuroToDhResponse")
    public JAXBElement<ConvertEuroToDhResponse> createConvertEuroToDhResponse(ConvertEuroToDhResponse value) {
        return new JAXBElement<>(_ConvertEuroToDhResponse_QNAME, ConvertEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteList }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getCompteList")
    public JAXBElement<GetCompteList> createGetCompteList(GetCompteList value) {
        return new JAXBElement<>(_GetCompteList_QNAME, GetCompteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getCompteListResponse")
    public JAXBElement<GetCompteListResponse> createGetCompteListResponse(GetCompteListResponse value) {
        return new JAXBElement<>(_GetCompteListResponse_QNAME, GetCompteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

}
