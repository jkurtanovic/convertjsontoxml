
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
    "partyId",
    "parentId",
    "children",
    "ownership",
    "amount",
    "otherInfo"
})
public class ArrangementChartItem {
	
	private static final String NULL_V="<null>";

    @JsonProperty("partyId")
    private String partyId;
    @JsonProperty("parentId")
    private Object parentId;
    @JsonProperty("children")
    private List<Child> children = new ArrayList<>();
    @JsonProperty("ownership")
    private String ownership;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("otherInfo")
    private List<Object> otherInfo = new ArrayList<>();
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

    @JsonProperty("parentId")
    public Object getParentId() {
        return parentId;
    }

    @JsonProperty("parentId")
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("children")
    public List<Child> getChildren() {
        return children;
    }

    @JsonProperty("children")
    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @JsonProperty("ownership")
    public String getOwnership() {
        return ownership;
    }

    @JsonProperty("ownership")
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("otherInfo")
    public List<Object> getOtherInfo() {
        return otherInfo;
    }

    @JsonProperty("otherInfo")
    public void setOtherInfo(List<Object> otherInfo) {
        this.otherInfo = otherInfo;
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
        sb.append(ArrangementChartItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("partyId");
        sb.append('=');
        sb.append(((this.partyId == null)?NULL_V:this.partyId));
        sb.append(',');
        sb.append("parentId");
        sb.append('=');
        sb.append(((this.parentId == null)?NULL_V:this.parentId));
        sb.append(',');
        sb.append("children");
        sb.append('=');
        sb.append(((this.children == null)?NULL_V:this.children));
        sb.append(',');
        sb.append("ownership");
        sb.append('=');
        sb.append(((this.ownership == null)?NULL_V:this.ownership));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?NULL_V:this.amount));
        sb.append(',');
        sb.append("otherInfo");
        sb.append('=');
        sb.append(((this.otherInfo == null)?NULL_V:this.otherInfo));
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
