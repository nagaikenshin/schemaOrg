package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WATERFALL;
import org.kyojo.schemaorg.m3n5.core.Clazz.Waterfall;

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