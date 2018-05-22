package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.CONSORTIUM;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.Consortium;

@ExternalDomain
public class ConsortiumConverter implements DomainConverter<Consortium, String> {

	@Override
	public String fromDomainToValue(Consortium domain) {
		return domain.getNativeValue();
	}

	@Override
	public Consortium fromValueToDomain(String value) {
		return new CONSORTIUM(value);
	}

}
