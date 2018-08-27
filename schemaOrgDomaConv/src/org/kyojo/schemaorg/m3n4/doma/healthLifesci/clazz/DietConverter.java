package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DIET;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.Diet;

@ExternalDomain
public class DietConverter implements DomainConverter<Diet, String> {

	@Override
	public String fromDomainToValue(Diet domain) {
		return domain.getNativeValue();
	}

	@Override
	public Diet fromValueToDomain(String value) {
		return new DIET(value);
	}

}
