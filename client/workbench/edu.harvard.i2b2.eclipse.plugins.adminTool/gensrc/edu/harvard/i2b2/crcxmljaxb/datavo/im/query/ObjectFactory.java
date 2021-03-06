//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:19 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.im.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.harvard.i2b2.crcxmljaxb.datavo.im.query package. 
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

    private final static QName _KeySet_QNAME = new QName("http://www.i2b2.org/xsd/cell/im/", "keySet");
    private final static QName _IsKeySet_QNAME = new QName("http://www.i2b2.org/xsd/cell/im/", "is_key_set");
    private final static QName _GetAudit_QNAME = new QName("http://www.i2b2.org/xsd/cell/im/", "get_audit");
    private final static QName _Audits_QNAME = new QName("http://www.i2b2.org/xsd/cell/im/", "audits");
    private final static QName _SetKey_QNAME = new QName("http://www.i2b2.org/xsd/cell/im/", "set_key");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.harvard.i2b2.crcxmljaxb.datavo.im.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetKeyType }
     * 
     */
    public SetKeyType createSetKeyType() {
        return new SetKeyType();
    }

    /**
     * Create an instance of {@link AuditType }
     * 
     */
    public AuditType createAuditType() {
        return new AuditType();
    }

    /**
     * Create an instance of {@link GetAuditType }
     * 
     */
    public GetAuditType createGetAuditType() {
        return new GetAuditType();
    }

    /**
     * Create an instance of {@link AuditsType }
     * 
     */
    public AuditsType createAuditsType() {
        return new AuditsType();
    }

    /**
     * Create an instance of {@link IsKeySetType }
     * 
     */
    public IsKeySetType createIsKeySetType() {
        return new IsKeySetType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsKeySetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/im/", name = "keySet")
    public JAXBElement<IsKeySetType> createKeySet(IsKeySetType value) {
        return new JAXBElement<IsKeySetType>(_KeySet_QNAME, IsKeySetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/im/", name = "is_key_set")
    public JAXBElement<SetKeyType> createIsKeySet(SetKeyType value) {
        return new JAXBElement<SetKeyType>(_IsKeySet_QNAME, SetKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuditType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/im/", name = "get_audit")
    public JAXBElement<GetAuditType> createGetAudit(GetAuditType value) {
        return new JAXBElement<GetAuditType>(_GetAudit_QNAME, GetAuditType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/im/", name = "audits")
    public JAXBElement<AuditsType> createAudits(AuditsType value) {
        return new JAXBElement<AuditsType>(_Audits_QNAME, AuditsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.i2b2.org/xsd/cell/im/", name = "set_key")
    public JAXBElement<SetKeyType> createSetKey(SetKeyType value) {
        return new JAXBElement<SetKeyType>(_SetKey_QNAME, SetKeyType.class, null, value);
    }

}
