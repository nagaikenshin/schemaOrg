package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ELECTRICIAN;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Electrician;

@ExternalDomain
public class ElectricianConverter implements DomainConverter<Electrician, String> {

	@Override
	public String fromDomainToValue(Electrician domain) {
		return domain.getNativeValue();
	}

	@Override
	public Electrician fromValueToDomain(String value) {
		return new ELECTRICIAN(value);
	}

}
