package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CLIP_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.ClipNumber;

@ExternalDomain
public class ClipNumberConverter implements DomainConverter<ClipNumber, String> {

	@Override
	public String fromDomainToValue(ClipNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public ClipNumber fromValueToDomain(String value) {
		return new CLIP_NUMBER(value);
	}

}
