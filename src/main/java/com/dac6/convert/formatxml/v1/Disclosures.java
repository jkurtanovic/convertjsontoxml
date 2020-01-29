package com.dac6.convert.formatxml.v1;

import com.dac6.convert.dac6.v1.AddressType;
import com.dac6.convert.dac6.v1.AffectedPersonsType;
import com.dac6.convert.dac6.v1.AssociatedEnterprisesType;
import com.dac6.convert.dac6.v1.CountryCodeType;
import com.dac6.convert.dac6.v1.CountryExemptionsType;
import com.dac6.convert.dac6.v1.DAC6DisclosureType;
import com.dac6.convert.dac6.v1.Discloser;
import com.dac6.convert.dac6.v1.DisclosingType;
import com.dac6.convert.dac6.v1.DisclosureInformationType;
import com.dac6.convert.dac6.v1.DisclosureVersionEnumType;
import com.dac6.convert.dac6.v1.IntermediariesType;
import com.dac6.convert.dac6.v1.Intermediary;
import com.dac6.convert.dac6.v1.IntermediaryCapacityEnumType;
import com.dac6.convert.dac6.v1.IntermediaryType;
import com.dac6.convert.dac6.v1.LanguageCodeType;
import com.dac6.convert.dac6.v1.LiabilityType;
import com.dac6.convert.dac6.v1.NameOrganisationType;
import com.dac6.convert.dac6.v1.NamePersonType;
import com.dac6.convert.dac6.v1.NationalExemptionType;
import com.dac6.convert.dac6.v1.ObjectFactory;
import com.dac6.convert.dac6.v1.OrganisationType;
import com.dac6.convert.dac6.v1.PersonOrOrganisationType;
import com.dac6.convert.dac6.v1.PersonType;
import com.dac6.convert.dac6.v1.RelevantTaxpayersType;
import com.dac6.convert.dac6.v1.TaxPayerType;
import com.dac6.convert.json.v1.Dac6;

public class Disclosures {

	private boolean gdprUpdated = false;
	private String disclosureID;
	DisclosureVersionEnumType disclosureVersionEnumType;
	LanguageCodeType languageCodeType;
	DisclosingType disclosingType;
	private boolean initialDisclosureMA = false;
	TaxPayerType taxPayerType;
	IntermediaryType intermediaryType;
	AffectedPersonsType affectedPersonsType;
	DisclosureInformationType disclosureInformationType;

	public Discloser createDisclosing(Discloser e, Dac6 jsonobj) {

		PersonOrOrganisationType personOrOganisation = new PersonOrOrganisationType();
		PersonType personType = new PersonType();
		OrganisationType organisationType = new OrganisationType();
		LiabilityType liabilityType = new LiabilityType();
		NamePersonType namePersonType = new NamePersonType();
		AddressType addressType = new AddressType();
		CountryCodeType countryCodeType = null;

		addressType.setCity("Zagreb");
		addressType.setPostCode("110000");
		addressType.setStreet("ASDASDASD");
		addressType.setCountry(countryCodeType.HR);
		personType.setAddress(addressType);
		namePersonType.setFirstName("Jasmin");
		personType.setIndividualName(namePersonType);
		personOrOganisation.setIndividual(personType);
		personOrOganisation.setOrganisation(organisationType);

		e.setID(personOrOganisation);
		e.setLiability(liabilityType);
		

		return e;

	}

	public IntermediariesType createIntermediaris(IntermediariesType e, Dac6 jsonobj) {

		Intermediary intermediary = new Intermediary();
		PersonOrOrganisationType personorg = new PersonOrOrganisationType();
		IntermediaryCapacityEnumType intermediaryCapacityEnumType = null;
		NationalExemptionType nationalExemptionType = null;
		PersonType personType = new PersonType();
		OrganisationType orgType = new OrganisationType();
		NamePersonType namePersonType = new NamePersonType();
		AddressType addresType = new AddressType();
		CountryCodeType countryCodeType = null;
		NameOrganisationType nameOrgType = new NameOrganisationType();
		CountryExemptionsType countryExemptionsType = new CountryExemptionsType();

		for (int i = 0; i < jsonobj.getIntermediariesForm().getIntermediaries().size(); i++) {

			if (jsonobj.getIntermediariesForm().getIntermediaries().get(i).getPerson() != null) {

				namePersonType.setFirstName(
						jsonobj.getIntermediariesForm().getIntermediaries().get(i).getPerson().getFirstName());
				namePersonType.setLastName(
						jsonobj.getIntermediariesForm().getIntermediaries().get(i).getPerson().getLastName());
				personType.setIndividualName(namePersonType);
				personorg.setIndividual(personType);
			} else {

				if (jsonobj.getIntermediariesForm().getIntermediaries().get(i).getOrganisation() != null) {

					nameOrgType.setValue(jsonobj.getIntermediariesForm().getIntermediaries().get(i).getOrganisation()
							.getOrganisationNames().get(i).getName());
					nameOrgType.setLanguage(languageCodeType.HR);
					orgType.getOrganisationName().add(i, nameOrgType);

				}

				addresType
						.setStreet(jsonobj.getIntermediariesForm().getIntermediaries().get(i).getAddress().getStreet());
				addresType.setPostCode(
						jsonobj.getIntermediariesForm().getIntermediaries().get(i).getAddress().getPostCode());
				addresType.setCity(jsonobj.getIntermediariesForm().getIntermediaries().get(i).getAddress().getCity());
				addresType.setCountry(countryCodeType.HR);
				orgType.setAddress(addresType);
				orgType.setEmailAddress(jsonobj.getIntermediariesForm().getIntermediaries().get(i).getEmail());
				personorg.setOrganisation(orgType);
			}

			intermediary.setID(personorg);
			intermediary.setCapacity(intermediaryCapacityEnumType.DAC_61101);
			countryExemptionsType.getCountryExemption().add(countryCodeType.HR);
			// nationalExemptionType.setCountryExemptions(countryExemptionsType);
			// intermediary.setNationalExemption(nationalExemptionType);

			e.getIntermediary().add(i, intermediary);
		}

		return e;

	}

