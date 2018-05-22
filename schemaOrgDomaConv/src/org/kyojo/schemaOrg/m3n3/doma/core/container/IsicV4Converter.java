package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ISIC_V4;
import org.kyojo.schemaOrg.m3n3.core.Container.IsicV4;

@ExternalDomain
public class IsicV4Converter implements DomainConverter<IsicV4, String> {

	@Override
	public String fromDomainToValue(IsicV4 domain) {
		return domain.getNativeValue();
	}

	@Override
	public IsicV4 fromValueToDomain(String value) {
		return new ISIC_V4(value);
	}

}
