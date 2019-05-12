package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TRACK;
import org.kyojo.schemaorg.m3n5.core.Container.Track;

@ExternalDomain
public class TrackConverter implements DomainConverter<Track, String> {

	@Override
	public String fromDomainToValue(Track domain) {
		return domain.getNativeValue();
	}

	@Override
	public Track fromValueToDomain(String value) {
		return new TRACK(value);
	}

}
