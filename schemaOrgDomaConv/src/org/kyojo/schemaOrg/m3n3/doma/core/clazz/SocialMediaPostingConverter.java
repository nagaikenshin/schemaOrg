package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SOCIAL_MEDIA_POSTING;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SocialMediaPosting;

@ExternalDomain
public class SocialMediaPostingConverter implements DomainConverter<SocialMediaPosting, String> {

	@Override
	public String fromDomainToValue(SocialMediaPosting domain) {
		return domain.getNativeValue();
	}

	@Override
	public SocialMediaPosting fromValueToDomain(String value) {
		return new SOCIAL_MEDIA_POSTING(value);
	}

}
