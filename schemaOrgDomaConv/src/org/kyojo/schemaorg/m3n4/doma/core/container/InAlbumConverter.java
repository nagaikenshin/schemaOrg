package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.IN_ALBUM;
import org.kyojo.schemaorg.m3n4.core.Container.InAlbum;

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