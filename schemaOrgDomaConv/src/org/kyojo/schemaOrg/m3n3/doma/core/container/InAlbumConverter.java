package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IN_ALBUM;
import org.kyojo.schemaOrg.m3n3.core.Container.InAlbum;

@ExternalDomain
public class InAlbumConverter implements DomainConverter<InAlbum, String> {

	@Override
	public String fromDomainToValue(InAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public InAlbum fromValueToDomain(String value) {
		return new IN_ALBUM(value);
	}

}
