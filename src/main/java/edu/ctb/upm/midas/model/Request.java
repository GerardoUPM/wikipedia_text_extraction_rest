package edu.ctb.upm.midas.model;

import edu.ctb.upm.midas.constants.Constants;
import edu.ctb.upm.midas.model.xml.XmlLink;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Request {

    @Valid
    @NotNull(message = Constants.ERR_NO_PARAMETER)
    @Size(min = 1, message = Constants.ERR_EMPTY_PARAMETER)
    private List<XmlLink> wikipediaLinks;
    private String snapshot;
    private boolean json;


    public List<XmlLink> getWikipediaLinks() {
        return wikipediaLinks;
    }

    public void setWikipediaLinks(List<XmlLink> wikipediaLinks) {
        this.wikipediaLinks = wikipediaLinks;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public boolean isJson() {
        return json;
    }

    public void setJson(boolean json) {
        this.json = json;
    }
}
