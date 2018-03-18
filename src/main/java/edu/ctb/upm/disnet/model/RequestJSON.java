package edu.ctb.upm.disnet.model;
import edu.ctb.upm.disnet.constants.Constants;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by gerardo on 14/03/2018.
 *
 * @author Gerardo Lagunes G. ${EMAIL}
 * @version ${<VERSION>}
 * @project wikipedia_text_extraction_rest
 * @className RequestJSON
 * @see
 */
public class RequestJSON {

    @Valid
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = Constants.ERR_NO_PARAMETER)
    @Size(min = 10, max = 10, message = Constants.ERR_EMPTY_PARAMETER)
    private String snapshot;


    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public String toString() {
        return "RequestJSON{" +
                "snapshot='" + snapshot + '\'' +
                '}';
    }
}
