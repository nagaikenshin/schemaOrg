package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.DISTILLERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.Distillery;

@ExternalDomain
public class DistilleryConverter implements DomainConverter<Distillery, String> {

	@Override
	public String fromDomainToValue(Distillery domain) {
		return domain.getNativeValue();
	}

	@Override
	public Distillery fromValueToDomain(String value) {
		return new DISTILLERY(value);
	}

}
