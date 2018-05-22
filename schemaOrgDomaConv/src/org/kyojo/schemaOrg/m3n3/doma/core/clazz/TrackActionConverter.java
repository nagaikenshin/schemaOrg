package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRACK_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TrackAction;

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
