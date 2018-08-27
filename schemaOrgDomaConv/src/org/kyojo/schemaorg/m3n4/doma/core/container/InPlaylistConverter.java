package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.IN_PLAYLIST;
import org.kyojo.schemaorg.m3n4.core.Container.InPlaylist;

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
