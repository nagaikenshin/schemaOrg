package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CREATOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Creator;

@ExternalDomain
public class CreatorConverter implements DomainConverter<Creator, String> {

	@Override
	public String fromDomainToValue(Creator domain) {
		return domain.getNativeValue();
	}

	@Override
	public Creator fromValueToDomain(String value) {
		return new CREATOR(value);
	}

}
