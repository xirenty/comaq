package net.comaq.recruiting.data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Question extends BaseModel {

    @NotNull
    private AnswereType answereType;

    @NotNull
    private String text;

    @NotNull
    private Priority prio;

    @NotNull
    private boolean mandatory;

    @OneToMany
    private List<AnswereSelection> selecableAnsweres;

    public Question() {};

    public Question(final String text, final Priority prio, final boolean mandatory) {
        this.text = text;
        this.prio = prio;
        this.mandatory = mandatory;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Priority getPrio() {
        return prio;
    }

    public void setPrio(Priority prio) {
        this.prio = prio;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

}
