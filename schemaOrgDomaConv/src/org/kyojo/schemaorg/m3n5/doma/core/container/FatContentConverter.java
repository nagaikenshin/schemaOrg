package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FAT_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.FatContent;

@ExternalDomain
public class FatContentConverter implements DomainConverter<FatContent, String> {

	@Override
	public String fromDomainToValue(FatContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public FatContent fromValueToDomain(String value) {
		return new FAT_CONTENT(value);
	}

}
