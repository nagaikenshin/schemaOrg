package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CLIP_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.ClipNumber;

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
