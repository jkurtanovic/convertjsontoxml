
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
    "arrangementForm",
    "disclosingPartyForm",
    "taxpayersForm",
    "intermediariesForm",
    "affectedPersonsForm",
    "disclosureInformationForm",
    "arrangementChartForm",
    "arrangementChartPickerItems"
})
public class Dac6 {
	
	private static final String NULL_V="<null>";

    @JsonProperty("arrangementForm")
    private ArrangementForm arrangementForm;
    @JsonProperty("disclosingPartyForm")
    private DisclosingPartyForm disclosingPartyForm;
    @JsonProperty("taxpayersForm")
    private TaxpayersForm taxpayersForm;
    @JsonProperty("intermediariesForm")
    private IntermediariesForm intermediariesForm;
    @JsonProperty("affectedPersonsForm")
    private AffectedPersonsForm affectedPersonsForm;
    @JsonProperty("disclosureInformationForm")
    private DisclosureInformationForm disclosureInformationForm;
    @JsonProperty("arrangementChartForm")
    private ArrangementChartForm arrangementChartForm;
    @JsonProperty("arrangementChartPickerItems")
    private List<ArrangementChartPickerItem> arrangementChartPickerItems = new ArrayList<>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("arrangementForm")
    public ArrangementForm getArrangementForm() {
        return arrangementForm;
    }

    @JsonProperty("arrangementForm")
    public void setArrangementForm(ArrangementForm arrangementForm) {
        this.arrangementForm = arrangementForm;
    }

    @JsonProperty("disclosingPartyForm")
    public DisclosingPartyForm getDisclosingPartyForm() {
        return disclosingPartyForm;
    }

    @JsonProperty("disclosingPartyForm")
    public void setDisclosingPartyForm(DisclosingPartyForm disclosingPartyForm) {
        this.disclosingPartyForm = disclosingPartyForm;
    }

    @JsonProperty("taxpayersForm")
    public TaxpayersForm getTaxpayersForm() {
        return taxpayersForm;
    }

    @JsonProperty("taxpayersForm")
    public void setTaxpayersForm(TaxpayersForm taxpayersForm) {
        this.taxpayersForm = taxpayersForm;
    }

    @JsonProperty("intermediariesForm")
    public IntermediariesForm getIntermediariesForm() {
        return intermediariesForm;
    }

    @JsonProperty("intermediariesForm")
    public void setIntermediariesForm(IntermediariesForm intermediariesForm) {
        this.intermediariesForm = intermediariesForm;
    }

    @JsonProperty("affectedPersonsForm")
    public AffectedPersonsForm getAffectedPersonsForm() {
        return affectedPersonsForm;
    }

    @JsonProperty("affectedPersonsForm")
    public void setAffectedPersonsForm(AffectedPersonsForm affectedPersonsForm) {
        this.affectedPersonsForm = affectedPersonsForm;
    }

    @JsonProperty("disclosureInformationForm")
    public DisclosureInformationForm getDisclosureInformationForm() {
        return disclosureInformationForm;
    }

    @JsonProperty("disclosureInformationForm")
    public void setDisclosureInformationForm(DisclosureInformationForm disclosureInformationForm) {
        this.disclosureInformationForm = disclosureInformationForm;
    }

    @JsonProperty("arrangementChartForm")
    public ArrangementChartForm getArrangementChartForm() {
        return arrangementChartForm;
    }

    @JsonProperty("arrangementChartForm")
    public void setArrangementChartForm(ArrangementChartForm arrangementChartForm) {
        this.arrangementChartForm = arrangementChartForm;
    }

    @JsonProperty("arrangementChartPickerItems")
    public List<ArrangementChartPickerItem> getArrangementChartPickerItems() {
        return arrangementChartPickerItems;
    }

    @JsonProperty("arrangementChartPickerItems")
    public void setArrangementChartPickerItems(List<ArrangementChartPickerItem> arrangementChartPickerItems) {
        this.arrangementChartPickerItems = arrangementChartPickerItems;
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
        sb.append(Dac6 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("arrangementForm");
        sb.append('=');
        sb.append(((this.arrangementForm == null)?NULL_V:this.arrangementForm));
        sb.append(',');
        sb.append("disclosingPartyForm");
        sb.append('=');
        sb.append(((this.disclosingPartyForm == null)?NULL_V:this.disclosingPartyForm));
        sb.append(',');
        sb.append("taxpayersForm");
        sb.append('=');
        sb.append(((this.taxpayersForm == null)?NULL_V:this.taxpayersForm));
        sb.append(',');
        sb.append("intermediariesForm");
        sb.append('=');
        sb.append(((this.intermediariesForm == null)?NULL_V:this.intermediariesForm));
        sb.append(',');
        sb.append("affectedPersonsForm");
        sb.append('=');
        sb.append(((this.affectedPersonsForm == null)?NULL_V:this.affectedPersonsForm));
        sb.append(',');
        sb.append("disclosureInformationForm");
        sb.append('=');
        sb.append(((this.disclosureInformationForm == null)?NULL_V:this.disclosureInformationForm));
        sb.append(',');
        sb.append("arrangementChartForm");
        sb.append('=');
        sb.append(((this.arrangementChartForm == null)?NULL_V:this.arrangementChartForm));
        sb.append(',');
        sb.append("arrangementChartPickerItems");
        sb.append('=');
        sb.append(((this.arrangementChartPickerItems == null)?NULL_V:this.arrangementChartPickerItems));
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
