package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DURING_MEDIA;
import org.kyojo.schemaorg.m3n4.core.Container.DuringMedia;

@ExternalDomain
public class DuringMediaConverter implements DomainConverter<DuringMedia, String> {

	@Override
	public String fromDomainToValue(DuringMedia domain) {
		return domain.getNativeValue();
	}

	@Override
	public DuringMedia fromValueToDomain(String value) {
		return new DURING_MEDIA(value);
	}

}
