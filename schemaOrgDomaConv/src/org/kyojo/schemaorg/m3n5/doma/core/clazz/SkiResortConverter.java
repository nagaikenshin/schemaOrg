package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SKI_RESORT;
import org.kyojo.schemaorg.m3n5.core.Clazz.SkiResort;

@ExternalDomain
public class SkiResortConverter implements DomainConverter<SkiResort, String> {

	@Override
	public String fromDomainToValue(SkiResort domain) {
		return domain.getNativeValue();
	}

	@Override
	public SkiResort fromValueToDomain(String value) {
		return new SKI_RESORT(value);
	}

}
