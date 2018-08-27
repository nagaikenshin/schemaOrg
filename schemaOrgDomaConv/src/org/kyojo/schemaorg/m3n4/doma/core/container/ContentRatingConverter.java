package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONTENT_RATING;
import org.kyojo.schemaorg.m3n4.core.Container.ContentRating;

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
