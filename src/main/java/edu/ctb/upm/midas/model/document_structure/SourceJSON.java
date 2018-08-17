package edu.ctb.upm.midas.model.document_structure;

import java.util.List;
import java.util.TreeMap;

/**
 * Created by gerardo on 03/05/2017.
 *
 * @author Gerardo Lagunes G. ${EMAIL}
 * @version ${<VERSION>}
 * @project ExtractionInformationDiseasesMayoClinic
 * @className LoadSource
 * @see
 */
public class SourceJSON {

    private int id;
    private String code;
    private String name;
    private Link url;

    private Integer documentCount;
    private List<DocJSON> documents;
    private TreeMap<String, String> sectionMap;


    public SourceJSON() {
    }

    public SourceJSON(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public SourceJSON(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public SourceJSON(int id, String code, String name, Link url) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Link getUrl() {
        return url;
    }

    public void setUrl(Link url) {
        this.url = url;
    }

    public Integer getDocumentCount() {
        return documentCount;
    }

    public void setDocumentCount(Integer documentCount) {
        this.documentCount = documentCount;
    }

    public List<DocJSON> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocJSON> documents) {
        this.documents = documents;
        if (this.documents!=null) this.documentCount = this.documents.size();
    }

    public TreeMap<String, String> getSectionMap() {
        return sectionMap;
    }

    public void setSectionMap(TreeMap<String, String> sectionMap) {
        this.sectionMap = sectionMap;
    }


    @Override
    public String toString() {
        return "Source{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", url=" + url +
                ", documentCount=" + documentCount +
                ", documents=" + documents +
                ", sectionMap=" + sectionMap +
                '}';
    }
}
