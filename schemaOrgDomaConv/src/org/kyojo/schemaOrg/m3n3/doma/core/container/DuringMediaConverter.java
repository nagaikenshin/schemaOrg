package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DURING_MEDIA;
import org.kyojo.schemaOrg.m3n3.core.Container.DuringMedia;

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
