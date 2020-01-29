
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
    "arrangementId",
    "marketableArrangement",
    "initialMarketableArrangement",
    "languageId"
})
public class ArrangementForm {
	
	private static final String NULL_V="<null>";

    @JsonProperty("arrangementId")
    private String arrangementId;
    @JsonProperty("marketableArrangement")
    private Boolean marketableArrangement;
    @JsonProperty("initialMarketableArrangement")
    private Boolean initialMarketableArrangement;
    @JsonProperty("languageId")
    private Integer languageId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("arrangementId")
    public String getArrangementId() {
        return arrangementId;
    }

    @JsonProperty("arrangementId")
    public void setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
    }

    @JsonProperty("marketableArrangement")
    public Boolean getMarketableArrangement() {
        return marketableArrangement;
    }

    @JsonProperty("marketableArrangement")
    public void setMarketableArrangement(Boolean marketableArrangement) {
        this.marketableArrangement = marketableArrangement;
    }

    @JsonProperty("initialMarketableArrangement")
    public Boolean getInitialMarketableArrangement() {
        return initialMarketableArrangement;
    }

    @JsonProperty("initialMarketableArrangement")
    public void setInitialMarketableArrangement(Boolean initialMarketableArrangement) {
        this.initialMarketableArrangement = initialMarketableArrangement;
    }

    @JsonProperty("languageId")
    public Integer getLanguageId() {
        return languageId;
    }

    @JsonProperty("languageId")
    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
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
        sb.append(ArrangementForm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("arrangementId");
        sb.append('=');
        sb.append(((this.arrangementId == null)?NULL_V:this.arrangementId));
        sb.append(',');
        sb.append("marketableArrangement");
        sb.append('=');
        sb.append(((this.marketableArrangement == null)?NULL_V:this.marketableArrangement));
        sb.append(',');
        sb.append("initialMarketableArrangement");
        sb.append('=');
        sb.append(((this.initialMarketableArrangement == null)?NULL_V:this.initialMarketableArrangement));
        sb.append(',');
        sb.append("languageId");
        sb.append('=');
        sb.append(((this.languageId == null)?NULL_V:this.languageId));
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
