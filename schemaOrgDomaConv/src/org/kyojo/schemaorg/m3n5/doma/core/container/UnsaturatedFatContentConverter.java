package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.UNSATURATED_FAT_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.UnsaturatedFatContent;

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