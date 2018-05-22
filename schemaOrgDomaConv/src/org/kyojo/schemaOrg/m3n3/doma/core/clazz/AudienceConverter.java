package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUDIENCE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Audience;

@ExternalDomain
public class AudienceConverter implements DomainConverter<Audience, String> {

	@Override
	public String fromDomainToValue(Audience domain) {
		return domain.getNativeValue();
	}

	@Override
	public Audience fromValueToDomain(String value) {
		return new AUDIENCE(value);
	}

}
