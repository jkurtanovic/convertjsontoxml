
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
    "disclosureName",
    "summaryDescription"
})
public class Summary {
	
	private static final String NULL_V="<null>";

    @JsonProperty("disclosureName")
    private String disclosureName;
    @JsonProperty("summaryDescription")
    private SummaryDescription summaryDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("disclosureName")
    public String getDisclosureName() {
        return disclosureName;
    }

    @JsonProperty("disclosureName")
    public void setDisclosureName(String disclosureName) {
        this.disclosureName = disclosureName;
    }

    @JsonProperty("summaryDescription")
    public SummaryDescription getSummaryDescription() {
        return summaryDescription;
    }

    @JsonProperty("summaryDescription")
    public void setSummaryDescription(SummaryDescription summaryDescription) {
        this.summaryDescription = summaryDescription;
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
        sb.append(Summary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("disclosureName");
        sb.append('=');
        sb.append(((this.disclosureName == null)?NULL_V:this.disclosureName));
        sb.append(',');
        sb.append("summaryDescription");
        sb.append('=');
        sb.append(((this.summaryDescription == null)?NULL_V:this.summaryDescription));
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
