package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PHYSICIAN;
import org.kyojo.schemaorg.m3n5.core.Clazz.Physician;

@ExternalDomain
public class PhysicianConverter implements DomainConverter<Physician, String> {

	@Override
	public String fromDomainToValue(Physician domain) {
		return domain.getNativeValue();
	}

	@Override
	public Physician fromValueToDomain(String value) {
		return new PHYSICIAN(value);
	}

}
