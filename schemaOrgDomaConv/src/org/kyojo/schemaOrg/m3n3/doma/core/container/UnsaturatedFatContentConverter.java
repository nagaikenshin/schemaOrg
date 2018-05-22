package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.UNSATURATED_FAT_CONTENT;
import org.kyojo.schemaOrg.m3n3.core.Container.UnsaturatedFatContent;

@ExternalDomain
public class UnsaturatedFatContentConverter implements DomainConverter<UnsaturatedFatContent, String> {

	@Override
	public String fromDomainToValue(UnsaturatedFatContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnsaturatedFatContent fromValueToDomain(String value) {
		return new UNSATURATED_FAT_CONTENT(value);
	}

}
