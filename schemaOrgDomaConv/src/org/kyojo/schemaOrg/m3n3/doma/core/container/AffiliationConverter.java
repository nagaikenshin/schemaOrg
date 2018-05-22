package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AFFILIATION;
import org.kyojo.schemaOrg.m3n3.core.Container.Affiliation;

@ExternalDomain
public class AffiliationConverter implements DomainConverter<Affiliation, String> {

	@Override
	public String fromDomainToValue(Affiliation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Affiliation fromValueToDomain(String value) {
		return new AFFILIATION(value);
	}

}
