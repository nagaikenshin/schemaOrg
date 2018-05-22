package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DRAW_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DrawAction;

@ExternalDomain
public class DrawActionConverter implements DomainConverter<DrawAction, String> {

	@Override
	public String fromDomainToValue(DrawAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DrawAction fromValueToDomain(String value) {
		return new DRAW_ACTION(value);
	}

}
