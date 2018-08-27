package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PARENT_AUDIENCE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ParentAudience;

@ExternalDomain
public class ParentAudienceConverter implements DomainConverter<ParentAudience, String> {

	@Override
	public String fromDomainToValue(ParentAudience domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParentAudience fromValueToDomain(String value) {
		return new PARENT_AUDIENCE(value);
	}

}
