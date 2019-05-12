package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NUM_TRACKS;
import org.kyojo.schemaorg.m3n5.core.Container.NumTracks;

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
