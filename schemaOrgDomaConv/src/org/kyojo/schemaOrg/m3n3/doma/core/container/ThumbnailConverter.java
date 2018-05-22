package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.THUMBNAIL;
import org.kyojo.schemaOrg.m3n3.core.Container.Thumbnail;

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
