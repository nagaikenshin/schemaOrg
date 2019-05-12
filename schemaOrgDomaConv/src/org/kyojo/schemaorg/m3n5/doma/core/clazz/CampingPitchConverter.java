package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CAMPING_PITCH;
import org.kyojo.schemaorg.m3n5.core.Clazz.CampingPitch;

@ExternalDomain
public class CampingPitchConverter implements DomainConverter<CampingPitch, String> {

	@Override
	public String fromDomainToValue(CampingPitch domain) {
		return domain.getNativeValue();
	}

	@Override
	public CampingPitch fromValueToDomain(String value) {
		return new CAMPING_PITCH(value);
	}

}
