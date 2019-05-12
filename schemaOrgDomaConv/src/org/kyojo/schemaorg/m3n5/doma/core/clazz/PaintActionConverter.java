package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PAINT_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.PaintAction;

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
