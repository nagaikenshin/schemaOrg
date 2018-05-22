package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FAMILY_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.FamilyName;

@ExternalDomain
public class FamilyNameConverter implements DomainConverter<FamilyName, String> {

	@Override
	public String fromDomainToValue(FamilyName domain) {
		return domain.getNativeValue();
	}

	@Override
	public FamilyName fromValueToDomain(String value) {
		return new FAMILY_NAME(value);
	}

}
