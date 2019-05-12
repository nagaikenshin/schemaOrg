package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ISRC_CODE;
import org.kyojo.schemaorg.m3n5.core.Container.IsrcCode;

@ExternalDomain
public class IsrcCodeConverter implements DomainConverter<IsrcCode, String> {

	@Override
	public String fromDomainToValue(IsrcCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsrcCode fromValueToDomain(String value) {
		return new ISRC_CODE(value);
	}

}
