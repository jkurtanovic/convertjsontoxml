package com.dac6.convert;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dac6.convert.dac6.v1.AddressType;
import com.dac6.convert.dac6.v1.AssociatedEnterpriseType;
import com.dac6.convert.dac6.v1.AssociatedEnterprisesType;
import com.dac6.convert.dac6.v1.CountryCodeType;
import com.dac6.convert.dac6.v1.DAC6Arrangement;
import com.dac6.convert.dac6.v1.DAC6DisclosureType;
import com.dac6.convert.dac6.v1.Discloser;
import com.dac6.convert.dac6.v1.DisclosureVersionEnumType;
import com.dac6.convert.dac6.v1.IntermediariesType;
import com.dac6.convert.dac6.v1.IntermediaryCapacityEnumType;
import com.dac6.convert.dac6.v1.IntermediaryNexusEnumType;
import com.dac6.convert.dac6.v1.IntermediaryType;
import com.dac6.convert.dac6.v1.LiabilityType;
import com.dac6.convert.dac6.v1.LiabilityType.IntermediaryDiscloser;
import com.dac6.convert.dac6.v1.NameOrganisationType;
import com.dac6.convert.dac6.v1.NamePersonType;
import com.dac6.convert.dac6.v1.OrganisationType;
import com.dac6.convert.dac6.v1.PersonOrOrganisationType;
import com.dac6.convert.dac6.v1.PersonType;
import com.dac6.convert.dac6.v1.RelevantTaxpayersType;
import com.dac6.convert.dac6.v1.TINType;
import com.dac6.convert.dac6.v1.TaxPayerType;
import com.dac6.convert.formatxml.v1.Disclosures;
import com.dac6.convert.formatxml.v1.Header;
import com.dac6.convert.json.model.Fintdac6Draft;
import com.dac6.convert.json.v1.Dac6;
import com.dac6.convert.repo.DraftRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;




@SpringBootApplication
public class ConvertjsontoxmlApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	Dac6 dac6Json = new Dac6();
	
	
	
	@Autowired
	DraftRepository draftRepository;
	
	
	
	public void createXml(Dac6 dac6jsonobj) throws Exception  {
		
		Header dac6Header = new Header();
		Disclosures dac6Disclosures = new Disclosures();
		DAC6DisclosureType element = new DAC6DisclosureType();
		PersonOrOrganisationType personororg = new PersonOrOrganisationType();
		Discloser dac6dDiscloser = new Discloser();
		LiabilityType dac6lLiabilityType= new LiabilityType();
		OrganisationType orgType = new OrganisationType();
		PersonType personType = new PersonType();
		NamePersonType namePersonType = new NamePersonType();
		NameOrganisationType nameorgType = new NameOrganisationType();
		AddressType addressType = new AddressType();
		TINType tinType = new TINType();
		IntermediaryDiscloser intermediaryDiscloser = new IntermediaryDiscloser();
		IntermediaryCapacityEnumType intermediaryCapacityEnumType=null;
		IntermediaryNexusEnumType intermediaryNexusEnumType=null;	
		TaxPayerType taxPayerType = new TaxPayerType();
		CountryCodeType countrCodeType = null;
		AssociatedEnterprisesType associatedEnterprisesType = new AssociatedEnterprisesType();
		AssociatedEnterpriseType assEntType = new AssociatedEnterpriseType();
		RelevantTaxpayersType relevantTaxpayersType = new RelevantTaxpayersType();
		IntermediariesType intermediariesType = new IntermediariesType();
		
		DAC6Arrangement Dac6xml = new DAC6Arrangement();
		
		DisclosureVersionEnumType disclosureVersionEnumType = null;
	
	   
		Dac6xml.setHeader(dac6Header.createHeaderXml());

		Dac6xml.setVersionTimestamp(null);
		Dac6xml.setArrangementID(dac6jsonobj.getArrangementForm().getArrangementId());
		
		
		
		
		element.setGDPRUpdated(false);
		element.setDisclosureID("HRD2012082873M8D5");
		element.setDisclosureVersion(disclosureVersionEnumType.DAC_6_INI);
		element.setLanguage(element.getLanguage().AA);
		
		
		element.setDisclosing(dac6Disclosures.createDisclosing(dac6dDiscloser,dac6jsonobj));
		element.setRelevantTaxPayers(dac6Disclosures.createRelevantTaxpayers(relevantTaxpayersType, dac6jsonobj));
		element.setIntermediaries(dac6Disclosures.createIntermediaris(intermediariesType,dac6jsonobj));
		
		Dac6xml.getDAC6Disclosures().add(element);
		
		
		
		
		JAXBContext context = JAXBContext.newInstance(Dac6xml.getClass());
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(Dac6xml, new File("./dac6.xml"));
		
		
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(ConvertjsontoxmlApplication.class, args);
		
	
	}

	@Override
	public void run(String... args) throws Exception {
		   
		  
		  //List<Fintdac6Draft> draft = draftRepository.findAll();
	      String pom = draftRepository.findAll().get(1).getDraft();
	      ObjectMapper mapper = new ObjectMapper();
	      
	      dac6Json = mapper.readValue(pom, Dac6.class);
	      createXml(dac6Json);
	      


	}
      

      
 
}
