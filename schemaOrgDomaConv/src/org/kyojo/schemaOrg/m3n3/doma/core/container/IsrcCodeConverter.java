package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISRC_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.IsrcCode;

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
