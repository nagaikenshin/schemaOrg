package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.NUM_TRACKS;
import org.kyojo.schemaOrg.m3n3.core.Container.NumTracks;

@ExternalDomain
public class NumTracksConverter implements DomainConverter<NumTracks, Long> {

	@Override
	public Long fromDomainToValue(NumTracks domain) {
		return domain.getNativeValue();
	}

	@Override
	public NumTracks fromValueToDomain(Long value) {
		return new NUM_TRACKS(value);
	}

}
