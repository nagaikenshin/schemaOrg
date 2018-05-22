package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.infectiousAgentClass;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.infectiousAgentClass.FUNGUS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.InfectiousAgentClass.Fungus;

@ExternalDomain
public class FungusConverter implements DomainConverter<Fungus, String> {

	@Override
	public String fromDomainToValue(Fungus domain) {
		return domain.getNativeValue();
	}

	@Override
	public Fungus fromValueToDomain(String value) {
		return new FUNGUS(value);
	}

}
