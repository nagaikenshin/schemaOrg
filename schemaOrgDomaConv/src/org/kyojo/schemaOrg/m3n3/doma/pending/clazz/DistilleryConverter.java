package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.DISTILLERY;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.Distillery;

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
