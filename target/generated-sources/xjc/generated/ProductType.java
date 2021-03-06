//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.16 at 02:58:49 PM CET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cout" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="croissance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="revenu" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="vitesse" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="quantite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timeleft" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="managerUnlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="palliers" type="{}palliersType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productType", propOrder = {
    "id",
    "name",
    "logo",
    "cout",
    "croissance",
    "revenu",
    "vitesse",
    "quantite",
    "timeleft",
    "managerUnlocked",
    "palliers"
})
public class ProductType {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String logo;
    protected double cout;
    protected double croissance;
    protected double revenu;
    protected int vitesse;
    protected int quantite;
    protected long timeleft;
    protected boolean managerUnlocked;
    @XmlElement(required = true)
    protected PalliersType palliers;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

    /**
     * Gets the value of the cout property.
     * 
     */
    public double getCout() {
        return cout;
    }

    /**
     * Sets the value of the cout property.
     * 
     */
    public void setCout(double value) {
        this.cout = value;
    }

    /**
     * Gets the value of the croissance property.
     * 
     */
    public double getCroissance() {
        return croissance;
    }

    /**
     * Sets the value of the croissance property.
     * 
     */
    public void setCroissance(double value) {
        this.croissance = value;
    }

    /**
     * Gets the value of the revenu property.
     * 
     */
    public double getRevenu() {
        return revenu;
    }

    /**
     * Sets the value of the revenu property.
     * 
     */
    public void setRevenu(double value) {
        this.revenu = value;
    }

    /**
     * Gets the value of the vitesse property.
     * 
     */
    public int getVitesse() {
        return vitesse;
    }

    /**
     * Sets the value of the vitesse property.
     * 
     */
    public void setVitesse(int value) {
        this.vitesse = value;
    }

    /**
     * Gets the value of the quantite property.
     * 
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Sets the value of the quantite property.
     * 
     */
    public void setQuantite(int value) {
        this.quantite = value;
    }

    /**
     * Gets the value of the timeleft property.
     * 
     */
    public long getTimeleft() {
        return timeleft;
    }

    /**
     * Sets the value of the timeleft property.
     * 
     */
    public void setTimeleft(long value) {
        this.timeleft = value;
    }

    /**
     * Gets the value of the managerUnlocked property.
     * 
     */
    public boolean isManagerUnlocked() {
        return managerUnlocked;
    }

    /**
     * Sets the value of the managerUnlocked property.
     * 
     */
    public void setManagerUnlocked(boolean value) {
        this.managerUnlocked = value;
    }

    /**
     * Gets the value of the palliers property.
     * 
     * @return
     *     possible object is
     *     {@link PalliersType }
     *     
     */
    public PalliersType getPalliers() {
        return palliers;
    }

    /**
     * Sets the value of the palliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PalliersType }
     *     
     */
    public void setPalliers(PalliersType value) {
        this.palliers = value;
    }

}
