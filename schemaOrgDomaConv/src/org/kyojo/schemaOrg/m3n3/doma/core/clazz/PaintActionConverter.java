package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAINT_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PaintAction;

@ExternalDomain
public class PaintActionConverter implements DomainConverter<PaintAction, String> {

	@Override
	public String fromDomainToValue(PaintAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public PaintAction fromValueToDomain(String value) {
		return new PAINT_ACTION(value);
	}

}
