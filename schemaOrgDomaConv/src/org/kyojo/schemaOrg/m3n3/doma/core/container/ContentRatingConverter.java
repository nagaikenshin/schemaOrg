package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTENT_RATING;
import org.kyojo.schemaOrg.m3n3.core.Container.ContentRating;

@ExternalDomain
public class ContentRatingConverter implements DomainConverter<ContentRating, String> {

	@Override
	public String fromDomainToValue(ContentRating domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContentRating fromValueToDomain(String value) {
		return new CONTENT_RATING(value);
	}

}
