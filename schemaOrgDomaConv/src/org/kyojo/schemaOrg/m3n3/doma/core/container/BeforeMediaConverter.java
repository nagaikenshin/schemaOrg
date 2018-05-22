package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BEFORE_MEDIA;
import org.kyojo.schemaOrg.m3n3.core.Container.BeforeMedia;

@ExternalDomain
public class BeforeMediaConverter implements DomainConverter<BeforeMedia, String> {

	@Override
	public String fromDomainToValue(BeforeMedia domain) {
		return domain.getNativeValue();
	}

	@Override
	public BeforeMedia fromValueToDomain(String value) {
		return new BEFORE_MEDIA(value);
	}

}
