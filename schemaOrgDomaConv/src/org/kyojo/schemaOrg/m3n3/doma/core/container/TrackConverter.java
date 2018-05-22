package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRACK;
import org.kyojo.schemaOrg.m3n3.core.Container.Track;

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
