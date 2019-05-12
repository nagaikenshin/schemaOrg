package org.kyojo.schemaorg.m3n5.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.auto.impl.WHEELBASE;
import org.kyojo.schemaorg.m3n5.auto.Container.Wheelbase;

@ExternalDomain
public class WheelbaseConverter implements DomainConverter<Wheelbase, String> {

	@Override
	public String fromDomainToValue(Wheelbase domain) {
		return domain.getNativeValue();
	}

	@Override
	public Wheelbase fromValueToDomain(String value) {
		return new WHEELBASE(value);
	}

}
