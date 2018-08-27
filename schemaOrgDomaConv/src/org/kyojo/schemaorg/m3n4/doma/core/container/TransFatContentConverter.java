package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TRANS_FAT_CONTENT;
import org.kyojo.schemaorg.m3n4.core.Container.TransFatContent;

@ExternalDomain
public class TransFatContentConverter implements DomainConverter<TransFatContent, String> {

	@Override
	public String fromDomainToValue(TransFatContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public TransFatContent fromValueToDomain(String value) {
		return new TRANS_FAT_CONTENT(value);
	}

}
