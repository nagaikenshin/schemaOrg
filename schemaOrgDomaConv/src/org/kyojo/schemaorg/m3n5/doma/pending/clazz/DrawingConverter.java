package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.DRAWING;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Drawing;

@ExternalDomain
public class DrawingConverter implements DomainConverter<Drawing, String> {

	@Override
	public String fromDomainToValue(Drawing domain) {
		return domain.getNativeValue();
	}

	@Override
	public Drawing fromValueToDomain(String value) {
		return new DRAWING(value);
	}

}
