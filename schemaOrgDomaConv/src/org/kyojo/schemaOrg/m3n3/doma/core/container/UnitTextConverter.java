package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.UNIT_TEXT;
import org.kyojo.schemaOrg.m3n3.core.Container.UnitText;

@ExternalDomain
public class UnitTextConverter implements DomainConverter<UnitText, String> {

	@Override
	public String fromDomainToValue(UnitText domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnitText fromValueToDomain(String value) {
		return new UNIT_TEXT(value);
	}

}
