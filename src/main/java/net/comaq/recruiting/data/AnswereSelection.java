package net.comaq.recruiting.data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class AnswereSelection extends BaseModel {

    @NotNull
    private String key;

    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
