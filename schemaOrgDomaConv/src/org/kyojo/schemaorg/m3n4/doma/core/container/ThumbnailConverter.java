package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.THUMBNAIL;
import org.kyojo.schemaorg.m3n4.core.Container.Thumbnail;

@ExternalDomain
public class ThumbnailConverter implements DomainConverter<Thumbnail, String> {

	@Override
	public String fromDomainToValue(Thumbnail domain) {
		return domain.getNativeValue();
	}

	@Override
	public Thumbnail fromValueToDomain(String value) {
		return new THUMBNAIL(value);
	}

}
