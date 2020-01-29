
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
    "dateAndReason",
    "summary",
    "hallmarks",
    "amount",
    "concernedMemberStates",
    "nationalProvisionItem",
    "nationalProvisionItems"
})
public class DisclosureInformationForm {
	
	private static final String NULL_V="<null>";

    @JsonProperty("dateAndReason")
    private DateAndReason dateAndReason;
    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("hallmarks")
    private Hallmarks hallmarks;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("concernedMemberStates")
    private List<Integer> concernedMemberStates = new ArrayList<>();
    @JsonProperty("nationalProvisionItem")
    private NationalProvisionItem nationalProvisionItem;
    @JsonProperty("nationalProvisionItems")
    private Object nationalProvisionItems;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("dateAndReason")
    public DateAndReason getDateAndReason() {
        return dateAndReason;
    }

    @JsonProperty("dateAndReason")
    public void setDateAndReason(DateAndReason dateAndReason) {
        this.dateAndReason = dateAndReason;
    }

    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonProperty("hallmarks")
    public Hallmarks getHallmarks() {
        return hallmarks;
    }

    @JsonProperty("hallmarks")
    public void setHallmarks(Hallmarks hallmarks) {
        this.hallmarks = hallmarks;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("concernedMemberStates")
    public List<Integer> getConcernedMemberStates() {
        return concernedMemberStates;
    }

    @JsonProperty("concernedMemberStates")
    public void setConcernedMemberStates(List<Integer> concernedMemberStates) {
        this.concernedMemberStates = concernedMemberStates;
    }

    @JsonProperty("nationalProvisionItem")
    public NationalProvisionItem getNationalProvisionItem() {
        return nationalProvisionItem;
    }

    @JsonProperty("nationalProvisionItem")
    public void setNationalProvisionItem(NationalProvisionItem nationalProvisionItem) {
        this.nationalProvisionItem = nationalProvisionItem;
    }

    @JsonProperty("nationalProvisionItems")
    public Object getNationalProvisionItems() {
        return nationalProvisionItems;
    }

    @JsonProperty("nationalProvisionItems")
    public void setNationalProvisionItems(Object nationalProvisionItems) {
        this.nationalProvisionItems = nationalProvisionItems;
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
        sb.append(DisclosureInformationForm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateAndReason");
        sb.append('=');
        sb.append(((this.dateAndReason == null)?NULL_V:this.dateAndReason));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?NULL_V:this.summary));
        sb.append(',');
        sb.append("hallmarks");
        sb.append('=');
        sb.append(((this.hallmarks == null)?NULL_V:this.hallmarks));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?NULL_V:this.amount));
        sb.append(',');
        sb.append("concernedMemberStates");
        sb.append('=');
        sb.append(((this.concernedMemberStates == null)?NULL_V:this.concernedMemberStates));
        sb.append(',');
        sb.append("nationalProvisionItem");
        sb.append('=');
        sb.append(((this.nationalProvisionItem == null)?NULL_V:this.nationalProvisionItem));
        sb.append(',');
        sb.append("nationalProvisionItems");
        sb.append('=');
        sb.append(((this.nationalProvisionItems == null)?NULL_V:this.nationalProvisionItems));
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
