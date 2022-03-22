
package europeSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nextCursorMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="request" type="{http://webservice.cdb.ebi.ac.uk/}request" minOccurs="0"/>
 *         &lt;element name="profileList" type="{http://webservice.cdb.ebi.ac.uk/}profileListBean" minOccurs="0"/>
 *         &lt;element name="resultList" type="{http://webservice.cdb.ebi.ac.uk/}resultList" minOccurs="0"/>
 *         &lt;element name="dbCountList" type="{http://webservice.cdb.ebi.ac.uk/}dbCountList" minOccurs="0"/>
 *         &lt;element name="dbCrossReferenceList" type="{http://webservice.cdb.ebi.ac.uk/}dbCrossReferenceList" minOccurs="0"/>
 *         &lt;element name="citationList" type="{http://webservice.cdb.ebi.ac.uk/}citationList" minOccurs="0"/>
 *         &lt;element name="referenceList" type="{http://webservice.cdb.ebi.ac.uk/}referencesList" minOccurs="0"/>
 *         &lt;element name="semanticTypeCountList" type="{http://webservice.cdb.ebi.ac.uk/}semanticTypeCounts" minOccurs="0"/>
 *         &lt;element name="semanticTypeList" type="{http://webservice.cdb.ebi.ac.uk/}minedTermsList" minOccurs="0"/>
 *         &lt;element name="searchTermList" type="{http://webservice.cdb.ebi.ac.uk/}searchTerms" minOccurs="0"/>
 *         &lt;element name="fullTextXML" type="{http://webservice.cdb.ebi.ac.uk/}fullTextXML" minOccurs="0"/>
 *         &lt;element name="linksCountList" type="{http://webservice.cdb.ebi.ac.uk/}labsProviderCountList" minOccurs="0"/>
 *         &lt;element name="providers" type="{http://webservice.cdb.ebi.ac.uk/}labsProviders" minOccurs="0"/>
 *         &lt;element name="dataLinkList" type="{https://www.europepmc.org/data}dataLinks" minOccurs="0"/>
 *         &lt;element name="fullTextImageList" type="{http://webservice.cdb.ebi.ac.uk/}fullTextImageList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseWrapper", propOrder = {
    "version",
    "hitCount",
    "nextCursorMark",
    "nextPageUrl",
    "request",
    "profileList",
    "resultList",
    "dbCountList",
    "dbCrossReferenceList",
    "citationList",
    "referenceList",
    "semanticTypeCountList",
    "semanticTypeList",
    "searchTermList",
    "fullTextXML",
    "linksCountList",
    "providers",
    "dataLinkList",
    "fullTextImageList"
})
public class ResponseWrapper {

    protected String version;
    protected Integer hitCount;
    protected String nextCursorMark;
    protected String nextPageUrl;
    protected Request request;
    protected ProfileListBean profileList;
    protected ResultList resultList;
    protected DbCountList dbCountList;
    protected DbCrossReferenceList dbCrossReferenceList;
    protected CitationList citationList;
    protected ReferencesList referenceList;
    protected SemanticTypeCounts semanticTypeCountList;
    protected MinedTermsList semanticTypeList;
    protected SearchTerms searchTermList;
    protected FullTextXML fullTextXML;
    protected LabsProviderCountList linksCountList;
    protected LabsProviders providers;
    protected DataLinks dataLinkList;
    protected FullTextImageList fullTextImageList;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the hitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHitCount() {
        return hitCount;
    }

    /**
     * Sets the value of the hitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHitCount(Integer value) {
        this.hitCount = value;
    }

    /**
     * Gets the value of the nextCursorMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextCursorMark() {
        return nextCursorMark;
    }

    /**
     * Sets the value of the nextCursorMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextCursorMark(String value) {
        this.nextCursorMark = value;
    }

    /**
     * Gets the value of the nextPageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextPageUrl() {
        return nextPageUrl;
    }

    /**
     * Sets the value of the nextPageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextPageUrl(String value) {
        this.nextPageUrl = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the profileList property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileListBean }
     *     
     */
    public ProfileListBean getProfileList() {
        return profileList;
    }

    /**
     * Sets the value of the profileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileListBean }
     *     
     */
    public void setProfileList(ProfileListBean value) {
        this.profileList = value;
    }

    /**
     * Gets the value of the resultList property.
     * 
     * @return
     *     possible object is
     *     {@link ResultList }
     *     
     */
    public ResultList getResultList() {
        return resultList;
    }

    /**
     * Sets the value of the resultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultList }
     *     
     */
    public void setResultList(ResultList value) {
        this.resultList = value;
    }

