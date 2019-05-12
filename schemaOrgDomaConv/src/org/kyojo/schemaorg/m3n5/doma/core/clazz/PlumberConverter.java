package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PLUMBER;
import org.kyojo.schemaorg.m3n5.core.Clazz.Plumber;

@ExternalDomain
public class PlumberConverter implements DomainConverter<Plumber, String> {

	@Override
	public String fromDomainToValue(Plumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public Plumber fromValueToDomain(String value) {
		return new PLUMBER(value);
	}

}