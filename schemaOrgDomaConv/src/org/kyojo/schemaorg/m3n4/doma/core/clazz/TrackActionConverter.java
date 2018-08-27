package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TRACK_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrackAction;

@ExternalDomain
public class TrackActionConverter implements DomainConverter<TrackAction, String> {

	@Override
	public String fromDomainToValue(TrackAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrackAction fromValueToDomain(String value) {
		return new TRACK_ACTION(value);
	}

}