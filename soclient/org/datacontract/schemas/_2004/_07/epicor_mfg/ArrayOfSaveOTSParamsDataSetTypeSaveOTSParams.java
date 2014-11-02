
package org.datacontract.schemas._2004._07.epicor_mfg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveOTSParamsDataSetTypeSaveOTSParams" type="{http://schemas.datacontract.org/2004/07/Epicor.Mfg.WS}SaveOTSParamsDataSetTypeSaveOTSParams" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams", propOrder = {
    "saveOTSParamsDataSetTypeSaveOTSParams"
})
public class ArrayOfSaveOTSParamsDataSetTypeSaveOTSParams {

    @XmlElement(name = "SaveOTSParamsDataSetTypeSaveOTSParams", nillable = true)
    protected List<SaveOTSParamsDataSetTypeSaveOTSParams> saveOTSParamsDataSetTypeSaveOTSParams;

    /**
     * Gets the value of the saveOTSParamsDataSetTypeSaveOTSParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saveOTSParamsDataSetTypeSaveOTSParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaveOTSParamsDataSetTypeSaveOTSParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaveOTSParamsDataSetTypeSaveOTSParams }
     * 
     * 
     */
    public List<SaveOTSParamsDataSetTypeSaveOTSParams> getSaveOTSParamsDataSetTypeSaveOTSParams() {
        if (saveOTSParamsDataSetTypeSaveOTSParams == null) {
            saveOTSParamsDataSetTypeSaveOTSParams = new ArrayList<SaveOTSParamsDataSetTypeSaveOTSParams>();
        }
        return this.saveOTSParamsDataSetTypeSaveOTSParams;
    }

}
