package edu.ctb.upm.disnet.model.extraction.text;

import java.util.List;

/**
 * Created by gerardo on 30/01/2018.
 *
 * @author Gerardo Lagunes G. ${EMAIL}
 * @version ${<VERSION>}
 * @project eidw
 * @className Table
 * @see
 */
public class Table extends Text {

    private List<Tr> trList;


    public List<Tr> getTrList() {
        return trList;
    }

    public void setTrList(List<Tr> trList) {
        this.trList = trList;
    }
}
