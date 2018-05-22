package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.infectiousAgentClass;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.infectiousAgentClass.PRION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.InfectiousAgentClass.Prion;

@ExternalDomain
public class PrionConverter implements DomainConverter<Prion, String> {

	@Override
	public String fromDomainToValue(Prion domain) {
		return domain.getNativeValue();
	}

	@Override
	public Prion fromValueToDomain(String value) {
		return new PRION(value);
	}

}
