package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.infectiousAgentClass;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.infectiousAgentClass.BACTERIA;
import org.kyojo.schemaOrg.m3n3.healthLifesci.InfectiousAgentClass.Bacteria;

@ExternalDomain
public class BacteriaConverter implements DomainConverter<Bacteria, String> {

	@Override
	public String fromDomainToValue(Bacteria domain) {
		return domain.getNativeValue();
	}

	@Override
	public Bacteria fromValueToDomain(String value) {
		return new BACTERIA(value);
	}

}
