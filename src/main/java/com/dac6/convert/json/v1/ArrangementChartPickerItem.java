
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
    "partyId",
    "addEnabled"
})
public class ArrangementChartPickerItem {
	
	private static final String NULL_V="<null>";

    @JsonProperty("partyId")
    private String partyId;
    @JsonProperty("addEnabled")
    private Boolean addEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("partyId")
    public String getPartyId() {
        return partyId;
    }

    @JsonProperty("partyId")
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    @JsonProperty("addEnabled")
    public Boolean getAddEnabled() {
        return addEnabled;
    }

    @JsonProperty("addEnabled")
    public void setAddEnabled(Boolean addEnabled) {
        this.addEnabled = addEnabled;
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
        sb.append(ArrangementChartPickerItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?NULL_V:this.partyId));
        sb.append(',');
        sb.append("addEnabled");
        sb.append('=');
        sb.append(((this.addEnabled == null)?NULL_V:this.addEnabled));
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
