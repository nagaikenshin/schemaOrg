package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.UNIT_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.UnitCode;

@ExternalDomain
public class UnitCodeConverter implements DomainConverter<UnitCode, String> {

	@Override
	public String fromDomainToValue(UnitCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnitCode fromValueToDomain(String value) {
		return new UNIT_CODE(value);
	}

}
