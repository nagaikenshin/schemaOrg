package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.infectiousAgentClass;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.infectiousAgentClass.VIRUS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.InfectiousAgentClass.Virus;

@ExternalDomain
public class VirusConverter implements DomainConverter<Virus, String> {

	@Override
	public String fromDomainToValue(Virus domain) {
		return domain.getNativeValue();
	}

	@Override
	public Virus fromValueToDomain(String value) {
		return new VIRUS(value);
	}

}
