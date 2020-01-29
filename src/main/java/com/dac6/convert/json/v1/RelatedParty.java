
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
    "person",
    "organisation",
    "address",
    "email",
    "partyTinList",
    "countriesOfResidance",
    "arrangementChartId",
    "affectedPerson"
})
public class RelatedParty {
	
	private static final String NULL_V="<null>";

    @JsonProperty("person")
    private Object person;
    @JsonProperty("organisation")
    private Organisation organisation;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("email")
    private String email;
    @JsonProperty("partyTinList")
    private List<Object> partyTinList = new ArrayList<>();
    @JsonProperty("countriesOfResidance")
    private List<Integer> countriesOfResidance = new ArrayList<>();
    @JsonProperty("arrangementChartId")
    private String arrangementChartId;
    @JsonProperty("affectedPerson")
    private Boolean affectedPerson;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("person")
    public Object getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(Object person) {
        this.person = person;
    }

    @JsonProperty("organisation")
    public Organisation getOrganisation() {
        return organisation;
    }

    @JsonProperty("organisation")
    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("partyTinList")
    public List<Object> getPartyTinList() {
        return partyTinList;
    }

    @JsonProperty("partyTinList")
    public void setPartyTinList(List<Object> partyTinList) {
        this.partyTinList = partyTinList;
    }

    @JsonProperty("countriesOfResidance")
    public List<Integer> getCountriesOfResidance() {
        return countriesOfResidance;
    }

    @JsonProperty("countriesOfResidance")
    public void setCountriesOfResidance(List<Integer> countriesOfResidance) {
        this.countriesOfResidance = countriesOfResidance;
    }

    @JsonProperty("arrangementChartId")
    public String getArrangementChartId() {
        return arrangementChartId;
    }

    @JsonProperty("arrangementChartId")
    public void setArrangementChartId(String arrangementChartId) {
        this.arrangementChartId = arrangementChartId;
    }

    @JsonProperty("affectedPerson")
    public Boolean getAffectedPerson() {
        return affectedPerson;
    }

    @JsonProperty("affectedPerson")
    public void setAffectedPerson(Boolean affectedPerson) {
        this.affectedPerson = affectedPerson;
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
        sb.append(RelatedParty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?NULL_V:this.person));
        sb.append(',');
        sb.append("organisation");
        sb.append('=');
        sb.append(((this.organisation == null)?NULL_V:this.organisation));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?NULL_V:this.address));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?NULL_V:this.email));
        sb.append(',');
        sb.append("partyTinList");
        sb.append('=');
        sb.append(((this.partyTinList == null)?NULL_V:this.partyTinList));
        sb.append(',');
        sb.append("countriesOfResidance");
        sb.append('=');
        sb.append(((this.countriesOfResidance == null)?NULL_V:this.countriesOfResidance));
        sb.append(',');
        sb.append("arrangementChartId");
        sb.append('=');
        sb.append(((this.arrangementChartId == null)?NULL_V:this.arrangementChartId));
        sb.append(',');
        sb.append("affectedPerson");
        sb.append('=');
        sb.append(((this.affectedPerson == null)?NULL_V:this.affectedPerson));
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
