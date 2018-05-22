package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SATURATED_FAT_CONTENT;
import org.kyojo.schemaOrg.m3n3.core.Container.SaturatedFatContent;

@ExternalDomain
public class SaturatedFatContentConverter implements DomainConverter<SaturatedFatContent, String> {

	@Override
	public String fromDomainToValue(SaturatedFatContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public SaturatedFatContent fromValueToDomain(String value) {
		return new SATURATED_FAT_CONTENT(value);
	}

}
