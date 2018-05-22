package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IN_PLAYLIST;
import org.kyojo.schemaOrg.m3n3.core.Container.InPlaylist;

@ExternalDomain
public class InPlaylistConverter implements DomainConverter<InPlaylist, String> {

	@Override
	public String fromDomainToValue(InPlaylist domain) {
		return domain.getNativeValue();
	}

	@Override
	public InPlaylist fromValueToDomain(String value) {
		return new IN_PLAYLIST(value);
	}

}
