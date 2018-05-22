package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOCIAL_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SocialEvent;

@ExternalDomain
public class SocialEventConverter implements DomainConverter<SocialEvent, String> {

	@Override
	public String fromDomainToValue(SocialEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SocialEvent fromValueToDomain(String value) {
		return new SOCIAL_EVENT(value);
	}

}
