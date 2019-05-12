package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.THUMBNAIL_URL;
import org.kyojo.schemaorg.m3n5.core.Container.ThumbnailUrl;

@ExternalDomain
public class ThumbnailUrlConverter implements DomainConverter<ThumbnailUrl, String> {

	@Override
	public String fromDomainToValue(ThumbnailUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public ThumbnailUrl fromValueToDomain(String value) {
		return new THUMBNAIL_URL(value);
	}

}
