package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AFTER_MEDIA;
import org.kyojo.schemaOrg.m3n3.core.Container.AfterMedia;

@ExternalDomain
public class AfterMediaConverter implements DomainConverter<AfterMedia, String> {

	@Override
	public String fromDomainToValue(AfterMedia domain) {
		return domain.getNativeValue();
	}

	@Override
	public AfterMedia fromValueToDomain(String value) {
		return new AFTER_MEDIA(value);
	}

}
