package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MUSIC_VENUE;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicVenue;

@ExternalDomain
public class MusicVenueConverter implements DomainConverter<MusicVenue, String> {

	@Override
	public String fromDomainToValue(MusicVenue domain) {
		return domain.getNativeValue();
	}

	@Override
	public MusicVenue fromValueToDomain(String value) {
		return new MUSIC_VENUE(value);
	}

}
