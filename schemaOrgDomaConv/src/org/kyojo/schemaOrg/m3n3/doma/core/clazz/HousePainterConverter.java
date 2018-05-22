package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.HOUSE_PAINTER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.HousePainter;

@ExternalDomain
public class HousePainterConverter implements DomainConverter<HousePainter, String> {

	@Override
	public String fromDomainToValue(HousePainter domain) {
		return domain.getNativeValue();
	}

	@Override
	public HousePainter fromValueToDomain(String value) {
		return new HOUSE_PAINTER(value);
	}

}
