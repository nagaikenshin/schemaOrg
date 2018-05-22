package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IS_PART_OF;
import org.kyojo.schemaOrg.m3n3.core.Container.IsPartOf;

@ExternalDomain
public class IsPartOfConverter implements DomainConverter<IsPartOf, String> {

	@Override
	public String fromDomainToValue(IsPartOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsPartOf fromValueToDomain(String value) {
		return new IS_PART_OF(value);
	}

}
