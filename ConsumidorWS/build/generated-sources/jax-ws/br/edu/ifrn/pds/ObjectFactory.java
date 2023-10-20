
package br.edu.ifrn.pds;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifrn.pds package. 
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

    private final static QName _AlterarFilme_QNAME = new QName("http://pds.ifrn.edu.br/", "alterarFilme");
    private final static QName _AlterarFilmeResponse_QNAME = new QName("http://pds.ifrn.edu.br/", "alterarFilmeResponse");
    private final static QName _BuscarFilme_QNAME = new QName("http://pds.ifrn.edu.br/", "buscarFilme");
    private final static QName _BuscarFilmeId_QNAME = new QName("http://pds.ifrn.edu.br/", "buscarFilmeId");
    private final static QName _BuscarFilmeIdResponse_QNAME = new QName("http://pds.ifrn.edu.br/", "buscarFilmeIdResponse");
    private final static QName _BuscarFilmeResponse_QNAME = new QName("http://pds.ifrn.edu.br/", "buscarFilmeResponse");
    private final static QName _BuscarTodos_QNAME = new QName("http://pds.ifrn.edu.br/", "buscarTodos");
    private final static QName _BuscarTodosResponse_QNAME = new QName("http://pds.ifrn.edu.br/", "buscarTodosResponse");
    private final static QName _InserirFilme_QNAME = new QName("http://pds.ifrn.edu.br/", "inserirFilme");
    private final static QName _InserirFilmeResponse_QNAME = new QName("http://pds.ifrn.edu.br/", "inserirFilmeResponse");
    private final static QName _RemoverFilme_QNAME = new QName("http://pds.ifrn.edu.br/", "removerFilme");
    private final static QName _RemoverFilmeResponse_QNAME = new QName("http://pds.ifrn.edu.br/", "removerFilmeResponse");
    private final static QName _VerificarExistencia_QNAME = new QName("http://pds.ifrn.edu.br/", "verificarExistencia");
    private final static QName _VerificarExistenciaResponse_QNAME = new QName("http://pds.ifrn.edu.br/", "verificarExistenciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifrn.pds
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlterarFilme }
     * 
     */
    public AlterarFilme createAlterarFilme() {
        return new AlterarFilme();
    }

    /**
     * Create an instance of {@link AlterarFilmeResponse }
     * 
     */
    public AlterarFilmeResponse createAlterarFilmeResponse() {
        return new AlterarFilmeResponse();
    }

    /**
     * Create an instance of {@link BuscarFilme }
     * 
     */
    public BuscarFilme createBuscarFilme() {
        return new BuscarFilme();
    }

    /**
     * Create an instance of {@link BuscarFilmeId }
     * 
     */
    public BuscarFilmeId createBuscarFilmeId() {
        return new BuscarFilmeId();
    }

    /**
     * Create an instance of {@link BuscarFilmeIdResponse }
     * 
     */
    public BuscarFilmeIdResponse createBuscarFilmeIdResponse() {
        return new BuscarFilmeIdResponse();
    }

    /**
     * Create an instance of {@link BuscarFilmeResponse }
     * 
     */
    public BuscarFilmeResponse createBuscarFilmeResponse() {
        return new BuscarFilmeResponse();
    }

    /**
     * Create an instance of {@link BuscarTodos }
     * 
     */
    public BuscarTodos createBuscarTodos() {
        return new BuscarTodos();
    }

    /**
     * Create an instance of {@link BuscarTodosResponse }
     * 
     */
    public BuscarTodosResponse createBuscarTodosResponse() {
        return new BuscarTodosResponse();
    }

    /**
     * Create an instance of {@link InserirFilme }
     * 
     */
    public InserirFilme createInserirFilme() {
        return new InserirFilme();
    }

    /**
     * Create an instance of {@link InserirFilmeResponse }
     * 
     */
    public InserirFilmeResponse createInserirFilmeResponse() {
        return new InserirFilmeResponse();
    }

    /**
     * Create an instance of {@link RemoverFilme }
     * 
     */
    public RemoverFilme createRemoverFilme() {
        return new RemoverFilme();
    }

    /**
     * Create an instance of {@link RemoverFilmeResponse }
     * 
     */
    public RemoverFilmeResponse createRemoverFilmeResponse() {
        return new RemoverFilmeResponse();
    }

    /**
     * Create an instance of {@link VerificarExistencia }
     * 
     */
    public VerificarExistencia createVerificarExistencia() {
        return new VerificarExistencia();
    }

    /**
     * Create an instance of {@link VerificarExistenciaResponse }
     * 
     */
    public VerificarExistenciaResponse createVerificarExistenciaResponse() {
        return new VerificarExistenciaResponse();
    }

    /**
     * Create an instance of {@link Filme }
     * 
     */
    public Filme createFilme() {
        return new Filme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarFilme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarFilme }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "alterarFilme")
    public JAXBElement<AlterarFilme> createAlterarFilme(AlterarFilme value) {
        return new JAXBElement<AlterarFilme>(_AlterarFilme_QNAME, AlterarFilme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarFilmeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarFilmeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "alterarFilmeResponse")
    public JAXBElement<AlterarFilmeResponse> createAlterarFilmeResponse(AlterarFilmeResponse value) {
        return new JAXBElement<AlterarFilmeResponse>(_AlterarFilmeResponse_QNAME, AlterarFilmeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFilme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarFilme }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "buscarFilme")
    public JAXBElement<BuscarFilme> createBuscarFilme(BuscarFilme value) {
        return new JAXBElement<BuscarFilme>(_BuscarFilme_QNAME, BuscarFilme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFilmeId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarFilmeId }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "buscarFilmeId")
    public JAXBElement<BuscarFilmeId> createBuscarFilmeId(BuscarFilmeId value) {
        return new JAXBElement<BuscarFilmeId>(_BuscarFilmeId_QNAME, BuscarFilmeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFilmeIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarFilmeIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "buscarFilmeIdResponse")
    public JAXBElement<BuscarFilmeIdResponse> createBuscarFilmeIdResponse(BuscarFilmeIdResponse value) {
        return new JAXBElement<BuscarFilmeIdResponse>(_BuscarFilmeIdResponse_QNAME, BuscarFilmeIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarFilmeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarFilmeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "buscarFilmeResponse")
    public JAXBElement<BuscarFilmeResponse> createBuscarFilmeResponse(BuscarFilmeResponse value) {
        return new JAXBElement<BuscarFilmeResponse>(_BuscarFilmeResponse_QNAME, BuscarFilmeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarTodos }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "buscarTodos")
    public JAXBElement<BuscarTodos> createBuscarTodos(BuscarTodos value) {
        return new JAXBElement<BuscarTodos>(_BuscarTodos_QNAME, BuscarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarTodosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "buscarTodosResponse")
    public JAXBElement<BuscarTodosResponse> createBuscarTodosResponse(BuscarTodosResponse value) {
        return new JAXBElement<BuscarTodosResponse>(_BuscarTodosResponse_QNAME, BuscarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirFilme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirFilme }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "inserirFilme")
    public JAXBElement<InserirFilme> createInserirFilme(InserirFilme value) {
        return new JAXBElement<InserirFilme>(_InserirFilme_QNAME, InserirFilme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirFilmeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirFilmeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "inserirFilmeResponse")
    public JAXBElement<InserirFilmeResponse> createInserirFilmeResponse(InserirFilmeResponse value) {
        return new JAXBElement<InserirFilmeResponse>(_InserirFilmeResponse_QNAME, InserirFilmeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverFilme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverFilme }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "removerFilme")
    public JAXBElement<RemoverFilme> createRemoverFilme(RemoverFilme value) {
        return new JAXBElement<RemoverFilme>(_RemoverFilme_QNAME, RemoverFilme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverFilmeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverFilmeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "removerFilmeResponse")
    public JAXBElement<RemoverFilmeResponse> createRemoverFilmeResponse(RemoverFilmeResponse value) {
        return new JAXBElement<RemoverFilmeResponse>(_RemoverFilmeResponse_QNAME, RemoverFilmeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarExistencia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarExistencia }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "verificarExistencia")
    public JAXBElement<VerificarExistencia> createVerificarExistencia(VerificarExistencia value) {
        return new JAXBElement<VerificarExistencia>(_VerificarExistencia_QNAME, VerificarExistencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarExistenciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificarExistenciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pds.ifrn.edu.br/", name = "verificarExistenciaResponse")
    public JAXBElement<VerificarExistenciaResponse> createVerificarExistenciaResponse(VerificarExistenciaResponse value) {
        return new JAXBElement<VerificarExistenciaResponse>(_VerificarExistenciaResponse_QNAME, VerificarExistenciaResponse.class, null, value);
    }

}
