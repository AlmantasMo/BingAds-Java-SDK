
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddingScheme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddingScheme", propOrder = {
    "type"
})
@XmlSeeAlso({
    TargetImpressionShareBiddingScheme.class,
    EnhancedCpcBiddingScheme.class,
    ManualCpvBiddingScheme.class,
    TargetCpaBiddingScheme.class,
    MaxConversionsBiddingScheme.class,
    MaxRoasBiddingScheme.class,
    MaxConversionValueBiddingScheme.class,
    ManualCpcBiddingScheme.class,
    CommissionBiddingScheme.class,
    InheritFromParentBiddingScheme.class,
    MaxClicksBiddingScheme.class,
    TargetRoasBiddingScheme.class,
    PercentCpcBiddingScheme.class,
    ManualCpmBiddingScheme.class
})
public class BiddingScheme {

    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
