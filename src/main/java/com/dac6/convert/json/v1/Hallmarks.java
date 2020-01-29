
package com.dac6.convert.json.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mainBenefitTest",
    "hallmarkItems"
})
public class Hallmarks {
	
	private static final String NULL_V="<null>";

    @JsonProperty("mainBenefitTest")
    private Boolean mainBenefitTest;
    @JsonProperty("hallmarkItems")
    private List<HallmarkItem> hallmarkItems = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("mainBenefitTest")
    public Boolean getMainBenefitTest() {
        return mainBenefitTest;
    }

    @JsonProperty("mainBenefitTest")
    public void setMainBenefitTest(Boolean mainBenefitTest) {
        this.mainBenefitTest = mainBenefitTest;
    }

    @JsonProperty("hallmarkItems")
    public List<HallmarkItem> getHallmarkItems() {
        return hallmarkItems;
    }

    @JsonProperty("hallmarkItems")
    public void setHallmarkItems(List<HallmarkItem> hallmarkItems) {
        this.hallmarkItems = hallmarkItems;
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
        sb.append(Hallmarks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mainBenefitTest");
        sb.append('=');
        sb.append(((this.mainBenefitTest == null)?NULL_V:this.mainBenefitTest));
        sb.append(',');
        sb.append("hallmarkItems");
        sb.append('=');
        sb.append(((this.hallmarkItems == null)?NULL_V:this.hallmarkItems));
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
