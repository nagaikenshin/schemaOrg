package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WATERFALL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Waterfall;

@ExternalDomain
public class WaterfallConverter implements DomainConverter<Waterfall, String> {

	@Override
	public String fromDomainToValue(Waterfall domain) {
		return domain.getNativeValue();
	}

	@Override
	public Waterfall fromValueToDomain(String value) {
		return new WATERFALL(value);
	}

}
