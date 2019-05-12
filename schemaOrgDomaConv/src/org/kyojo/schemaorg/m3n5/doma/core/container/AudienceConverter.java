package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AUDIENCE;
import org.kyojo.schemaorg.m3n5.core.Container.Audience;

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
