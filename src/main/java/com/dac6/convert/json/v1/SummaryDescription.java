
package com.dac6.convert.json.v1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "textHR",
    "textEN"
})
public class SummaryDescription {
	
	private static final String NULL_V="<null>";

    @JsonProperty("textHR")
    private String textHR;
    @JsonProperty("textEN")
    private String textEN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("textHR")
    public String getTextHR() {
        return textHR;
    }

    @JsonProperty("textHR")
    public void setTextHR(String textHR) {
        this.textHR = textHR;
    }

    @JsonProperty("textEN")
    public String getTextEN() {
        return textEN;
    }

    @JsonProperty("textEN")
    public void setTextEN(String textEN) {
        this.textEN = textEN;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SummaryDescription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("textHR");
        sb.append('=');
        sb.append(((this.textHR == null)?NULL_V:this.textHR));
        sb.append(',');
        sb.append("textEN");
        sb.append('=');
        sb.append(((this.textEN == null)?NULL_V:this.textEN));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?NULL_V:this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