	public RelevantTaxpayersType createRelevantTaxpayers(RelevantTaxpayersType e, Dac6 jsonobj) {

		PersonOrOrganisationType personorg = new PersonOrOrganisationType();
		PersonOrOrganisationType personorg1 = new PersonOrOrganisationType();
		TaxPayerType taxPayerType = new TaxPayerType();
		TaxPayerType taxPayerType1 = new TaxPayerType();
		AssociatedEnterprisesType associatedEnterprisesType = null;
		NamePersonType namePersonType = new NamePersonType();
		AddressType addresType = new AddressType();
		PersonType personType = new PersonType();
		NameOrganisationType nameOrgType = new NameOrganisationType();
		OrganisationType orgType = new OrganisationType();
		CountryCodeType countryCodeType = null;
		
		for (int i = 0; i < jsonobj.getTaxpayersForm().getTaxpayers().size(); i++) {
			
			
			if (jsonobj.getTaxpayersForm().getTaxpayers().get(i).getPerson() != null) {
				
	
				System.out.println("INDEXXXXXXX P " + i);

				namePersonType.setFirstName(
						jsonobj.getTaxpayersForm().getTaxpayers().get(i).getPerson().getFirstName());
				namePersonType.setLastName(
						jsonobj.getTaxpayersForm().getTaxpayers().get(i).getPerson().getLastName());
				personType.setIndividualName(namePersonType);
				addresType
				.setStreet(jsonobj.getTaxpayersForm().getTaxpayers().get(i).getAddress().getStreet());
		addresType.setPostCode(
				jsonobj.getTaxpayersForm().getTaxpayers().get(i).getAddress().getPostCode());
		addresType.setCity(jsonobj.getTaxpayersForm().getTaxpayers().get(i).getAddress().getCity());
		addresType.setCountry(countryCodeType);
				personType.setAddress(addresType);
				personType.setBirthPlace("Zagreb");
				personType.setBirthDate(null);
				personorg1.setIndividual(personType);
				taxPayerType1.setID(personorg1);
				
				taxPayerType.setTaxpayerImplementingDate(null);
				taxPayerType.setAssociatedEnterprises(associatedEnterprisesType);
				e.getRelevantTaxpayer().add(i,taxPayerType1);
	
			} else {
					

				if (jsonobj.getTaxpayersForm().getTaxpayers().get(i).getOrganisation() != null) {
					System.out.println("INDEXXXXXXX O " + i);
					nameOrgType.setValue("AAAASSSSSSSSS");
					nameOrgType.setLanguage(languageCodeType.HR);
					orgType.getOrganisationName().add(i, nameOrgType);

				}
				
				addresType
				.setStreet(jsonobj.getTaxpayersForm().getTaxpayers().get(i).getAddress().getStreet());
		addresType.setPostCode(
				jsonobj.getTaxpayersForm().getTaxpayers().get(i).getAddress().getPostCode());
		addresType.setCity(jsonobj.getTaxpayersForm().getTaxpayers().get(i).getAddress().getCity());
		addresType.setCountry(countryCodeType.HR);
		orgType.setAddress(addresType);
		orgType.setEmailAddress(jsonobj.getTaxpayersForm().getTaxpayers().get(i).getEmail());
		personorg.setOrganisation(orgType);
		taxPayerType.setID(personorg);
		
		taxPayerType.setTaxpayerImplementingDate(null);
		taxPayerType.setAssociatedEnterprises(associatedEnterprisesType);
		e.getRelevantTaxpayer().add(i,taxPayerType);
				
			}

		}

		return e;
	}
}
