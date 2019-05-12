package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MUSCLE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Muscle;

@ExternalDomain
public class MuscleConverter implements DomainConverter<Muscle, String> {

	@Override
	public String fromDomainToValue(Muscle domain) {
		return domain.getNativeValue();
	}

	@Override
	public Muscle fromValueToDomain(String value) {
		return new MUSCLE(value);
	}

}
