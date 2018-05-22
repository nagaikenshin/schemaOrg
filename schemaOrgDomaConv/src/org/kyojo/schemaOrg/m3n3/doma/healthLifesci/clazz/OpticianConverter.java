package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.OPTICIAN;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.Optician;

@ExternalDomain
public class OpticianConverter implements DomainConverter<Optician, String> {

	@Override
	public String fromDomainToValue(Optician domain) {
		return domain.getNativeValue();
	}

	@Override
	public Optician fromValueToDomain(String value) {
		return new OPTICIAN(value);
	}

}
