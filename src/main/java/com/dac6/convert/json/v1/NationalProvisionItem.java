
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
    "descriptionHR",
    "descriptionEN"
})
public class NationalProvisionItem {
	
	private static final String NULL_V="<null>";

    @JsonProperty("descriptionHR")
    private String descriptionHR;
    @JsonProperty("descriptionEN")
    private String descriptionEN;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("descriptionHR")
    public String getDescriptionHR() {
        return descriptionHR;
    }

    @JsonProperty("descriptionHR")
    public void setDescriptionHR(String descriptionHR) {
        this.descriptionHR = descriptionHR;
    }

    @JsonProperty("descriptionEN")
    public String getDescriptionEN() {
        return descriptionEN;
    }

    @JsonProperty("descriptionEN")
    public void setDescriptionEN(String descriptionEN) {
        this.descriptionEN = descriptionEN;
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
        sb.append(NationalProvisionItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("descriptionHR");
        sb.append('=');
        sb.append(((this.descriptionHR == null)?NULL_V:this.descriptionHR));
        sb.append(',');
        sb.append("descriptionEN");
        sb.append('=');
        sb.append(((this.descriptionEN == null)?NULL_V:this.descriptionEN));
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
