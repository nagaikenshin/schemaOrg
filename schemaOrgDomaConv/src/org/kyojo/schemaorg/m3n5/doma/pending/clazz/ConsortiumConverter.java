package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CONSORTIUM;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Consortium;

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
