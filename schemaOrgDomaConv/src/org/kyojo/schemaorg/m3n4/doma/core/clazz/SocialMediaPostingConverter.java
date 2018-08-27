package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SOCIAL_MEDIA_POSTING;
import org.kyojo.schemaorg.m3n4.core.Clazz.SocialMediaPosting;

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
