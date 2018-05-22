package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SKI_RESORT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SkiResort;

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
