package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FAMILY_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.FamilyName;

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
