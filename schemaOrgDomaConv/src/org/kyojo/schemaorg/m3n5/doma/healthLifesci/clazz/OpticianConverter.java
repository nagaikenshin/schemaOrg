package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.OPTICIAN;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Optician;

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
