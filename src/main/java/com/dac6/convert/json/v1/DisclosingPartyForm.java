
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
    "party",
    "liability",
    "oib"
})
public class DisclosingPartyForm {
	
	private static final String NULL_V="<null>";

    @JsonProperty("party")
    private Party party;
    @JsonProperty("liability")
    private Liability liability;
    @JsonProperty("oib")
    private String oib;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("party")
    public Party getParty() {
        return party;
    }

    @JsonProperty("party")
    public void setParty(Party party) {
        this.party = party;
    }

    @JsonProperty("liability")
    public Liability getLiability() {
        return liability;
    }

    @JsonProperty("liability")
    public void setLiability(Liability liability) {
        this.liability = liability;
    }

    @JsonProperty("oib")
    public String getOib() {
        return oib;
    }

    @JsonProperty("oib")
    public void setOib(String oib) {
        this.oib = oib;
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
        sb.append(DisclosingPartyForm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("party");
        sb.append('=');
        sb.append(((this.party == null)?NULL_V:this.party));
        sb.append(',');
        sb.append("liability");
        sb.append('=');
        sb.append(((this.liability == null)?NULL_V:this.liability));
        sb.append(',');
        sb.append("oib");
        sb.append('=');
        sb.append(((this.oib == null)?NULL_V:this.oib));
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
