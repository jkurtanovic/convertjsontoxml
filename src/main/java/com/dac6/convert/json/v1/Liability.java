
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
    "liabilityId",
    "nexusId",
    "capacityId"
})
public class Liability {
	
	private static final String NULL_V="<null>";

    @JsonProperty("liabilityId")
    private Integer liabilityId;
    @JsonProperty("nexusId")
    private Integer nexusId;
    @JsonProperty("capacityId")
    private Integer capacityId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("liabilityId")
    public Integer getLiabilityId() {
        return liabilityId;
    }

    @JsonProperty("liabilityId")
    public void setLiabilityId(Integer liabilityId) {
        this.liabilityId = liabilityId;
    }

    @JsonProperty("nexusId")
    public Integer getNexusId() {
        return nexusId;
    }

    @JsonProperty("nexusId")
    public void setNexusId(Integer nexusId) {
        this.nexusId = nexusId;
    }

    @JsonProperty("capacityId")
    public Integer getCapacityId() {
        return capacityId;
    }

    @JsonProperty("capacityId")
    public void setCapacityId(Integer capacityId) {
        this.capacityId = capacityId;
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
        sb.append(Liability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("liabilityId");
        sb.append('=');
        sb.append(((this.liabilityId == null)?NULL_V:this.liabilityId));
        sb.append(',');
        sb.append("nexusId");
        sb.append('=');
        sb.append(((this.nexusId == null)?NULL_V:this.nexusId));
        sb.append(',');
        sb.append("capacityId");
        sb.append('=');
        sb.append(((this.capacityId == null)?NULL_V:this.capacityId));
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
