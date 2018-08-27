package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.OCCUPATION;
import org.kyojo.schemaorg.m3n4.pending.Clazz.Occupation;

@ExternalDomain
public class OccupationConverter implements DomainConverter<Occupation, String> {

	@Override
	public String fromDomainToValue(Occupation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Occupation fromValueToDomain(String value) {
		return new OCCUPATION(value);
	}

}
