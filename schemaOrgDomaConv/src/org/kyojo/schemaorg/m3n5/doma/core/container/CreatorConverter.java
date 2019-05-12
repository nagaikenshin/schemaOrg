package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CREATOR;
import org.kyojo.schemaorg.m3n5.core.Container.Creator;

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
