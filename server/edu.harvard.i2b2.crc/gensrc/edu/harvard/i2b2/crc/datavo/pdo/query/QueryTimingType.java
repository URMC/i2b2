//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.13 at 11:04:35 AM EDT 
//


package edu.harvard.i2b2.crc.datavo.pdo.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryTimingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="queryTimingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="SAME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "queryTimingType")
@XmlEnum
public enum QueryTimingType {

    ANY,
    SAME;

    public String value() {
        return name();
    }

    public static QueryTimingType fromValue(String v) {
        return valueOf(v);
    }

}