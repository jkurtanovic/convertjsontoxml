
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
    "otherInformationHR",
    "otherInformationEN"
})
public class Description {
	
	private static final String NULL_V="<null>";

    @JsonProperty("otherInformationHR")
    private String otherInformationHR;
    @JsonProperty("otherInformationEN")
    private String otherInformationEN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("otherInformationHR")
    public String getOtherInformationHR() {
        return otherInformationHR;
    }

    @JsonProperty("otherInformationHR")
    public void setOtherInformationHR(String otherInformationHR) {
        this.otherInformationHR = otherInformationHR;
    }

    @JsonProperty("otherInformationEN")
    public String getOtherInformationEN() {
        return otherInformationEN;
    }

    @JsonProperty("otherInformationEN")
    public void setOtherInformationEN(String otherInformationEN) {
        this.otherInformationEN = otherInformationEN;
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
        sb.append(Description.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("otherInformationHR");
        sb.append('=');
        sb.append(((this.otherInformationHR == null)?NULL_V:this.otherInformationHR));
        sb.append(',');
        sb.append("otherInformationEN");
        sb.append('=');
        sb.append(((this.otherInformationEN == null)?NULL_V:this.otherInformationEN));
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
