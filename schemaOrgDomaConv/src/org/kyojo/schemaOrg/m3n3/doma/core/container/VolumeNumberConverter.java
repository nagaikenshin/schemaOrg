package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VOLUME_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.VolumeNumber;

@ExternalDomain
public class VolumeNumberConverter implements DomainConverter<VolumeNumber, String> {

	@Override
	public String fromDomainToValue(VolumeNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public VolumeNumber fromValueToDomain(String value) {
		return new VOLUME_NUMBER(value);
	}

}
