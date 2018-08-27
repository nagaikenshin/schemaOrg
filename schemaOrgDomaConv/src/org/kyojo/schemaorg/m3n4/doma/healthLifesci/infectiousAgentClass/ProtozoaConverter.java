package org.kyojo.schemaorg.m3n4.doma.healthLifesci.infectiousAgentClass;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.infectiousAgentClass.PROTOZOA;
import org.kyojo.schemaorg.m3n4.healthLifesci.InfectiousAgentClass.Protozoa;

@ExternalDomain
public class ProtozoaConverter implements DomainConverter<Protozoa, String> {

	@Override
	public String fromDomainToValue(Protozoa domain) {
		return domain.getNativeValue();
	}

	@Override
	public Protozoa fromValueToDomain(String value) {
		return new PROTOZOA(value);
	}

}