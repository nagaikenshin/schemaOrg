package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RESIDENCE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Residence;

@ExternalDomain
public class ResidenceConverter implements DomainConverter<Residence, String> {

	@Override
	public String fromDomainToValue(Residence domain) {
		return domain.getNativeValue();
	}

	@Override
	public Residence fromValueToDomain(String value) {
		return new RESIDENCE(value);
	}

}