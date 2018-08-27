package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.BACKGROUND;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Background;

@ExternalDomain
public class BackgroundConverter implements DomainConverter<Background, String> {

	@Override
	public String fromDomainToValue(Background domain) {
		return domain.getNativeValue();
	}

	@Override
	public Background fromValueToDomain(String value) {
		return new BACKGROUND(value);
	}

}