    /**
     * Gets the value of the dbCountList property.
     * 
     * @return
     *     possible object is
     *     {@link DbCountList }
     *     
     */
    public DbCountList getDbCountList() {
        return dbCountList;
    }

    /**
     * Sets the value of the dbCountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbCountList }
     *     
     */
    public void setDbCountList(DbCountList value) {
        this.dbCountList = value;
    }

    /**
     * Gets the value of the dbCrossReferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link DbCrossReferenceList }
     *     
     */
    public DbCrossReferenceList getDbCrossReferenceList() {
        return dbCrossReferenceList;
    }

    /**
     * Sets the value of the dbCrossReferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbCrossReferenceList }
     *     
     */
    public void setDbCrossReferenceList(DbCrossReferenceList value) {
        this.dbCrossReferenceList = value;
    }

    /**
     * Gets the value of the citationList property.
     * 
     * @return
     *     possible object is
     *     {@link CitationList }
     *     
     */
    public CitationList getCitationList() {
        return citationList;
    }

    /**
     * Sets the value of the citationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationList }
     *     
     */
    public void setCitationList(CitationList value) {
        this.citationList = value;
    }

    /**
     * Gets the value of the referenceList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesList }
     *     
     */
    public ReferencesList getReferenceList() {
        return referenceList;
    }

    /**
     * Sets the value of the referenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesList }
     *     
     */
    public void setReferenceList(ReferencesList value) {
        this.referenceList = value;
    }

    /**
     * Gets the value of the semanticTypeCountList property.
     * 
     * @return
     *     possible object is
     *     {@link SemanticTypeCounts }
     *     
     */
    public SemanticTypeCounts getSemanticTypeCountList() {
        return semanticTypeCountList;
    }

    /**
     * Sets the value of the semanticTypeCountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticTypeCounts }
     *     
     */
    public void setSemanticTypeCountList(SemanticTypeCounts value) {
        this.semanticTypeCountList = value;
    }

    /**
     * Gets the value of the semanticTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link MinedTermsList }
     *     
     */
    public MinedTermsList getSemanticTypeList() {
        return semanticTypeList;
    }

    /**
     * Sets the value of the semanticTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinedTermsList }
     *     
     */
    public void setSemanticTypeList(MinedTermsList value) {
        this.semanticTypeList = value;
    }

    /**
     * Gets the value of the searchTermList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTerms }
     *     
     */
    public SearchTerms getSearchTermList() {
        return searchTermList;
    }

    /**
     * Sets the value of the searchTermList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTerms }
     *     
     */
    public void setSearchTermList(SearchTerms value) {
        this.searchTermList = value;
    }

    /**
     * Gets the value of the fullTextXML property.
     * 
     * @return
     *     possible object is
     *     {@link FullTextXML }
     *     
     */
    public FullTextXML getFullTextXML() {
        return fullTextXML;
    }

    /**
     * Sets the value of the fullTextXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTextXML }
     *     
     */
    public void setFullTextXML(FullTextXML value) {
        this.fullTextXML = value;
    }

    /**
     * Gets the value of the linksCountList property.
     * 
     * @return
     *     possible object is
     *     {@link LabsProviderCountList }
     *     
     */
    public LabsProviderCountList getLinksCountList() {
        return linksCountList;
    }

    /**
     * Sets the value of the linksCountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabsProviderCountList }
     *     
     */
    public void setLinksCountList(LabsProviderCountList value) {
        this.linksCountList = value;
    }

    /**
     * Gets the value of the providers property.
     * 
     * @return
     *     possible object is
     *     {@link LabsProviders }
     *     
     */
    public LabsProviders getProviders() {
        return providers;
    }

    /**
     * Sets the value of the providers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabsProviders }
     *     
     */
    public void setProviders(LabsProviders value) {
        this.providers = value;
    }

    /**
     * Gets the value of the dataLinkList property.
     * 
     * @return
     *     possible object is
     *     {@link DataLinks }
     *     
     */
    public DataLinks getDataLinkList() {
        return dataLinkList;
    }

    /**
     * Sets the value of the dataLinkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLinks }
     *     
     */
    public void setDataLinkList(DataLinks value) {
        this.dataLinkList = value;
    }

    /**
     * Gets the value of the fullTextImageList property.
     * 
     * @return
     *     possible object is
     *     {@link FullTextImageList }
     *     
     */
    public FullTextImageList getFullTextImageList() {
        return fullTextImageList;
    }

    /**
     * Sets the value of the fullTextImageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullTextImageList }
     *     
     */
    public void setFullTextImageList(FullTextImageList value) {
        this.fullTextImageList = value;
    }

}
